package com.example.android.testradiobuttonquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void sprOdpowiedź(View view) {
        RadioGroup radioGroup_1 = (RadioGroup) findViewById(R.id.radioGr1);
        RadioButton button2 = (RadioButton) findViewById(R.id.radioButton2);

        boolean button2checked = button2.isChecked();

        if (button2checked == true) {
            Toast.makeText(getApplicationContext(), "poprawna odp!!", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(getApplicationContext(), "zła odpowiedź!!!", Toast.LENGTH_LONG).show();
        }
        radioGroup_1.clearCheck();

        //this is test to delete this comment
        // second test
        //3rd test


    }
}