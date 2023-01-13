package com.example.practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {

    TextView NumberInput;
    Button button;
    Button NextAct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initControls();
    }

    private void palindromeOrNot()
    {
        try{
            String number = NumberInput.getText().toString();
            String revNumber = "";

            for(int i=number.length()-1;i>=0;i--)
                revNumber += number.charAt(i);

            int Number1 = Integer.parseInt(number);
            int Number2 = Integer.parseInt(revNumber);
            if(Number1 == Number2)
                Toast.makeText(getApplicationContext()  ,"palindrome",Toast.LENGTH_LONG).show();
            else
                Toast.makeText(getApplicationContext()  ,"not palindrome",Toast.LENGTH_LONG).show();

        }
        catch(Exception error) {

        }
    }

    private void initControls()
    {
        NumberInput = findViewById(R.id.editTextNumber);
        button = findViewById(R.id.button);
        NextAct = findViewById(R.id.button2);

        Toast.makeText(getApplicationContext(),"pract1",Toast.LENGTH_LONG).show();
        NextAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intObject = new Intent(getApplicationContext(),Pract2.class);
                startActivity(intObject);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                palindromeOrNot();
            }
        });
    }

}