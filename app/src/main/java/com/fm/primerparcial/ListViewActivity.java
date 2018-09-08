package com.fm.primerparcial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity
{
    public ListView lstStsPassive;
    public Toolbar myToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        // Creo el adaptador para el listView
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.STS_pasivos, android.R.layout.simple_list_item_1);

        // Referencio views
        lstStsPassive = findViewById(R.id.lstSTS);
        myToolbar = findViewById(R.id.toolbar);

        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        // Cargo el adaptador al listView
        lstStsPassive.setAdapter(adapter);

        lstStsPassive.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                switch (parent.getItemAtPosition(position).toString())
                {
                    case "Coax 12":
                        Toast.makeText(getApplicationContext(), "Coax 12", Toast.LENGTH_LONG).show();
                        break;
                    case "Coax 15":
                        Toast.makeText(getApplicationContext(), "Coax 15", Toast.LENGTH_LONG).show();
                        break;
                    case "Cantata":
                        Toast.makeText(getApplicationContext(), "Cantata", Toast.LENGTH_LONG).show();
                        break;
                    case "Sonata":
                        Toast.makeText(getApplicationContext(), "Sonata", Toast.LENGTH_LONG).show();
                        break;
                    case "Concerto TOP":
                        Toast.makeText(getApplicationContext(), "Concerto TOP", Toast.LENGTH_LONG).show();
                        break;
                    case "Concerto miniSUB":
                        Toast.makeText(getApplicationContext(), "Concerto miniSUB", Toast.LENGTH_LONG).show();
                        break;
                    case "Concerto SUB":
                        Toast.makeText(getApplicationContext(), "Concerto SUB", Toast.LENGTH_LONG).show();
                        break;
                    case "Concerto infraSUB":
                        Toast.makeText(getApplicationContext(), "Concerto infraSUB", Toast.LENGTH_LONG).show();
                        break;
                    case "Linea V5":
                        Toast.makeText(getApplicationContext(), "Linea V5", Toast.LENGTH_LONG).show();
                        break;
                    case "Linea V10":
                        Toast.makeText(getApplicationContext(), "Linea V10", Toast.LENGTH_LONG).show();
                        break;
                    case "Linea V10i":
                        Toast.makeText(getApplicationContext(), "Linea V10i", Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
        myToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener()
        {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem)
            {
                switch (menuItem.getItemId())
                {
                    case R.id.tlb_settings:
                        startActivity(new Intent(ListViewActivity.this, SettingsActivity.class));
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }
}
