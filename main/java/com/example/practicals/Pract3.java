package com.example.practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Pract3 extends AppCompatActivity {

    TextView KilogramInput=findViewById(R.id.KilogramInput);
    Button ConvertToPounds;
    Button NextPractical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pract3);
        //Intent intObject = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:21.0682849,73.1333266"));
        //startActivity(intObject);
        InitControl();
    }

    private void InitControl()
    {
        KilogramInput = findViewById(R.id.KilogramInput);
        ConvertToPounds = findViewById(R.id.ConvertToPounds);
        NextPractical = findViewById(R.id.NextPract2);

        Toast.makeText(getApplicationContext(),"pract3",Toast.LENGTH_LONG).show();
        ConvertToPounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float kg = Float.parseFloat(KilogramInput.getText().toString());
                    float ans_in_pound = kg * 2.20462f;
                    Toast.makeText(getApplicationContext(),ans_in_pound + "",Toast.LENGTH_LONG).show();
                }
                catch(Exception error) { }
            }
        });

        NextPractical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intObject = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intObject);
            }
        });
    }
}