package com.emrekilinc.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    TextView resultText;
    Button button6;

    double p;

    Spinner spinner;
    String[] yass = {"Evet", "Hayır"};
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        resultText = (TextView) findViewById(R.id.textView);
        button6 = (Button) findViewById(R.id.button6);

        spinner = (Spinner) findViewById(R.id.spinner);
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, yass  );
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                    p = 0.75;
                if (position == 1)
                    p = 0.85;


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
        }

    public void ileri (View view) {

        Intent intent = new Intent(this, Main2Activity.class);
        //intent.putExtra("isim",editText2.getText().toString());
        intent.putExtra("isim",spinner.getText());
        startActivity(intent);
    }

            public void sum (View view) {

        if (editText.getText().toString().matches("") || editText2.getText().toString().matches("")){

            resultText.setText("Numara Yok!!");

        }
        else {int a =Integer.parseInt(editText.getText().toString());
            int b =Integer.parseInt(editText2.getText().toString());

            int resultInteger = a + b;

            resultText.setText("Result: " + resultInteger);

        }




        }

            public void deduct (View view) {
                if (editText.getText().toString().matches("") || editText2.getText().toString().matches("")){

                    resultText.setText("Numara Yok!!");

                }
                else {int a =Integer.parseInt(editText.getText().toString());
                    int b =Integer.parseInt(editText2.getText().toString());

                    int resultInteger = a - b;

                    resultText.setText("Result: " + resultInteger);

                }

            }

            public void multiply (View view) {

                if (editText.getText().toString().matches("") || editText2.getText().toString().matches("")){

                    resultText.setText("Numara Yok!!");

                }
                    else {int a =Integer.parseInt(editText.getText().toString());
                    int b =Integer.parseInt(editText2.getText().toString());

                    int resultInteger = a * b;

                    resultText.setText("Result: " + resultInteger);

                }

            }

            public void divide (View view) {

                if (editText.getText().toString().matches("") || editText2.getText().toString().matches("")){

                    resultText.setText("Numara Yok!!");

                }
                else {int a =Integer.parseInt(editText.getText().toString());
                    int b =Integer.parseInt(editText2.getText().toString());

                    int resultInteger = a / b;

                    resultText.setText("Result: " + resultInteger);

                }

            }




}
