package in.ankitpati.bluesense;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sense(View view) {
        BluetoothAdapter ba = BluetoothAdapter.getDefaultAdapter();

        if (ba == null) {
            TextView error = findViewById(R.id.textView);
            error.setText(R.string.no_bluetooth);
            return;
        }

        Intent intent = new Intent(this, SenseBluetoothDevices.class);
        startActivity(intent);
    }
}
