package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final Handler handler = new Handler();
    static int x = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickB(View view) {

        Button b = (Button) view;
        b.setText("" + x + "");
        x++;


        final Runnable r = new Runnable() {
            public void run() {
                b.setEnabled(false);
                Toast toast = Toast.makeText(getApplicationContext(),
                        "you pressed: " + x + "", Toast.LENGTH_LONG);
                toast.show();

            }
        };
        handler.postDelayed(r, 5000);

    }

}