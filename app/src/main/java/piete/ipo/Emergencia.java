package piete.ipo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Emergencia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergencia);
    }

    public void ajustesos(View v){
        Intent ajustes = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(ajustes);
    }


}
