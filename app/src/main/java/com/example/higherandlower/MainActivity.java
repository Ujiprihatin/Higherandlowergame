package com.example.higherandlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;

    public void randomNumberGenerator() {
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }

    public void onGuess(View view) {
        try {
            String message;
            EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber2);
            int guessedNumber = Integer.parseInt(editTextNumber.getText().toString());
            if (guessedNumber < randomNumber)
                message = "Higher !!";
            else if (guessedNumber > randomNumber)
                message = "Lower !!";
            else {
                message = "You Got Me !!";
                randomNumberGenerator();
            }
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        } catch (NumberFormatException e) {
        System.err.println(e);
        Toast.makeText(this, "Enter Your Guess as a Number 1 to 20", Toast.LENGTH_SHORT).show();
    }

}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
}