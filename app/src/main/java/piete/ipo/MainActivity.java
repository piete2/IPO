package piete.ipo;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void camara(View v) {
       // Intent camara_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent, 0);
    }

    public void galeria(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(
                "content://media/internal/images/media"));
        startActivity(intent);
    }
public void k(View v){
    Intent guardar = new Intent(getApplicationContext(), Emergencia.class);
    startActivity(guardar);
}

}






