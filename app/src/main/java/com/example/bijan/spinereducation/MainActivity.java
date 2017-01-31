package com.example.bijan.spinereducation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Spinner sp;
    TextView tv;
    String [] education = {"Select Your Education", "B.Tech", "B.E", "M.Tech", "M.C.A", "M.B.A"};
    ArrayAdapter<String> aa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.edittext);
        sp = (Spinner) findViewById(R.id.spinner);
        tv = (TextView) findViewById(R.id.textview);

        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,education);
        sp.setAdapter(aa);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String str = education[i];
                //Toast.makeText(MainActivity.this, ""+str, Toast.LENGTH_SHORT).show();
                String name = et.getText().toString();
                tv.setText(name+"\n"+str);
                //tv.setText(str);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
