package com.example.kingbradley.watertowine;

import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends Activity {

    RadioButton rbtnFluid;
    RadioButton rbtnCup;
    RadioButton rbtnPint;
    RadioButton rbtnQuart;
    RadioButton rbtnGallon;
    RadioButton rbtnMillilitre;
    RadioButton rbtnLitre;

    RadioButton rbtnFluid1;
    RadioButton rbtnCup1;
    RadioButton rbtnPint1;
    RadioButton rbtnQuart1;
    RadioButton rbtnGallon1;
    RadioButton rbtnMillilitre1;
    RadioButton rbtnLitre1;

    EditText inputText;
    TextView outputText;
    Button btnConvert;

    int in, out;

    Double num;
    Double result;

    String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rG1 = (RadioGroup) findViewById(R.id.rG1);
        RadioGroup rG2 = (RadioGroup) findViewById(R.id.rG2);

        rbtnFluid = (RadioButton) findViewById(R.id.rbtnFluid);
        rbtnFluid1 = (RadioButton) findViewById(R.id.rbtnFluid1);

        rbtnCup=(RadioButton) findViewById(R.id.rbtnCup);
        rbtnCup1=(RadioButton) findViewById(R.id.rbtnCup1);

        rbtnQuart=(RadioButton) findViewById(R.id.rbtnQuart);
        rbtnQuart1=(RadioButton) findViewById(R.id.rbtnQuart1);

        rbtnPint=(RadioButton) findViewById(R.id.rbtnPint);
        rbtnPint1=(RadioButton) findViewById(R.id.rbtnPint1);

        rbtnGallon=(RadioButton) findViewById(R.id.rbtnGallon);
        rbtnGallon1=(RadioButton) findViewById(R.id.rbtnGallon1);

        rbtnMillilitre=(RadioButton) findViewById(R.id.rbtnMillilitre);
        rbtnMillilitre1=(RadioButton) findViewById(R.id.rbtnMillilitre1);

        rbtnLitre=(RadioButton) findViewById(R.id.rbtnLitre);
        rbtnLitre1=(RadioButton) findViewById(R.id.rbtnLitre1);


        inputText =(EditText) findViewById(R.id.inputText);
        outputText=(TextView)findViewById(R.id.outputText);

        btnConvert=(Button)findViewById(R.id.btnConvert);
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=Double.parseDouble(inputText.getText().toString());


                if(rbtnFluid.isChecked()) {
                    in = 1;
                    rbtnCup.setChecked(false);
                    rbtnPint.setChecked(false);
                    rbtnQuart.setChecked(false);
                    rbtnGallon.setChecked(false);
                    rbtnMillilitre.setChecked(false);
                    rbtnLitre.setChecked(false);
                }
                else
                    if(rbtnCup.isChecked())
                    {
                        in=2;
                        rbtnFluid.setChecked(false);
                        rbtnPint.setChecked(false);
                        rbtnQuart.setChecked(false);
                        rbtnGallon.setChecked(false);
                        rbtnMillilitre.setChecked(false);
                        rbtnLitre.setChecked(false);
                    }
                else
                        if(rbtnPint.isChecked())
                        {
                            in=3;
                            rbtnCup.setChecked(false);
                            rbtnFluid.setChecked(false);
                            rbtnQuart.setChecked(false);
                            rbtnGallon.setChecked(false);
                            rbtnMillilitre.setChecked(false);
                            rbtnLitre.setChecked(false);
                        }
                else
                            if(rbtnQuart.isChecked())
                            {
                                in=4;
                                rbtnCup.setChecked(false);
                                rbtnPint.setChecked(false);
                                rbtnFluid.setChecked(false);
                                rbtnGallon.setChecked(false);
                                rbtnMillilitre.setChecked(false);
                                rbtnLitre.setChecked(false);
                            }
                else
                                if(rbtnGallon.isChecked())
                                {
                                    in=5;
                                    rbtnCup.setChecked(false);
                                    rbtnPint.setChecked(false);
                                    rbtnQuart.setChecked(false);
                                    rbtnFluid.setChecked(false);
                                    rbtnMillilitre.setChecked(false);
                                    rbtnLitre.setChecked(false);
                                }
                else
                                    if(rbtnMillilitre.isChecked())
                                    {
                                        in=6;
                                        rbtnCup.setChecked(false);
                                        rbtnPint.setChecked(false);
                                        rbtnQuart.setChecked(false);
                                        rbtnGallon.setChecked(false);
                                        rbtnFluid.setChecked(false);
                                        rbtnLitre.setChecked(false);
                                    }
                else
                                        if(rbtnLitre.isChecked())
                                        {
                                            in=7;
                                            rbtnCup.setChecked(false);
                                            rbtnPint.setChecked(false);
                                            rbtnQuart.setChecked(false);
                                            rbtnGallon.setChecked(false);
                                            rbtnMillilitre.setChecked(false);
                                            rbtnFluid.setChecked(false);
                                        }

                switch (in)
                {
                    case 1: if(rbtnFluid1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        op=String.valueOf(num);
                            outputText.setText(op);
                        }
                        else
                        if(rbtnCup1.isChecked())
                        {

                            rbtnFluid1.setChecked(false);
                            rbtnPint1.setChecked(false);
                            rbtnQuart1.setChecked(false);
                            rbtnGallon1.setChecked(false);
                            rbtnMillilitre1.setChecked(false);
                            rbtnLitre1.setChecked(false);

                            result=num*0.125;
                            op=String.valueOf(result);
                            outputText.setText(op);
                        }
                        else
                        if(rbtnPint1.isChecked())
                        {
                            rbtnCup1.setChecked(false);
                            rbtnFluid1.setChecked(false);
                            rbtnQuart1.setChecked(false);
                            rbtnGallon1.setChecked(false);
                            rbtnMillilitre1.setChecked(false);
                            rbtnLitre1.setChecked(false);

                            result=num*0.0625;
                            op=String.valueOf(result);
                            outputText.setText(op);
                        }
                        else
                        if(rbtnQuart1.isChecked())
                        {

                            rbtnCup1.setChecked(false);
                            rbtnPint1.setChecked(false);
                            rbtnFluid1.setChecked(false);
                            rbtnGallon1.setChecked(false);
                            rbtnMillilitre1.setChecked(false);
                            rbtnLitre1.setChecked(false);

                            result=num*0.03125;
                            op=String.valueOf(result);
                            outputText.setText(op);
                        }
                        else
                        if(rbtnGallon1.isChecked())
                        {
                            rbtnCup1.setChecked(false);
                            rbtnPint1.setChecked(false);
                            rbtnQuart1.setChecked(false);
                            rbtnFluid1.setChecked(false);
                            rbtnMillilitre1.setChecked(false);
                            rbtnLitre1.setChecked(false);

                            result=num*0.0078125;
                            op=String.valueOf(result);
                            outputText.setText(op);
                        }
                        else
                        if(rbtnMillilitre1.isChecked())
                        {
                            rbtnCup1.setChecked(false);
                            rbtnPint1.setChecked(false);
                            rbtnQuart1.setChecked(false);
                            rbtnGallon1.setChecked(false);
                            rbtnFluid1.setChecked(false);
                            rbtnLitre1.setChecked(false);

                            result=num*29.5735;
                            op=String.valueOf(result);
                            outputText.setText(op);
                        }
                        else
                        if(rbtnLitre1.isChecked())

                        {
                            rbtnCup1.setChecked(false);
                            rbtnPint1.setChecked(false);
                            rbtnQuart1.setChecked(false);
                            rbtnGallon1.setChecked(false);
                            rbtnMillilitre1.setChecked(false);
                            rbtnFluid1.setChecked(false);

                            result=num*0.0295735;
                            op=String.valueOf(result);
                            outputText.setText(op);
                        }
                        break;




                    case 2: if(rbtnFluid1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*8;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnCup1.isChecked())
                    {
                        rbtnFluid1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnPint1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*0.5;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnQuart1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*0.25;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnGallon1.isChecked())
                    {

                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*0.0625;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnMillilitre1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*236.588;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnLitre1.isChecked())

                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnFluid1.setChecked(false);

                        result=num*0.236588;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                        break;




                    case 3: if(rbtnFluid1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*16;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnCup1.isChecked())
                    {
                        rbtnFluid1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*2;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnPint1.isChecked())
                    {

                        rbtnCup1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnQuart1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*0.5;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnGallon1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*0.125;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnMillilitre1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*473.176;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnLitre1.isChecked())

                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnFluid1.setChecked(false);

                        result=num*0.473176;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                        break;








                    case 4: if(rbtnFluid1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*32;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnCup1.isChecked())
                    {
                        rbtnFluid1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*4;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnPint1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*2;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnQuart1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnGallon1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*0.25;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnMillilitre1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*946.353;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnLitre1.isChecked())

                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnFluid1.setChecked(false);

                        result=num*0.946353;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                        break;



                    case 5: if(rbtnFluid1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*128;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnCup1.isChecked())
                    {
                        rbtnFluid1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*16;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnPint1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*8;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnQuart1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*4;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnGallon1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnMillilitre1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*3785.41;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnLitre1.isChecked())

                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnFluid1.setChecked(false);

                        result=num*3.78541;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                        break;



                    case 6: if(rbtnFluid1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*0.033814;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnCup1.isChecked())
                    {
                        rbtnFluid1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*0.00422675;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnPint1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*0.00211338;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnQuart1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*0.00105669;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnGallon1.isChecked())
                    {

                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*0.000264172;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnMillilitre1.isChecked())
                    {

                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnLitre1.isChecked())

                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnFluid1.setChecked(false);

                        result=num*0.001;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                        break;




                    case 7: if(rbtnFluid1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*33.814;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnCup1.isChecked())
                    {
                        rbtnFluid1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*4.22675;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnPint1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*2.11338;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnQuart1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*1.05669;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnGallon1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*0.264172;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnMillilitre1.isChecked())
                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnFluid1.setChecked(false);
                        rbtnLitre1.setChecked(false);

                        result=num*1000;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                    else
                    if(rbtnLitre1.isChecked())

                    {
                        rbtnCup1.setChecked(false);
                        rbtnPint1.setChecked(false);
                        rbtnQuart1.setChecked(false);
                        rbtnGallon1.setChecked(false);
                        rbtnMillilitre1.setChecked(false);
                        rbtnFluid1.setChecked(false);

                        result=num;
                        op=String.valueOf(result);
                        outputText.setText(op);
                    }
                        break;

                    }
                }
                    });

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
