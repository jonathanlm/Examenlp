package pe.upue.edu.examen;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by ZeA
 */

public class RegistroUsuario extends AppCompatActivity {

    EditText et1, et2, et3, et4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);
        et1 = (EditText) findViewById(R.id.etid);
        et2 = (EditText) findViewById(R.id.etnombre);
        et3 = (EditText) findViewById(R.id.etapellidos);


    }

    public void registrar(View view) {

        DBHelper admin = new DBHelper(this, "school", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();
        String codigo = et1.getText().toString();
        String usuario = et2.getText().toString();
        String contraseña = et3.getText().toString();


        ContentValues values = new ContentValues();
        values.put("codigo", codigo);
        values.put("usuario", usuario);
        values.put("contrasena", contraseña);

        db.insert("usuarios", null, values);
        db.close();

        Intent ven = new Intent(this, Main.class);
        startActivity(ven);

    }

    public void cancelar(View view) {
        finish();

    }

}