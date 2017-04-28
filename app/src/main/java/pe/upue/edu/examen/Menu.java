package pe.upue.edu.examen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

    }


    public void registrocontaacto(View v){
        Intent ven=new Intent(this,RegistroContactos.class);
        startActivity(ven);
    }
}
