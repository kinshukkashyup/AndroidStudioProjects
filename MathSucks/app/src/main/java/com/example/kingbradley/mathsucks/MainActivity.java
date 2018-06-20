package com.example.kingbradley.mathsucks;
//Name : Kinshuk Kashyup
//KId: K00400476

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

    TextView totalTextView;
    double num1;
    double num2;
    String s;
    double result;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       
       totalTextView =(TextView) findViewById(R.id.totalTextView);



        Button b0 = (Button) findViewById(R.id.b0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalTextView.append("0");
            }
        });
        Button b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalTextView.append("1");
            }
        });

        Button b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalTextView.append("2");
            }
        });
        Button b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalTextView.append("3");
            }
        });
        Button b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalTextView.append("4");
            }
        });
        Button b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalTextView.append("5");
            }
        });
        Button b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalTextView.append("6");
            }
        });
        Button b7 = (Button) findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalTextView.append("7");
            }
        });
        Button b8 = (Button) findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalTextView.append("8");
            }
        });
        Button b9 = (Button) findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalTextView.append("9");
            }
        });








        Button bplus = (Button) findViewById(R.id.bplus);


            bplus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    num1= Double.parseDouble(totalTextView.getText().toString());
                    totalTextView.append("+");
                    s="+";
                }
            });

        Button bsub = (Button) findViewById(R.id.bsub);
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Double.parseDouble(totalTextView.getText().toString());
                totalTextView.append("-");
                s="-";
            }
        });
        Button bmult = (Button) findViewById(R.id.bmult);
        bmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Double.parseDouble(totalTextView.getText().toString());
                totalTextView.append("*");
                s="*";
            }
        });
        Button bdiv = (Button) findViewById(R.id.bdiv);
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Double.parseDouble(totalTextView.getText().toString());
                totalTextView.append("/");
                s="/";

            }
        });


        Button bequal = (Button) findViewById(R.id.bequal);
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int placeholder=-1;
                String temp=totalTextView.getText().toString();



                 if (temp.contains("+"))
                {
                    placeholder=temp.indexOf("+");
                }
                else if (temp.contains("-"))
                {
                    placeholder=temp.indexOf("-");
                }else if (temp.contains("*"))
                {
                    placeholder=temp.indexOf("*");
                }else if (temp.contains("/"))
                {
                    placeholder=temp.indexOf("/");
                }
                else return;


                num2=Double.parseDouble(temp.substring(placeholder+1,temp.length()));

                switch (s) {
                    case "+": result=num1+num2;
                        break;
                    case "-": result=num1-num2;
                        break;
                    case "*": result=num1*num2;
                        break;
                    case "/": result=num1/num2;
                        break;
                }
                String finalResult=String.valueOf(result);

                totalTextView.setText(finalResult);
            }
        });


        Button bCube = (Button) findViewById(R.id.bCube);
        bCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=Double.parseDouble(totalTextView.getText().toString());
                result=num1*num1*num1;
                String cubeResult=String.valueOf(result);
                totalTextView.setText(cubeResult);

            }

        });


        Button bclear = (Button)findViewById(R.id.bclear);
        bclear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                num1=0;
                num2=0;
                result=0;

               totalTextView.setText("");
            }
        }
        );







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
