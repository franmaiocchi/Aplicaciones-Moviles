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


    // Clase interna para definir la tabla
    public static class Table_Productos implements BaseColumns
    {
        public static final String TABLE_NAME = "Productos";
        public static final String COLUMN_NAME_MODELO = "modelo";
        public static final String COLUMN_NAME_ICON = "icono";
        public static final String COLUMN_NAME_IMAGEN = "imagen";
        public static final String COLUMN_NAME_DESCRIPCION = "descripcion";
        public static final String COLUMN_NAME_TIPO = "tipo";
        public static final String COLUMN_NAME_RESPUESTA_EN_FRECUENCIA = "resp";
        public static final String COLUMN_NAME_PARLANTES = "parlantes";
        public static final String COLUMN_NAME_SENSIBILIDAD = "sensibilidad";
        public static final String COLUMN_NAME_CAPACIDAD_DE_POTENCIA = "potencia";
        public static final String COLUMN_NAME_IMPEDANCIA = "impedancia";
        public static final String COLUMN_NAME_GABINETE = "gabinete";
        public static final String COLUMN_NAME_TERMINACION = "terminacion";
        public static final String COLUMN_NAME_REJA_DE_PROTECCION = "reja";
        public static final String COLUMN_NAME_ANCLAJES = "anclaje";
        public static final String COLUMN_NAME_CONECTORES = "conectores";
        public static final String COLUMN_NAME_DIMENSIONES = "dimensiones";
        public static final String COLUMN_NAME_PESO = "peso";

        public static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        COLUMN_NAME_MODELO + " TEXT," +
                        COLUMN_NAME_ICON + " INTEGER," +
                        COLUMN_NAME_IMAGEN + " INTEGER," +
                        COLUMN_NAME_DESCRIPCION + " TEXT," +
                        COLUMN_NAME_TIPO + " TEXT," +
                        COLUMN_NAME_RESPUESTA_EN_FRECUENCIA + " TEXT," +
                        COLUMN_NAME_PARLANTES + " TEXT," +
                        COLUMN_NAME_SENSIBILIDAD + " TEXT," +
                        COLUMN_NAME_CAPACIDAD_DE_POTENCIA + " TEXT," +
                        COLUMN_NAME_IMPEDANCIA + " TEXT," +
                        COLUMN_NAME_GABINETE + " TEXT," +
                        COLUMN_NAME_TERMINACION + " TEXT," +
                        COLUMN_NAME_REJA_DE_PROTECCION + " TEXT," +
                        COLUMN_NAME_ANCLAJES + " TEXT," +
                        COLUMN_NAME_CONECTORES + " TEXT," +
                        COLUMN_NAME_DIMENSIONES + " TEXT," +
                        COLUMN_NAME_PESO + " TEXT)";

        public static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + TABLE_NAME;
    }
}
