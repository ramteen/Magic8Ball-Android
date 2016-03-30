package com.exp.ram.magic8ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView label;
    EditText textfield;
    String answerArray[] = {"Yes", "No", "Maybe", "Whatever", "Reply hazy, try again"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button sb = (Button) findViewById(R.id.sb);
        label = (TextView) findViewById(R.id.textView);
        textfield = (EditText) findViewById(R.id.editText);


        label.setText("Magic (8)");


    }

    public void setText(View v) {
        int idx = new Random().nextInt(answerArray.length);
        String random = (answerArray[idx]);
        label.setText(random);
    }
}
