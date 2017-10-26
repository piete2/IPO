package piete.ipo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class numTelfSMS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num_telf_sms);
    }

    public void guardarsms() {
        Intent guardar = new Intent(getApplicationContext(), Emergencia.class);
        startActivity(guardar);
        Toast toast1 =Toast.makeText(getApplicationContext(),"Contactos guardados", Toast.LENGTH_SHORT);
        toast1.show();
    }
}
