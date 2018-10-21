package com.fm.primerparcial;


import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DescriptionFragment extends Fragment
{
    private TextView lblDescripcion;
    private ImageView imgModelo;

    public static DescriptionFragment newInstance()
    {
        DescriptionFragment newFragment = new DescriptionFragment();
        return newFragment;
    }
    public DescriptionFragment()
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
        View v = inflater.inflate(R.layout.fragment_description, container, false);
        String modelo = getArguments().getString("MODELO");


        lblDescripcion = v.findViewById(R.id.lblDescripcion);
        imgModelo = v.findViewById(R.id.imageView3);

        // Columnas que quiero traer
        String[] projection = new String[]{
                DBStructure.Table_Productos.COLUMN_NAME_MODELO,
                DBStructure.Table_Productos.COLUMN_NAME_IMAGEN,
                DBStructure.Table_Productos.COLUMN_NAME_DESCRIPCION};
        String selection = DBStructure.Table_Productos.COLUMN_NAME_MODELO + " = ?";
        String[] selectionArgs = {modelo};

        Cursor cursor = SplashActivity.getDb().query(
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
            imgModelo.setImageResource(cursor.getInt(1));
            lblDescripcion.setText(cursor.getString(2));
        }
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(getActivity());
        setTextAppearence(v,
                sharedPref.getBoolean("bold", false),
                Color.parseColor(sharedPref.getString("color", "#000000")),
                Float.parseFloat(sharedPref.getString("tamanio", "18")));

        return v;
    }
    private void setTextAppearence(final View v, boolean bold, int color, float size)
    {
        try
        {
            if (v instanceof ViewGroup)
            {
                ViewGroup vg = (ViewGroup) v;
                for (int i = 0; i < vg.getChildCount(); i++)
                {
                    View child = vg.getChildAt(i);
                    setTextAppearence(child, bold, color, size);
                }
            }
            else if (v instanceof TextView )
            {
                if (bold == true)
                {
                    ((TextView) v).setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
                }
                ((TextView) v).setTextColor(color);
                ((TextView) v).setTextSize(TypedValue.COMPLEX_UNIT_SP, size);
            }
        }
        catch (Exception e)
        {
        }
    }
}
