package com.fm.primerparcial;

import android.content.ContentValues;
import android.content.Intent;
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

        btnAniadir.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (txtModelo.getText().equals(""))
                {
                    Toast.makeText(AddArticuloActivity.this, "Complete el campo modelo", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    // Creo el contendedor para insertar los datos a cada tabla
                    ContentValues values = new ContentValues();

                    //Abrimos la base de datos 'DBUsuarios' en modo escritura
                    STSSQLiteHelper helper = new STSSQLiteHelper(v.getContext());

                    SQLiteDatabase db = helper.getWritableDatabase();

                    values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, txtModelo.getText().toString());
                    values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_sts);
                    values.put(DBStructure.Table_Productos.COLUMN_NAME_IMAGEN, R.drawable.sts);
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
                    db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);

                    startActivity(new Intent(AddArticuloActivity.this, ListViewActivity.class));
                }
            }
        });
    }
}
