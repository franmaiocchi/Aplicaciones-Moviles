package com.fm.primerparcial;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogInActivity extends AppCompatActivity
{
    public EditText txtUsername;
    public EditText txtPassword;
    public Button btnLogin;
    public Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        // Referencio los views
        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // Columnas que quiero traer
                String[] projection = new String[]{DBStructure.Table_Usuarios.COLUMN_NAME_USUARIO, DBStructure.Table_Usuarios.COLUMN_NAME_CONTRASEÑA};
                String selection = DBStructure.Table_Usuarios.COLUMN_NAME_USUARIO + " LIKE ?";
                String[] selectionArgs = {txtUsername.getText().toString()};
                Cursor cursor = SplashActivity.getDb().query(DBStructure.Table_Usuarios.TABLE_NAME, projection, selection, selectionArgs, null, null, null);
                if(cursor.moveToFirst())
                {
                    if (txtPassword.getText().toString().equals(cursor.getString(1)))
                    {
                        Intent LogInIntent = new Intent(LogInActivity.this, ListViewActivity.class);
                        startActivity(LogInIntent);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "Contraseña incorrecta", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Usuario incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // Columnas que quiero traer
                String[] projection = new String[]{DBStructure.Table_Usuarios.COLUMN_NAME_USUARIO, DBStructure.Table_Usuarios.COLUMN_NAME_CONTRASEÑA};
                String selection = DBStructure.Table_Usuarios.COLUMN_NAME_USUARIO + " LIKE ?";
                String[] selectionArgs = {txtUsername.getText().toString()};
                Cursor cursor = SplashActivity.getDb().query(DBStructure.Table_Usuarios.TABLE_NAME, projection, selection, selectionArgs, null, null, null);
                if(cursor.moveToFirst())
                {
                    Toast.makeText(getApplicationContext(), "Usuario ya registrado", Toast.LENGTH_SHORT).show();
                }
                else if (txtUsername.getText().toString().equals("") | txtPassword.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Debe completar ambos campos", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ContentValues values = new ContentValues();
                    values.put(DBStructure.Table_Usuarios.COLUMN_NAME_USUARIO, txtUsername.getText().toString());
                    values.put(DBStructure.Table_Usuarios.COLUMN_NAME_CONTRASEÑA, txtPassword.getText().toString());
                    SplashActivity.getDb().insert(DBStructure.Table_Usuarios.TABLE_NAME, null, values);
                    Toast.makeText(getApplicationContext(), "Usuario creado correctamente", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
