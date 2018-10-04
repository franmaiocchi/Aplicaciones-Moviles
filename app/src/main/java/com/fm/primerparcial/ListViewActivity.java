package com.fm.primerparcial;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
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

import com.shashank.sony.fancydialoglib.Animation;
import com.shashank.sony.fancydialoglib.FancyAlertDialog;
import com.shashank.sony.fancydialoglib.FancyAlertDialogListener;
import com.shashank.sony.fancydialoglib.Icon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.fm.primerparcial.STSSQLiteHelper.DATABASE_NAME;

public class ListViewActivity extends AppCompatActivity
{
    public Toolbar myToolbar;
    ListView listView;
    public static SQLiteDatabase db;
    public FloatingActionButton btnFloating;
    private AdaptadorArticulos adaptador;

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
        adaptador = new AdaptadorArticulos(this, listViewItems);

        // Cargo el adaptador al listView
        listView.setAdapter(adaptador);

        // Asocio el menu contextual al listview
        registerForContextMenu(listView);

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
                Intent intent = new Intent(ListViewActivity.this, AddArticuloActivity.class);
                intent.putExtra("MODELO", "@@##$$%%&&//(())==qk");
                startActivity(intent);
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
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)menuInfo;
        menu.setHeaderTitle(((Articulo) listView.getItemAtPosition(info.position)).getArticulo());
        inflater.inflate(R.menu.menu_ctx_list, menu);
    }
    @Override
    public boolean onContextItemSelected(final MenuItem item)
    {
        final AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.ctxModificar:
                Intent intent = new Intent(ListViewActivity.this, AddArticuloActivity.class);
                intent.putExtra("MODELO", ((Articulo)listView.getItemAtPosition(info.position)).getArticulo());
                startActivity(intent);
                return true;
            case R.id.ctxEliminar:
                new FancyAlertDialog.Builder(this)
                        .setTitle(((Articulo)listView.getItemAtPosition(info.position)).getArticulo())
                        .setBackgroundColor(Color.parseColor("#EB2229"))  //Don't pass R.color.colorvalue
                        .setMessage("¿Esta seguro que quiere eliminarlo?")
                        .setNegativeBtnText("Cancelar")
                        .setPositiveBtnBackground(Color.parseColor("#EB2229"))  //Don't pass R.color.colorvalue
                        .setPositiveBtnText("Eliminar")
                        .setNegativeBtnBackground(Color.parseColor("#FFA9A7A8"))  //Don't pass R.color.colorvalue
                        .setAnimation(Animation.POP)
                        .isCancellable(true)
                        .setIcon(R.drawable.ic_delete_white,Icon.Visible)
                        .OnPositiveClicked(new FancyAlertDialogListener() {
                            @Override
                            public void OnClick()
                            {
                                // Lo borro de la base
                                String selection = DBStructure.Table_Productos.COLUMN_NAME_MODELO + " LIKE ?";
                                String[] selectionArgs = {((Articulo)listView.getItemAtPosition(info.position)).getArticulo()};
                                db.delete(DBStructure.Table_Productos.TABLE_NAME, selection, selectionArgs);
                                Toast.makeText(getApplicationContext(),((Articulo)listView.getItemAtPosition(info.position)).getArticulo() + " eliminado",Toast.LENGTH_SHORT).show();
                                // Lo borro del adaptador
                                adaptador.remove((Articulo) listView.getItemAtPosition(info.position));
                            }
                        })
                        .OnNegativeClicked(new FancyAlertDialogListener() {
                            @Override
                            public void OnClick()
                            {
                                Toast.makeText(getApplicationContext(),"Eliminación cancelada",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .build();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
    public static SQLiteDatabase getDb()
    {
        return db;
    }
}
