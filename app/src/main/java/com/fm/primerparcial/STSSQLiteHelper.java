package com.fm.primerparcial;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class STSSQLiteHelper extends SQLiteOpenHelper
{
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "STS.db";

    public STSSQLiteHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        // Creo el contendedor para insertar los datos a cada tabla
        ContentValues values = new ContentValues();

        // Creo la primer tabla
        db.execSQL(DBStructure.Table_Familias.SQL_CREATE_ENTRIES);

        // Lleno la primer tabla con los productos base
        values.put(DBStructure.Table_Familias.COLUMN_NAME_NOMBRE, "Monitores");
        db.insert(DBStructure.Table_Familias.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Familias.COLUMN_NAME_NOMBRE, "Point Source");
        db.insert(DBStructure.Table_Familias.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Familias.COLUMN_NAME_NOMBRE, "Subwoofers");
        db.insert(DBStructure.Table_Familias.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Familias.COLUMN_NAME_NOMBRE, "Line Array");
        db.insert(DBStructure.Table_Familias.TABLE_NAME, null, values);
        values.clear();

        // Creo la primer tabla
        db.execSQL(DBStructure.Table_Productos.SQL_CREATE_ENTRIES);

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Coax 12");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PADRE, "Monitores");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_coax12);
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Coax 15");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PADRE, "Monitores");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_coax15);
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Sonata");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PADRE, "Point Source");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_sonata);
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Cantata");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PADRE, "Point Source");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_sonata);
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Concerto TOP");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PADRE, "Point Source");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_contop);
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Concerto miniSUB");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PADRE, "Subwoofers");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_mini);
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Concerto SUB");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PADRE, "Subwoofers");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_consub);
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Concerto infraSUB");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PADRE, "Subwoofers");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_infra);
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Linea V5");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PADRE, "Line Array");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_v5);
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Linea V10");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PADRE, "Line Array");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_v10);
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Linea V10i");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PADRE, "Line Array");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_v10i);
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }
}
