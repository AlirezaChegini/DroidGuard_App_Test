package droidguard.app.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.view.View;
import android.widget.TextView;

import lib.DGL;

public class MainActivity extends AppCompatActivity {

    TextView ADB, Debugger, wel, Root, Xposed, Emulator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wel = (TextView)findViewById(R.id.textView7);
        wel.setText(new String(Base64.decode("V2VsY29tZQ==".getBytes(), Base64.DEFAULT)));
    }

    public void onCheckClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                ADB = (TextView)findViewById(R.id.textView2);
                Debugger = (TextView)findViewById(R.id.textView4);
                Root = (TextView)findViewById(R.id.textView6);
                Xposed = (TextView)findViewById(R.id.textView9);
                Emulator = (TextView)findViewById(R.id.textView11);

                // Check ADB ( USB debugging is enable )
                if (DGL.isAC(getApplicationContext())) {
                    ADB.setText(R.string.t); // USB debugging is enable
                } else{
                    ADB.setText(R.string.f); // USB debugging is not enable
                }

                // Check Debugger
                if (DGL.isDC(getApplicationContext())) {
                    Debugger.setText(R.string.t); // Debugger detected
                } else{
                    Debugger.setText(R.string.f); // Debugger not detected
                }

                // Check Root
                if (DGL.isRD(getApplicationContext())) {
                    Root.setText(R.string.t); // Root detected
                } else{
                    Root.setText(R.string.f); // Root not detected
                }

                // Check Xposed
                if (DGL.isXD(getApplicationContext())) {
                    Xposed.setText(R.string.t); // Xposed detected
                } else{
                    Xposed.setText(R.string.f); // Xposed not detected
                }

                // Check Emulator
                if (DGL.isED(getApplicationContext())) {
                    Emulator.setText(R.string.t); // Emulator detected
                } else{
                    Emulator.setText(R.string.f); // Emulator not detected
                }
                break;
        }
    }
}
