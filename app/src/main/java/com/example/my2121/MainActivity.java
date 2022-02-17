package com.example.my2121;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/*
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}*/
//import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText edt1,edt2,edt3,edt4,edt5;
    TextView t;

    int count=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.b);
        edt1=(EditText)findViewById(R.id.edt1);
        edt2=(EditText)findViewById(R.id.edt2);
        edt3=(EditText)findViewById(R.id.edt3);
        edt4=(EditText)findViewById(R.id.edt4);
        edt5=(EditText)findViewById(R.id.edt5);
        t=(TextView)findViewById(R.id.t);
        t.setBackgroundColor(Color.WHITE);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float grt1, grt2, grt3, grt4, grt5;
                if (count % 2 == 0) {
                    if (edt1.getText().toString().equals("") || edt2.getText().toString().equals("") || edt3.getText().toString().equals("") || edt4.getText().toString().equals("") || edt5.getText().toString().equals("")) {
                        t.setText("Enter grades in all fields");
                    }
                    else {
                        grt1 = Float.parseFloat(edt1.getText().toString());
                        grt2 = Float.parseFloat(edt2.getText().toString());
                        grt3 = Float.parseFloat(edt3.getText().toString());
                        grt4 = Float.parseFloat(edt4.getText().toString());
                        grt5 = Float.parseFloat(edt5.getText().toString());
                        float avg = grt1 + grt2 + grt3 + grt4 + grt5;
                        avg = avg / 5;
                        if (avg < 60) {
                            t.setText(Float.toString(avg));
                            t.setBackgroundColor(Color.RED);
                        } else if (avg > 60 && avg < 80) {
                            t.setText(Float.toString(avg));
                            t.setBackgroundColor(Color.YELLOW);
                        } else if (avg >= 80 && avg <= 100) {
                            t.setText(Float.toString(avg));
                            t.setBackgroundColor(Color.GREEN);
                        }
                        count++;
                        b.setText("Clear");
                    }

                }
                else
                {
                    edt1.setText("");
                    edt2.setText("");
                    edt3.setText("");
                    edt4.setText("");
                    edt5.setText("");
                    t.setText("");
                    b.setText("Compute GPA");
                    t.setBackgroundColor(Color.WHITE);
                    count++;
                }
            }
        });
    }
}
