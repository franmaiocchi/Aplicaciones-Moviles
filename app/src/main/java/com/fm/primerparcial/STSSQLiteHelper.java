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
        db.execSQL(DBStructure.Table_Productos.SQL_CREATE_ENTRIES);

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Coax12");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_coax12);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMAGEN, R.drawable.coax12);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DESCRIPCION, "El STS Coax12 es un sistema compacto y extremadamente eficiente, para la reproducción de la palabra y programa musical con altísima calidad, su respuesta es extremadamente plana, lo que lo hacen ideal para el monitoreo de escenario.\n" +
                "Su perfil bajo, su diseño y su tamaño compacto es ideal para ocupar el menor espacio posible en el escenario donde se lo utiliza, eliminando la obstrucción visual a los espectadores más cercanos, inconveniente típico de otros diseños.\n" +
                "Su conexionado frontal permite que el cableado del mismo sea aún más accesible y, a su vez, queda oculto a los ojos del público y de las cámaras de TV.");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TIPO, "Dos vías pasivas, Full Range");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_RESPUESTA_EN_FRECUENCIA, "68 Hz – 18 kHz +/- 3dB");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PARLANTES, "1 x 1,4″ driver / 1 x 12″ woofer en configuración coaxial");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_SENSIBILIDAD, "100 dB watt/metro");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CAPACIDAD_DE_POTENCIA, "700 W programa continuo");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMPEDANCIA, "8 ohm nominal");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_GABINETE, "Reflector de bajos, multi ángulo monitor, 30°, 60° o 90°");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TERMINACION, "Cubierta c/poliurea, texturada, azul-gris oscuro");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_REJA_DE_PROTECCION, "Negra, chapa hierro perforado");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ANCLAJES, "Vaso de 35 mm");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CONECTORES, "2 x Neutrik Speakon");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DIMENSIONES, "(Al) 380mm x (An) 380mm x (P) 495mm");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PESO, "15 kg");
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Coax15");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_coax15);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMAGEN, R.drawable.coax15);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DESCRIPCION, "El STS Coax15 es un sistema compacto y extremadamente eficiente, para la reproducción de la palabra y programa musical con altísima calidad, su respuesta es extremadamente plana, lo que lo hacen ideal para el monitoreo de escenario.\n" +
                "Su perfil bajo, su diseño y su tamaño compacto es ideal para ocupar el menor espacio posible en el escenario donde se lo utiliza, eliminando la obstrucción visual a los espectadores más cercanos, inconveniente típico de otros diseños.\n" +
                "Su conexionado frontal permite que el cableado del mismo sea aún más accesible y, a su vez, queda oculto a los ojos del público y de las cámaras de TV.");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TIPO, "Dos vías pasivas, Full Range");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_RESPUESTA_EN_FRECUENCIA, "55 Hz – 18 kHz +/- 3dB");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PARLANTES, "1 x 1,4″ driver / 1 x 15″ woofer en configuración coaxial");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_SENSIBILIDAD, "100 dB watt/metro");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CAPACIDAD_DE_POTENCIA, "700 W programa continuo");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMPEDANCIA, "8 ohm nominal");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_GABINETE, "Reflector de bajos, multi ángulo monitor, 30°, 60° o 90°");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TERMINACION, "Cubierta c/poliurea, texturada, azul-gris oscuro");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_REJA_DE_PROTECCION, "Negra, chapa hierro perforado");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ANCLAJES, "Vaso de 35 mm");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CONECTORES, "2 x Neutrik Speakon");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DIMENSIONES, "(Al) 380mm x (An) 380mm x (P) 495mm");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PESO, "15 kg");
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Sonata");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_sonata);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMAGEN, R.drawable.sonata);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DESCRIPCION, "El STS Sonata es un sistema compacto y extremadamente eficiente, para la reproducción de la palabra y programa musical con altísima calidad.\n" +
                "Los 24 puntos con roscas de ¼ para fijar herrería exterior permiten una gran variedad de métodos de montaje, permitiendo el acoplamiento entre cajas como así también el colgado de las mismas, en forma vertical u horizontal.\n" +
                "Como complemento para bajas frecuencias se recomienda el STS Concerto SUB, o el STS Concerto miniSUB.");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TIPO, "Dos vías pasivas, Full Range");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_RESPUESTA_EN_FRECUENCIA, "48 Hz – 18 kHz +/- 3dB");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PARLANTES, "1 x 1,4″ driver / 1 x 15″ woofer");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_SENSIBILIDAD, "100 dB watt/metro");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CAPACIDAD_DE_POTENCIA, "960 W programa continuo");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMPEDANCIA, "8 ohm nominal");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_GABINETE, "Reflector de bajos, trapezoidal multiángulo");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TERMINACION, "Cubierta c/poliurea, texturada, azul-gris oscuro");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_REJA_DE_PROTECCION, "Negra, chapa hierro perforado");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ANCLAJES, "24 puntos con roscas de ¼ para montaje de herrería exterior de colgado, vaso de 35 mm");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CONECTORES, "2 x Neutrik Speakon");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DIMENSIONES, "(Al) 760mm x (An) 500mm x (P) 400mm");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PESO, "37 kg");
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Cantata");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_sonata);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMAGEN, R.drawable.cantata);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DESCRIPCION, "El STS Cantata es un sistema compacto y extremadamente eficiente, para la reproducción de la palabra y programa musical con altísima calidad.\n" +
                "\n" +
                "Los distintos puntos de  rigging permiten una gran variedad de métodos de montaje, permitiendo el acoplamiento entre cajas como así también el colgado de las mismas, en forma vertical u horizontal.\n" +
                "\n" +
                "Como complemento para bajas frecuencias se recomienda el STS Concerto miniSUB.");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TIPO, "Dos vías pasivas, Full Range");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_RESPUESTA_EN_FRECUENCIA, "58 Hz – 20 kHz +/- 3dB");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PARLANTES, "1 x 1” driver / 1 x 12” woofer");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_SENSIBILIDAD, "99 dB watt/metro");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CAPACIDAD_DE_POTENCIA, "700 W programa continuo");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMPEDANCIA, "8 ohm nominal");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_GABINETE, "Reflector de bajos");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TERMINACION, "Cubierta c/poliurea, texturada, azul-gris oscuro");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_REJA_DE_PROTECCION, "Negra, chapa hierro perforado");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ANCLAJES, "Sistema de puntos de rigging con 24 roscas de ¼, vaso de 35 mm");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CONECTORES, "2 x Neutrik Speakon");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DIMENSIONES, "(Al) 650mm x (An) 383mm x (P) 350mm");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PESO, "23 kg");
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Concerto TOP");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_contop);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMAGEN, R.drawable.top);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DESCRIPCION, "El STS Concerto TOP es un sistema compacto y extremadamente eficiente, para la reproducción de la palabra y programa musical con altísima calidad.\n" +
                "Los 30 puntos con roscas de ¼ para fijar herrería exterior permiten una gran variedad de métodos de montaje, permitiendo el acoplamiento entre cajas como así también el colgado de las mismas.\n" +
                "Como complemento para sub bajas frecuencias se recomienda el STS Concerto SUB.");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TIPO, "Tres vías, bi-amplificable, mid/high pasiva");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_RESPUESTA_EN_FRECUENCIA, "44 Hz – 18 kHz +/- 3dB");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PARLANTES, "1 x 1,4″ driver / 1 x 10″ Mid Range / 2 x 15″ Woofer");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_SENSIBILIDAD, "108 dB watt/metro Mid-High, 104 dB watt/metro Low");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CAPACIDAD_DE_POTENCIA, "900 W programa continuo Mid-High, 1600 W programa continuo Low");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMPEDANCIA, "8 ohm nominal Mid-High, 4 ohm nominal Low");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_GABINETE, "Carga bocina radiador de bajos low, guía de onda octogonal Mid, directividad constante High");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TERMINACION, "Cubierta c/poliurea, texturada, azul-gris oscuro");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_REJA_DE_PROTECCION, "Negra, chapa hierro perforado");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ANCLAJES, "30 puntos con roscas de ¼ para montaje de herrería exterior de colgado");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CONECTORES, "2 x Neutrik Speakon");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DIMENSIONES, "(Al) 1100 mm, (An) 610 mm, (P) 650 mm");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PESO, "79 kg");
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Concerto miniSUB");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_mini);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMAGEN, R.drawable.minisub);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DESCRIPCION, "El STS Concerto miniSUB es un sistema extremadamente eficiente y compacto, para la reproducción de muy bajas frecuencias con altísima calidad y dinámica.\n" +
                "Es posible configurar arreglos cardioides para controlar la dispersión convenientemente.");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TIPO, "Una vía, amplificación externa, configurable en arreglos cardioides");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_RESPUESTA_EN_FRECUENCIA, "40 Hz – 200 Hz +/- 3dB");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PARLANTES, "1 x 18″");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_SENSIBILIDAD, "99 dB watt/metro");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CAPACIDAD_DE_POTENCIA, "1200 W programa continuo");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMPEDANCIA, "4 u 8 ohm nominal");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_GABINETE, "Reflector de bajos, carga frontal");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TERMINACION, "Cubierta c/poliurea, texturada, azul-gris oscuro");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_REJA_DE_PROTECCION, "Negra, chapa hierro perforado");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ANCLAJES, "24 puntos con roscas de ¼ para montaje de herrería exterior de colgado, vaso de 35 mm");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CONECTORES, "2 x Neutrik Speakon");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DIMENSIONES, "(Al) 550 mm, (An) 610 mm, (P) 610 mm");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PESO, "37 kg");
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Concerto SUB");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_consub);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMAGEN, R.drawable.concerto);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DESCRIPCION, "El STS Concerto SUB es un sistema extremadamente eficiente, para la reproducción de muy bajas frecuencias con altísima calidad y dinámica.\n" +
                "Es posible configurar arreglos cardioides para controlar la dispersión convenientemente.");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TIPO, "Una vía, amplificación externa");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_RESPUESTA_EN_FRECUENCIA, "36 Hz – 200 Hz +/- 3dB");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PARLANTES, "2 x 18″ woofer");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_SENSIBILIDAD, "102 dB watt/metro");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CAPACIDAD_DE_POTENCIA, "4000 W programa continuo");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMPEDANCIA, "4 ohm nominal");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_GABINETE, "Dos cámaras, reflector de bajos, carga frontal");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TERMINACION, "Cubierta c/poliurea, texturada, azul-gris oscuro");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_REJA_DE_PROTECCION, "Negra, chapa hierro perforado");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ANCLAJES, "24 puntos con roscas de ¼ para montaje de herrería exterior de colgado, vaso de 35 mm");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CONECTORES, "2 x Neutrik Speakon");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DIMENSIONES, "(Al) 1100 mm, (An) 610 mm, (P) 650 mm");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PESO, "78 kg");
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Concerto INFRASUB");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_infra);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMAGEN, R.drawable.infrasub);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DESCRIPCION, "El STS Concerto INFRASUB es un sistema extremadamente potente, para la reproducción de infra bajas frecuencias con altísima calidad y dinámica.\n" +
                "Es posible configurar arreglos cardioides para controlar la dispersión convenientemente.");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TIPO, "Una vía, amplificación externa, configurable en arreglos cardioides");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_RESPUESTA_EN_FRECUENCIA, "28 Hz – 100 Hz –3dB/+0dB");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PARLANTES, "1 x 21 subwoofer Neodymium");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_SENSIBILIDAD, "97 dB watt/metro");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CAPACIDAD_DE_POTENCIA, "4000 W programa continuo");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMPEDANCIA, "4 ohm nominal");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_GABINETE, "Reflector de bajos, carga frontal");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TERMINACION, "Cubierta c/poliurea, texturada, azul-gris oscuro");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_REJA_DE_PROTECCION, "Negra, chapa hierro perforado");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ANCLAJES, "48 puntos con roscas de ¼ para montaje de herrería exterior de colgado, o herraje opcional compatible con bumper y gabinetes Linea V5/V20, vaso de 35 mm");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CONECTORES, "2 x Neutrik Speakon");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DIMENSIONES, "(Al) 610 mm, (An) 780 mm, (P) 780 mm");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PESO, "65 kg");
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Linea V5");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_v5);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMAGEN, R.drawable.lineav5);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DESCRIPCION, "El STS Linea V5 es un sistema compacto y muy eficiente para formaciones lineales, para la reproducción de la palabra y programa musical con altísima calidad.\n" +
                "\n" +
                "El rigging incorporado de 6 posiciones con pasos de 1° en el V5 permite lograr formaciones en las cuales se puede decidir con exactitud el área de cobertura vertical requerido, el bumper permite el colgado o estackeado del sistema.\n" +
                "\n" +
                "Pueden ser usados en formaciones de hasta 16 unidades, y como mínimo 4 unidades para obtener las ventajas de un sistema Line Array, o bien utilizado con un número reducido de cajas para un óptimo control de la dispersión vertical.\n" +
                "\n" +
                "Como complemento para sub bajas frecuencias se recomienda el STS Concerto SUB, o el STS Concerto INFRASUB.");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TIPO, "Tres vías, bi-amplificable, mid/high pasiva");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_RESPUESTA_EN_FRECUENCIA, "55 Hz – 18 kHz +/- 3dB");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PARLANTES, "2 x 1″ driver Neodymium / 2 x 8″ Mid Range/ 1 x 15″ Woofer");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_SENSIBILIDAD, "102 dB watt/metro Mid-High, 99 dB watt/metro Low");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CAPACIDAD_DE_POTENCIA, "1000 W programa continuo Mid-High, 1100 W programa continuo Low");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMPEDANCIA, "16 ohm nominal Mid-High, 8 ohm nominal Low");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_GABINETE, "Horizontal con rigging de colgado para line array");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TERMINACION, "Cubierta c/poliurea, texturada, azul-gris oscuro");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_REJA_DE_PROTECCION, "Negra, chapa hierro perforado");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ANCLAJES, "Sistema de rigging con 6 posiciones\n" +
                "V5 – (0°, 1°, 2°, 3°, 4°, 5°)\n" +
                "V20 – (0°, 2,5°, 5°, 7,5°, 10°, 12,5°)");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CONECTORES, "2 x Neutrik Speakon");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DIMENSIONES, "V5 – (Al) 460 mm x (An) 830 mm x (P) 310 mm\n" +
                "V20 – (Al) 460 mm x (An) 830 mm x (P) 305 mm");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PESO, "V5 47 Kg\n" +
                "V20 46 Kg");
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Linea V10");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_v10);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMAGEN, R.drawable.lineav10);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DESCRIPCION, "El STS Linea V10 es un sistema extremadamente compacto y eficiente para formaciones lineales, para la reproducción de la palabra y programa musical con altísima calidad.\n" +
                "\n" +
                "El rigging incorporado de 5 posiciones con pasos de 2,5° permite lograr formaciones en las cuales se puede decidir con exactitud el área de cobertura vertical requerido, el bumper permite el colgado o estackeado del sistema.\n" +
                "\n" +
                "Pueden ser usados en formaciones de hasta 24 unidades para obtener las ventajas de un sistema Line Array, o bien utilizado de forma independiente o con un número reducido de cajas para un óptimo control de la dispersión vertical.\n" +
                "\n" +
                "Como complemento para bajas frecuencias se recomienda el STS Concerto SUB, o el STS Concerto miniSUB.");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TIPO, "Dos vías, Full Range");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_RESPUESTA_EN_FRECUENCIA, "80 Hz – 18 kHz +/- 3dB");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PARLANTES, "1 x 1″ driver Neodymium / 1 x 8″ woofer Neodymium");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_SENSIBILIDAD, "97 dB watt/metro");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CAPACIDAD_DE_POTENCIA, "500 W programa continuo, 1000 W pico");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMPEDANCIA, "8 ohm nominal");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_GABINETE, "Horizontal con rigging de colgado para line array");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TERMINACION, "Cubierta c/poliurea, texturada, azul-gris oscuro");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_REJA_DE_PROTECCION, "Negra, chapa hierro perforado");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ANCLAJES, "Sistema de rigging con 5 posiciones (0°, 2,5°, 5°, 7,5°, 10°)");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CONECTORES, "2 x Neutrik Speakon");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DIMENSIONES, "(Al) 245mm x (An) 490mm x (P) 320mm con rigging");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PESO, "15 Kg");
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();

        values.put(DBStructure.Table_Productos.COLUMN_NAME_MODELO, "Linea V10i");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ICON, R.mipmap.ic_v10i);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMAGEN, R.drawable.lineav10i);
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DESCRIPCION, "El STS Linea V10i es un sistema extremadamente compacto y eficiente para formaciones lineales, para la reproducción de la palabra y programa musical con altísima calidad.\n" +
                "\n" +
                "El rigging entre cajas es fijo, nos permite así unir dos cajas para lograr una dispersión vertical de 20°, o bien tres cajas para lograr 30° y como máximo podemos unir cuatro cajas logrando así una dispersión de 40° vertical.\n" +
                "\n" +
                "El soporte U es orientable y angulable y puede ser usado en trípode o caño ajustable en altura.\n" +
                "\n" +
                "Como complemento para bajas frecuencias se recomienda el STS Concerto miniSUB.");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TIPO, "Dos vías, Full Range");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_RESPUESTA_EN_FRECUENCIA, "80 Hz – 18 kHz +/- 3dB");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PARLANTES, "1 x 1″ driver Neodymium / 1 x 8″ woofer Neodymium");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_SENSIBILIDAD, "97 dB watt/metro");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CAPACIDAD_DE_POTENCIA, "500 W programa continuo, 1000 W pico");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_IMPEDANCIA, "8 ohm nominal");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_GABINETE, "Horizontal con rigging fijo entre cajas");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_TERMINACION, "Cubierta c/poliurea, texturada, azul-gris oscuro");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_REJA_DE_PROTECCION, "Negra, chapa hierro perforado");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_ANCLAJES, "-");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_CONECTORES, "2 x Neutrik Speakon");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_DIMENSIONES, "(Al) 245mm x (An) 425mm x (P) 320mm");
        values.put(DBStructure.Table_Productos.COLUMN_NAME_PESO, "11 Kg");
        db.insert(DBStructure.Table_Productos.TABLE_NAME, null, values);
        values.clear();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }
}
