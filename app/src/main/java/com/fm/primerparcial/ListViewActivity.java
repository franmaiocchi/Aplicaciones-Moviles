package com.fm.primerparcial;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.fm.primerparcial.STSSQLiteHelper.DATABASE_NAME;

public class ListViewActivity extends AppCompatActivity
{
    public Toolbar myToolbar;
    ListView listView;
    public SQLiteDatabase db;
    public FloatingActionButton btnFloating;

    List<Articulo> listViewItems;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        // Referencio views
        listView = findViewById(R.id.lstSTS);
        myToolbar = findViewById(R.id.toolbar);
        btnFloating = findViewById(R.id.btnFloating);

        // Cambio el color del boton
        btnFloating.setBackgroundColor(getResources().getColor(R.color.stsPDark));

        // Seteo la toolbar
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        // Bajo de la base los datos para la listview
        prepareListData();
        AdaptadorArticulos adaptador = new AdaptadorArticulos(this, listViewItems);

        // Cargo el adaptador al listView
        listView.setAdapter(adaptador);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent intent = new Intent(ListViewActivity.this, DetailActivity.class);
                intent.putExtra("MODELO", ((Articulo)parent.getItemAtPosition(position)).getArticulo());
                startActivity(intent);
                //Toast.makeText(getApplicationContext(), ((Articulo)parent.getItemAtPosition(position)).getArticulo(), Toast.LENGTH_SHORT).show();
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
                    case R.id.tlb_add:
                        Toast.makeText(ListViewActivity.this, "Aprete el boton add", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

        btnFloating.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            }
        });
    }

    private void prepareListData()
    {
        listViewItems = new ArrayList<Articulo>();

        //Abrimos la base de datos 'DBUsuarios' en modo escritura
        STSSQLiteHelper helper = new STSSQLiteHelper(this);

        db = helper.getWritableDatabase();
        // Columnas que quiero traer
        String[] projection = new String[]{DBStructure.Table_Productos.COLUMN_NAME_MODELO, DBStructure.Table_Productos.COLUMN_NAME_ICON};

        Cursor cursor = db.query(DBStructure.Table_Productos.TABLE_NAME, projection, null, null, null, null, null);
        if(cursor.moveToFirst())
        {
            do
            {
                Articulo aux = new Articulo(cursor.getString(0), cursor.getInt(1));
                listViewItems.add(aux);
            } while (cursor.moveToNext());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }
    class AdaptadorArticulos extends ArrayAdapter<Articulo>
    {
        private List<Articulo> _datos;
        public AdaptadorArticulos(Context context, List<Articulo> datos)
        {
            super(context, R.layout.list_item, datos);
            this._datos = datos;
        }

        public View getView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            View v = inflater.inflate(R.layout.list_item, null);
            final int icon = (int)this._datos.get(position).getIcon();
            TextView lblNombre = (TextView)v.findViewById(R.id.lblListItem);
            lblNombre.setText(this._datos.get(position).getArticulo());
            lblNombre.setCompoundDrawablesWithIntrinsicBounds(icon, 0, 0, 0);
            return(v);
        }
    }
}
