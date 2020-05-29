package com.example.mathfunction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
// app test
    //mathfunction tested
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btndiv = (Button) findViewById(R.id.buttondiv);
        Button btnmul = (Button) findViewById(R.id.buttonmul);
        final EditText etv = (EditText) findViewById(R.id.editText1);
        final EditText etv2 = (EditText) findViewById(R.id.editText2);
        final TextView result = (TextView) findViewById(R.id.textView1);
        // Create button click event




        btndiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());
                int div = x / y; //Perform Maths operation
                result.setText("The ANS of " + x + " / " + y + " = " + div);//print answer
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int x = new Integer(etv.getText().toString());
                int y = new Integer(etv2.getText().toString());
                int mul = x * y; //Perform Maths operation
                result.setText("The ANS of " + x + " * " + y + " = " + mul);//Print answer
            }
        });
    }

}
