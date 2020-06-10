package com.example.uebung_java_higherlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    int randomNumb;

    private void generateRandomNumber() {

        Random random = new Random();
        randomNumb = random.nextInt(20) + 1;

    }

    public void guess (View view){
        Log.i("Button1", "Der Button funktioniert");

        int guessvalue = Integer.parseInt(editText.getText().toString());

        String message;

        if(guessvalue > randomNumb) {

            message = "Niedriger";
        }else if(guessvalue < randomNumb) {

            message = "Höher";
        }else{

            message = "richtig, try again";
            generateRandomNumber();;
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = findViewById(R.id.editTextNumber);
    }
}