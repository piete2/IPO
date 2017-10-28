package piete.ipo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Emergencia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergencia);
    }

    public void ajusteSos(View v){
        Intent guardar = new Intent(getApplicationContext(), numerosTelefonoSOS.class);
        startActivity(guardar);
    }

    public void enviarSMS(View v){
        Toast toast1 =Toast.makeText(getApplicationContext(),"Enviando SMS ayuda con posición "+numerosTelefonoSOS.numeros(), Toast.LENGTH_SHORT);
        toast1.show();
    }


}
