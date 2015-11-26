package com.example.tornado_001.assignment_1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends ActionBarActivity {

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    Random r=new Random();
    int temp=r.nextInt(1001);
    public void show(View view)
    {
        EditText e;
        e=(EditText) findViewById(R.id.input);

        int c=0;
        try {
            int number = Integer.parseInt(e.getText().toString());
            if(number==temp)
            {
                Toast.makeText(this, "             Congratulations \n You entered the same number ", Toast.LENGTH_LONG).show();
            }
            else {
                for (int i = 1; i <= 5; i++) {
                    if ((number + i) == temp || (number - i) == temp) {
                        Toast.makeText(this, "Very closed to the number ", Toast.LENGTH_LONG).show();
                        c = 1;
                        break;
                    }

                }
                if (c == 0) {
                    if (number > temp) {

                        Toast.makeText(this, "Greater than the number ", Toast.LENGTH_LONG).show();

                    } else if (number < temp) {
                        Toast.makeText(this, "Less than the number ", Toast.LENGTH_LONG).show();

                    }
                }
            }

        }
        catch (Exception ee)
        {
            Toast.makeText(this, "Error : invalid input ", Toast.LENGTH_LONG).show();
        }


    }

}
