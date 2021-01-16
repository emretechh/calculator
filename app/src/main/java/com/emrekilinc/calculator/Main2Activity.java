package com.emrekilinc.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.DecimalFormat;

public class Main2Activity extends AppCompatActivity {

    EditText editText3;
    EditText editText4;
    EditText editText5;
    Button button5;
    double a;
    double d;
    double b;
    double c;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);
        button5 = (Button) findViewById(R.id.button5);



    }

    public void Hesapla(View view) {

        double a = Double.valueOf(editText3.getText().toString()).doubleValue();

        if (a>=0 && a<=50) {

            if (a >= 0 && a <= 4) {

                b = a;
                c = 3.75 * a;
                d = 0 + c;
            } else if (a > 4 && a <= 10) {

                b = a - 4;
                c = b * 20 / 6;
                d = 15 + c;

            } else if (a > 10 && a <= 30) {

                b = a - 10;
                c = b * 1.5;
                d = 35 + c;
            } else if (a > 30 && a <= 50) {

                b = a - 30;
                c = b;
                d = 65 + c;
            }

            editText5.setText(String.valueOf(d));
            editText5.setText(new DecimalFormat("##.##").format(d));
        }
        else

        {
            editText5.setText("Değer 0 - 50 arasında olmalıdır.");
        }

        if (a<0 && a>4){

            editText5.setText("4'den büyük değer girilmez.");
        }

        if (a >= 0 && a <= 50) {

            if (a >= 0 && a <= 5) {

                d = a;
            } else if (a > 5 && a <= 10) {

                b = a - 5;
                c = b * 5;
                d = 5 + c;
            } else if (a > 10 && a <= 30) {

                b = a - 10;
                c = (a - 10) * 1.5;
                d = 30 + c;

            } else if (a > 30 && a <= 50) {

                b = a - 30;
                c = (a - 30) * 1.75;
                d = 60 + c;
            }


            editText4.setText(String.valueOf(d));
            editText4.setText(new DecimalFormat("##.##").format(d));

        } else {
            editText4.setText("Değer 0 - 50 arasında olmalıdır.");
        }


    }

}

