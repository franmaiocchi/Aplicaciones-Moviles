package com.fm.primerparcial;


import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TechSpecsFragment extends Fragment
{
    private TextView lblTipo;
    private TextView lblRespuestaEnFrecuencia;
    private TextView lblParlantes;
    private TextView lblSensibilidad;
    private TextView lblCapacidadDePotencia;
    private TextView lblImpedancia;
    private TextView lblGabinete;
    private TextView lblTerminacion;
    private TextView lblRejaDeProteccion;
    private TextView lblAnclajes;
    private TextView lblConectores;
    private TextView lblDimensiones;
    private TextView lblPeso;

    public static TechSpecsFragment newInstance()
    {
        TechSpecsFragment newFragment = new TechSpecsFragment();
        return newFragment;
    }
    public TechSpecsFragment()
    {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tech_specs, container, false);
        String modelo = getArguments().getString("MODELO");

        // Obtengo las referencias
        lblTipo = v.findViewById(R.id.lblTipo);
        lblRespuestaEnFrecuencia = v.findViewById(R.id.lblRespuestaEnFrecuencia);
        lblParlantes = v.findViewById(R.id.lblParlantes);
        lblSensibilidad = v.findViewById(R.id.lblSensibilidad);
        lblCapacidadDePotencia = v.findViewById(R.id.lblCapacidadDePotencia);
        lblImpedancia = v.findViewById(R.id.lblImpedancia);
        lblGabinete = v.findViewById(R.id.lblGabinete);
        lblTerminacion = v.findViewById(R.id.lblTerminacion);
        lblRejaDeProteccion = v.findViewById(R.id.lblRejaDeProteccion);
        lblAnclajes = v.findViewById(R.id.lblAnclajes);
        lblConectores = v.findViewById(R.id.lblConectores);
        lblDimensiones = v.findViewById(R.id.lblDimensiones);
        lblPeso = v.findViewById(R.id.lblPeso);

        //Abrimos la base de datos 'DBUsuarios' en modo escritura
        STSSQLiteHelper helper = new STSSQLiteHelper(getContext());

        SQLiteDatabase db = helper.getWritableDatabase();
        // Columnas que quiero traer
        String[] projection = new String[]{
                DBStructure.Table_Productos.COLUMN_NAME_MODELO,
                DBStructure.Table_Productos.COLUMN_NAME_TIPO,
                DBStructure.Table_Productos.COLUMN_NAME_RESPUESTA_EN_FRECUENCIA,
                DBStructure.Table_Productos.COLUMN_NAME_PARLANTES,
                DBStructure.Table_Productos.COLUMN_NAME_SENSIBILIDAD,
                DBStructure.Table_Productos.COLUMN_NAME_CAPACIDAD_DE_POTENCIA,
                DBStructure.Table_Productos.COLUMN_NAME_IMPEDANCIA,
                DBStructure.Table_Productos.COLUMN_NAME_GABINETE,
                DBStructure.Table_Productos.COLUMN_NAME_TERMINACION,
                DBStructure.Table_Productos.COLUMN_NAME_REJA_DE_PROTECCION,
                DBStructure.Table_Productos.COLUMN_NAME_ANCLAJES,
                DBStructure.Table_Productos.COLUMN_NAME_CONECTORES,
                DBStructure.Table_Productos.COLUMN_NAME_DIMENSIONES,
                DBStructure.Table_Productos.COLUMN_NAME_PESO};
        String selection = DBStructure.Table_Productos.COLUMN_NAME_MODELO + " = ?";
        String[] selectionArgs = {modelo};

        Cursor cursor = db.query(
                DBStructure.Table_Productos.TABLE_NAME,   // The table to query
                projection,             // The array of columns to return (pass null to get all)
                selection,              // The columns for the WHERE clause
                selectionArgs,          // The values for the WHERE clause
                null,                   // don't group the rows
                null,                   // don't filter by row groups
                null               // The sort order
        );
        if(cursor.moveToFirst())
        {
            lblTipo.setText(cursor.getString(1));
            lblRespuestaEnFrecuencia.setText(cursor.getString(2));
            lblParlantes.setText(cursor.getString(3));
            lblSensibilidad.setText(cursor.getString(4));
            lblCapacidadDePotencia.setText(cursor.getString(5));
            lblImpedancia.setText(cursor.getString(6));
            lblGabinete.setText(cursor.getString(7));
            lblTerminacion.setText(cursor.getString(8));
            lblRejaDeProteccion.setText(cursor.getString(9));
            lblAnclajes.setText(cursor.getString(10));
            lblConectores.setText(cursor.getString(11));
            lblDimensiones.setText(cursor.getString(12));
            lblPeso.setText(cursor.getString(13));
        }
        return v;
    }
}
