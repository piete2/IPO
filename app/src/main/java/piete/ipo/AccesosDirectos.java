package piete.ipo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.graphics.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.support.annotation.RequiresApi;
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
    Button bb,bw,bl;
    private boolean isLighOn = false;

    private CameraManager mCameraManager;

    //final android.hardware.Camera.Parameters p ;
    private WifiManager wifiManager;


    boolean btsoportado;
    private String mCameraId;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
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

        try {
            mCameraId = mCameraManager.getCameraIdList()[0];
        } catch (CameraAccessException e) {
            e.printStackTrace();
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

    public void wifi(View view){
        if (isLighOn) {
            turnOnFlashLight();

        } else {
            turnOffFlashLight();
        }
    }

    public void turnOnFlashLight() {

        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                mCameraManager.setTorchMode(mCameraId, true);
                //playOnOffSound();
                //mTorchOnOffButton.setImageResource(R.drawable.on);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void turnOffFlashLight() {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                mCameraManager.setTorchMode(mCameraId, false);
                //playOnOffSound();
                //mTorchOnOffButton.setImageResource(R.drawable.on);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

