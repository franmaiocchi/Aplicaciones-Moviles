package com.fm.primerparcial;

/*
Esta clase define la estructura de la base de datos de forma que quede autodocumentada.
Contiene constantes con los nombres de tabla, columna, etc
Una buena practica es definir las constantes globales de la tabla en la clase raiz y definir
una clase interna por cada tabla y ahi definir las constantes especificas.
 */

import android.provider.BaseColumns;

public class DBStructure
{
    // Constructor
    private DBStructure() {}

    // Clase interna para definir la primer tabla
    public static class Table_Familias implements BaseColumns
    {
        public static final String TABLE_NAME = "familias";
        public static final String COLUMN_NAME_NOMBRE = "nombre";

        public static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        COLUMN_NAME_NOMBRE + " TEXT)";

        public static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + TABLE_NAME;
    }

    // Clase interna para definir la segunda tabla
    public static class Table_Productos implements BaseColumns
    {
        public static final String TABLE_NAME = "Productos";
        public static final String COLUMN_NAME_MODELO = "modelo";
        public static final String COLUMN_NAME_PADRE = "padre";
        public static final String COLUMN_NAME_ICON = "icono";

        public static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        COLUMN_NAME_MODELO + " TEXT," +
                        COLUMN_NAME_PADRE + " TEXT," +
                        COLUMN_NAME_ICON + " INTEGER)";

        public static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + TABLE_NAME;
    }
}
