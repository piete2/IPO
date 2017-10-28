package piete.ipo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class numerosTelefonoSOS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_telefono_sos);

    }

    public void guardar(View v){
        Intent h = new Intent(getApplicationContext(),Emergencia.class);
        startActivity(h);
    }

    @SuppressLint("ResourceType")
    public  static String numeros(){
        String a="";
        a="678258741 "+"789456123";
        return a;
    }


}
