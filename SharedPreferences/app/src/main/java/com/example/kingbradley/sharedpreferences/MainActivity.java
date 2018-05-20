package com.example.kingbradley.sharedpreferences;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    EditText RAMSize;
    Button btnSV, btnEA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1=(CheckBox) findViewById(R.id.checkBox1);
        checkBox2=(CheckBox) findViewById(R.id.checkBox2);
        checkBox3=(CheckBox) findViewById(R.id.checkBox3);
        checkBox4=(CheckBox) findViewById(R.id.checkBox4);

        btnSV=(Button) findViewById(R.id.btnSV);
        btnEA=(Button) findViewById(R.id.btnEA);
        RAMSize=(EditText) findViewById(R.id.RAMSize) ;
        loadSavedPreferences();



    }
    private void loadSavedPreferences() {
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        boolean checkBoxValue1 = sharedPrefs.getBoolean("graphicsCOProc", false);
        boolean checkBoxValue2 = sharedPrefs.getBoolean("extendedMemory", false);
        boolean checkBoxValue3 = sharedPrefs.getBoolean("touchScreen",false);
        boolean checkBoxValue4 = sharedPrefs.getBoolean("highspeednetworkAdapter",false);
        String memSize = sharedPrefs.getString("RAMCapacity","2");

        if(checkBoxValue1) {
            checkBox1.setChecked(true);
        } else
        {
            checkBox1.setChecked(false);
        }

        if(checkBoxValue2) {
            checkBox2.setChecked(true);
        } else
        {
            checkBox2.setChecked(false);
        }

        if(checkBoxValue3) {
            checkBox3.setChecked(true);
        } else
        {
            checkBox3.setChecked(false);
        }

        if(checkBoxValue4) {
            checkBox4.setChecked(true);
        } else
        {
            checkBox4.setChecked(false);
        }

        RAMSize.setText(memSize);

    }

    private void savePreferences(String key, boolean value)
    {
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPrefs.edit();
        editor.putBoolean(key,value);
        editor.apply();

    }

    private void savePreferences(String key, String value)
    {
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPrefs.edit();
        editor.putString(key,value);
        editor.apply();

    }

    public void saveValues(View V)
    {
        savePreferences("graphicsCoProc", checkBox1.isChecked());
        savePreferences("extendedMemory", checkBox2.isChecked());
        savePreferences("touchScreen", checkBox3.isChecked());
        savePreferences("highspeednetworkAdapter", checkBox4.isChecked());
        savePreferences("RAMCapacity", RAMSize.getText().toString());
    }
    public void exitApp(View v)
    {
        finish();
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
