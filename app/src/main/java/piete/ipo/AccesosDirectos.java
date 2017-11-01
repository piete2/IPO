package piete.ipo;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import static android.content.Context.*;

public class AccesosDirectos extends AppCompatActivity {

    //private Button boton;
    BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    WifiManager wm;
    Button bb,bw;

    private WifiManager wifiManager;


    boolean btsoportado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accesos_directos);
        //boton=(Button) findViewById(R.id.blue);
        bb=(Button) findViewById(R.id.blue);
        bw=(Button) findViewById(R.id.wifi);

        if( bluetoothAdapter == null ) {
            btsoportado=false;
            Toast toast1 =Toast.makeText(getApplicationContext(),"Bluetooth no soportado ", Toast.LENGTH_SHORT);
            toast1.show();
        }


    }


    public void blue(View view) {
        if (btsoportado != false) {
            if (bluetoothAdapter.isEnabled()) {
                Toast toast1 = Toast.makeText(getApplicationContext(), "Bluetooth APAGADO ", Toast.LENGTH_SHORT);
                toast1.show();
                bb.setText("Bluetooth ON");

                bluetoothAdapter.disable();
            } else {
                Toast toast1 = Toast.makeText(getApplicationContext(), "Bluetooth ENCENDIDO", Toast.LENGTH_SHORT);
                toast1.show();
                bluetoothAdapter.enable();
                bb.setText("Bluetooth OFF");

            }
        }
    }

    public void wifi(View view) {

        if(WifiManager.WIFI_STATE_ENABLED!=3){
            Toast toast1 = Toast.makeText(getApplicationContext(), "WIFI APAGADO ", Toast.LENGTH_SHORT);
            toast1.show();
            wifiManager.setWifiEnabled(false);
        }else{
            Toast toast1 = Toast.makeText(getApplicationContext(), "WIFI ENCENDIDO ", Toast.LENGTH_SHORT);
            toast1.show();
            wifiManager.setWifiEnabled(true);
        }

    }
}

