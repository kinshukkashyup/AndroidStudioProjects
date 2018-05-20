package com.example.kingbradley.exercise4;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText etNum1;
    EditText etNum2;
    Button btnMult;
    Button btnAdd;
    TextView tvResult;
    double num1;
    double num2;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1=(EditText) findViewById(R.id.etNum1);
        etNum2=(EditText) findViewById(R.id.etNum2);
        btnMult=(Button) findViewById(R.id.btnMult);
        btnAdd=(Button) findViewById(R.id.btnAdd);
        tvResult=(TextView) findViewById(R.id.tvResult);

        btnMult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                num1=Double.parseDouble(etNum1.getText().toString());
                num2=Double.parseDouble(etNum2.getText().toString());
                result = num1*num2;
                String finalResult=String.valueOf(result);
                tvResult.setText(finalResult);
            }
        }        );

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                num1=Double.parseDouble(etNum1.getText().toString());
                num2=Double.parseDouble(etNum2.getText().toString());
                result = num1+num2;
                String finalResult=String.valueOf(result);
                tvResult.setText(finalResult);
            }
        }        );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
