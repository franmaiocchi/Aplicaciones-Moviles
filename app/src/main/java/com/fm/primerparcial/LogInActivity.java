package com.fm.primerparcial;

import android.content.Intent;
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

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        // Referencio los views
        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (txtUsername.getText().toString().equals("admin") && txtPassword.getText().toString().equals("admin"))
                {
                    Intent LogInIntent = new Intent(LogInActivity.this, ListViewActivity.class);
                    startActivity(LogInIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Usuario o password incorrecta", Toast.LENGTH_LONG).show();
            }
        });


    }
}
