package com.fm.primerparcial;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.fm.primerparcial.STSSQLiteHelper.DATABASE_NAME;

public class ListViewActivity extends AppCompatActivity
{
    public Toolbar myToolbar;
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    HashMap<String, List<Integer>> icons;
    public SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        // Referencio views
        expListView = findViewById(R.id.lstSTS);
        myToolbar = findViewById(R.id.toolbar);

        // Seteo la toolbar
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        // Bajo de la base los datos para la expandable listview
        prepareListData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild, icons);

        // Cargo el adaptador al listView
        expListView.setAdapter(listAdapter);

        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener()
        {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id)
            {
                Toast.makeText(getApplicationContext(), listDataHeader.get(groupPosition) + " : " + listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition), Toast.LENGTH_SHORT).show();
                return false;
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

    private void prepareListData()
    {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
        icons = new HashMap<String, List<Integer>>();

        //Abrimos la base de datos 'DBUsuarios' en modo escritura
        STSSQLiteHelper helper = new STSSQLiteHelper(this);

        db = helper.getWritableDatabase();
        // Columnas que quiero traer
        String[] projection = new String[]{DBStructure.Table_Familias.COLUMN_NAME_NOMBRE};

        Cursor cursor = db.query(DBStructure.Table_Familias.TABLE_NAME, projection, null, null, null, null, null);

        if(cursor.moveToFirst())
        {
            do
            {
                listDataHeader.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }
        // Columnas que quiero traer
        projection = new String[] {DBStructure.Table_Productos.COLUMN_NAME_MODELO, DBStructure.Table_Productos.COLUMN_NAME_PADRE, DBStructure.Table_Productos.COLUMN_NAME_ICON};
        // Columnas a evaluar
        String selection = DBStructure.Table_Productos.COLUMN_NAME_PADRE + " = ?";

        for (int i = 0; i < listDataHeader.size(); i++)
        {
            String[] selectionArgs = {listDataHeader.get(i)};
            cursor = db.query(DBStructure.Table_Productos.TABLE_NAME, projection, selection, selectionArgs, null, null, null);
            if (cursor.moveToFirst())
            {
                List<String> aux_modelo = new ArrayList<String>();
                List<Integer> aux_icons = new ArrayList<Integer>();
                do
                {
                    aux_modelo.add(cursor.getString(0));
                    aux_icons.add(cursor.getInt(2));
                } while (cursor.moveToNext());
                listDataChild.put(listDataHeader.get(i), aux_modelo);
                icons.put(listDataHeader.get(i), aux_icons);
            }
        }

    }

//    private void prepareListData_2()
//    {
//        listDataHeader = new ArrayList<String>();
//        listDataChild = new HashMap<String, List<String>>();
//        icons = new HashMap<String, List<Integer>>();
//
//        // Adding child data
//        listDataHeader.add("Monitores");
//        listDataHeader.add("Point Source");
//        listDataHeader.add("Subwoofer");
//        listDataHeader.add("Line Array");
//
//        // Adding child data
//        List<String> Monitores = new ArrayList<String>();
//        List<Integer> Monitores_icons = new ArrayList<Integer>();
//        Monitores.add("Coax 12");
//        Monitores_icons.add(R.mipmap.ic_coax12);
//        Monitores.add("Coax 15");
//        Monitores_icons.add(R.mipmap.ic_coax15);
//
//
//        List<String> PointSource = new ArrayList<String>();
//        List<Integer> PointSource_icons = new ArrayList<Integer>();
//        PointSource.add("Cantata");
//        PointSource_icons.add(R.mipmap.ic_cantata);
//        PointSource.add("Sonata");
//        PointSource_icons.add(R.mipmap.ic_sonata);
//        PointSource.add("Concerto TOP");
//        PointSource_icons.add(R.mipmap.ic_contop);
//
//
//        List<String> Subwoofer = new ArrayList<String>();
//        List<Integer> Subwoofer_icons = new ArrayList<Integer>();
//        Subwoofer.add("Concerto miniSUB");
//        Subwoofer_icons.add(R.mipmap.ic_mini);
//        Subwoofer.add("Concerto SUB");
//        Subwoofer_icons.add(R.mipmap.ic_consub);
//        Subwoofer.add("Concerto infraSUB");
//        Subwoofer_icons.add(R.mipmap.ic_infra);
//
//        List<String> LineArray = new ArrayList<String>();
//        List<Integer> LineArray_icons = new ArrayList<Integer>();
//        LineArray.add("Linea V5");
//        LineArray_icons.add(R.mipmap.ic_v5);
//        LineArray.add("Linea V10");
//        LineArray_icons.add(R.mipmap.ic_v10);
//        LineArray.add("Linea V10i");
//        LineArray_icons.add(R.mipmap.ic_v10i);
//
//        listDataChild.put(listDataHeader.get(0), Monitores); // Header, Child data
//        listDataChild.put(listDataHeader.get(1), PointSource);
//        listDataChild.put(listDataHeader.get(2), Subwoofer);
//        listDataChild.put(listDataHeader.get(3), LineArray);
//
//        icons.put(listDataHeader.get(0), Monitores_icons);
//        icons.put(listDataHeader.get(1), PointSource_icons);
//        icons.put(listDataHeader.get(2), Subwoofer_icons);
//        icons.put(listDataHeader.get(3), LineArray_icons);
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }
}
