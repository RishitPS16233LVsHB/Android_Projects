package com.example.practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Pract2 extends AppCompatActivity {

    Button NextPractical;
    Button Convert;
    TextView CelciusInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pract2);
        InitControl();
        Toast.makeText(getApplicationContext(),"pract2",Toast.LENGTH_LONG).show();
    }

    private void ConvertCelcius()
    {
        try {
            float temperature = Float.parseFloat(CelciusInput.getText().toString());
            float cel = (temperature - 32) * (5.0f/9.0f);
            Toast.makeText(getApplicationContext(),cel + "",Toast.LENGTH_LONG).show();
        }
        catch(Exception error){}
    }

    private void InitControl(){
        CelciusInput = findViewById(R.id.Celcius);
        Convert = findViewById(R.id.ConvertButton);
        NextPractical = findViewById(R.id.NextPract1);


        Toast.makeText(getApplicationContext(),(NextPractical == null) + "",Toast.LENGTH_LONG).show();
        Convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConvertCelcius();
            }
        });
        NextPractical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intObject = new Intent(getApplicationContext(),Pract3.class);
                Toast.makeText(getApplicationContext(),"to pract 3",Toast.LENGTH_LONG).show();
                startActivity(intObject);
            }
        });
    }
}