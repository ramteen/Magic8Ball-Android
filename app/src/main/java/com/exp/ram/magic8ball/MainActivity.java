package com.exp.ram.magic8ball;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView label;
    EditText textfield;
    String answerArray[] = {"Yes", "No", "Maybe", "Whatever", "Reply hazy, try again"};
    String answerArray2[] = {"Yes", "No", "Maybe", "Whatever", "Reply hazy, try again"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button sb = (Button) findViewById(R.id.sb);
        label = (TextView) findViewById(R.id.textView);
        textfield = (EditText) findViewById(R.id.editText);


        label.setText("Magic (8)");


        textfield.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    // Perform action on key press
                    textfield.setText("");
                    int idx = new Random().nextInt(answerArray2.length);
                    String random = (answerArray2[idx]);
                    label.setText(random);

                    InputMethodManager in = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    in.hideSoftInputFromWindow(textfield.getApplicationWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);

                    return true;
                }
                return false;
            }
        });



    }

    public void setText(View v) {
        int idx = new Random().nextInt(answerArray.length);
        String random = (answerArray[idx]);
        label.setText(random);
    }
}
