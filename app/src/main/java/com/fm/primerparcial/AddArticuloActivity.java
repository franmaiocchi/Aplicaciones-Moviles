package com.fm.primerparcial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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

            }
        });
    }
}
