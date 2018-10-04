package com.fm.primerparcial;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddArticuloActivity extends AppCompatActivity
{
    public EditText txtModelo;
    public EditText txtDescripcion;
    public EditText txtTipo;
    public EditText txtRespuestaEnFrecuencia;
    public EditText txtParlantes;
    public EditText txtSensibilidad;
    public EditText txtCapacidadDePotencia;
    public EditText txtImpedancia;
    public EditText txtGabinete;
    public EditText txtTerminacion;
    public EditText txtRejaDeProteccion;
    public EditText txtAnclajes;
    public EditText txtConectores;
    public EditText txtDimensiones;
    public EditText txtPeso;
    public Button btnAniadir;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_articulo);

        txtModelo = findViewById(R.id.txtModelo);
        txtDescripcion = findViewById(R.id.txtDescripcion);
        txtTipo = findViewById(R.id.txtTipo);
        txtRespuestaEnFrecuencia = findViewById(R.id.txtRespuestaEnFrecuencia);
        txtParlantes = findViewById(R.id.txtParlantes);
        txtSensibilidad = findViewById(R.id.txtSensibilidad);
        txtCapacidadDePotencia = findViewById(R.id.txtCapacidadDePotencia);
        txtImpedancia = findViewById(R.id.txtImpedancia);
        txtGabinete = findViewById(R.id.txtGabinete);
        txtTerminacion = findViewById(R.id.txtTerminacion);
        txtRejaDeProteccion = findViewById(R.id.txtRejaDeProteccion);
        txtAnclajes = findViewById(R.id.txtAnclajes);
        txtConectores = findViewById(R.id.txtConectores);
        txtDimensiones = findViewById(R.id.txtDimensiones);
        txtPeso = findViewById(R.id.txtPeso);
        btnAniadir = findViewById(R.id.btnAniadir);

        Intent intent = getIntent();
        final String modelo = intent.getExtras().getString("MODELO");
        if (modelo.equals("@@##$$%%&&//(())==qk"))
        {

        }
        else
        {
            btnAniadir.setText("Modificar");
            // Columnas que quiero traer
            String[] projection = new String[]{
                    DBStructure.Table_Productos.COLUMN_NAME_MODELO,
                    DBStructure.Table_Productos.COLUMN_NAME_DESCRIPCION,
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

            Cursor cursor = ListViewActivity.getDb().query(
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
                txtModelo.setText(cursor.getString(0));
                txtDescripcion.setText(cursor.getString(1));
                txtTipo.setText(cursor.getString(2));
                txtRespuestaEnFrecuencia.setText(cursor.getString(3));
                txtParlantes.setText(cursor.getString(4));
                txtSensibilidad.setText(cursor.getString(5));
                txtCapacidadDePotencia.setText(cursor.getString(6));
                txtImpedancia.setText(cursor.getString(7));
                txtGabinete.setText(cursor.getString(8));
                txtTerminacion.setText(cursor.getString(9));
                txtRejaDeProteccion.setText(cursor.getString(10));
                txtAnclajes.setText(cursor.getString(11));
                txtConectores.setText(cursor.getString(12));
                txtDimensiones.setText(cursor.getString(13));
                txtPeso.setText(cursor.getString(14));
            }
        }

        btnAniadir.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // Creo el contendedor para insertar los datos a cada tabla
                ContentValues values = new ContentValues();

                values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, txtModelo.getText().toString());
                values.put(DBStructure.Table_Productos.COLUMN_NAME_DESCRIPCION, txtDescripcion.getText().toString());
                values.put(DBStructure.Table_Productos.COLUMN_NAME_TIPO, txtTipo.getText().toString());
                values.put(DBStructure.Table_Productos.COLUMN_NAME_RESPUESTA_EN_FRECUENCIA, txtRespuestaEnFrecuencia.getText().toString());
                values.put(DBStructure.Table_Productos.COLUMN_NAME_PARLANTES, txtParlantes.getText().toString());
                values.put(DBStructure.Table_Productos.COLUMN_NAME_SENSIBILIDAD, txtSensibilidad.getText().toString());
                values.put(DBStructure.Table_Productos.COLUMN_NAME_CAPACIDAD_DE_POTENCIA, txtCapacidadDePotencia.getText().toString());
                values.put(DBStructure.Table_Productos.COLUMN_NAME_IMPEDANCIA, txtImpedancia.getText().toString());
                values.put(DBStructure.Table_Productos.COLUMN_NAME_GABINETE, txtGabinete.getText().toString());
                values.put(DBStructure.Table_Productos.COLUMN_NAME_TERMINACION, txtGabinete.getText().toString());
                values.put(DBStructure.Table_Productos.COLUMN_NAME_REJA_DE_PROTECCION, txtRejaDeProteccion.getText().toString());
                values.put(DBStructure.Table_Productos.COLUMN_NAME_ANCLAJES, txtAnclajes.getText().toString());
                values.put(DBStructure.Table_Productos.COLUMN_NAME_CONECTORES, txtConectores.getText().toString());
                values.put(DBStructure.Table_Productos.COLUMN_NAME_DIMENSIONES, txtDimensiones.getText().toString());
                values.put(DBStructure.Table_Productos.COLUMN_NAME_PESO, txtPeso.getText().toString());

                if (modelo.equals("@@##$$%%&&//(())==qk"))
                {
                    values.put(DBStructure.Table_Productos.COLUMN_NAME_IMAGEN, R.drawable.sts);
                    values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_sts);
                    ListViewActivity.getDb().insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
                }
                else
                {
                    String selection = DBStructure.Table_Productos.COLUMN_NAME_MODELO + " = ?";
                    String[] selectionArgs = {modelo};
                    ListViewActivity.getDb().update(DBStructure.Table_Productos.TABLE_NAME, values, selection, selectionArgs);
                }
                startActivity(new Intent(AddArticuloActivity.this, ListViewActivity.class));
            }
        });
    }
}
