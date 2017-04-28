package pe.upue.edu.examen;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Zea
 */

public class RegistroContactos  extends AppCompatActivity {

EditText et1,et2,et3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrocontaacto);
        et1 = (EditText) findViewById(R.id.etid);
        et2 = (EditText) findViewById(R.id.etnombre);
        et3 = (EditText) findViewById(R.id.etapellidos);



    }

    public void registrar(View view) {

        DBHelper admin = new DBHelper(this, "school", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();
        String id = et1.getText().toString();
        String nombre = et2.getText().toString();
        String apellidos = et3.getText().toString();


        ContentValues values = new ContentValues();
        values.put("id", id);
        values.put("nombre", nombre);
        values.put("apellidos", apellidos);

        db.insert("contactos", null, values);
        db.close();

        Intent ven = new Intent(this, Menu.class);
        startActivity(ven);

    }

    public void cancelar(View view) {
        finish();

    }



    public void registrocontaacto(View v){
        Intent ven=new Intent(this,RegistroUsuario.class);
        startActivity(ven);
    }



    public void salir(View v){
        finish();
        //System.exit(0);
    }

}
