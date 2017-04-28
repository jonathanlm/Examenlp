package pe.upue.edu.examen;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Zea
 */

public class DBHelper  extends SQLiteOpenHelper {
    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table usuarios(codigo integer primary key, usuario text,contrasena text)");
        db.execSQL("insert into usuarios values(13,'admin','admin')");

        db.execSQL("create table contactos(id integer primary key,nombre  text,apellidos text)");
        db.execSQL("insert into contactos values(1,'jose','gonzales')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("create table usuarios(codigo integer primary key, usuario text,contrasena text)");
        db.execSQL("insert into usuarios values(13,'admin','admin')");

        db.execSQL("create table contactos(id integer primary key,nombre  text,apellidos text)");
        db.execSQL("insert into contactos values(1,'jose','gonzales')");
    }



}