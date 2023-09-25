package com.cs407.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    float firstNumber;
    float secondNumber;

    public void addition(View view){
        EditText numberOne = (EditText) findViewById(R.id.editTextText);
        EditText numberTwo = (EditText) findViewById(R.id.editTextText2);

        try{
            firstNumber = Integer.parseInt(numberOne.getText().toString());
            secondNumber = Integer.parseInt(numberTwo.getText().toString());

            float result = firstNumber + secondNumber;

            goToActivity(String.valueOf(result));
        } catch (NumberFormatException e){
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
        }
    }

    public void subtraction(View view){
        EditText numberOne = (EditText) findViewById(R.id.editTextText);
        EditText numberTwo = (EditText) findViewById(R.id.editTextText2);

        try{
            firstNumber = Integer.parseInt(numberOne.getText().toString());
            secondNumber = Integer.parseInt(numberTwo.getText().toString());

            float result = firstNumber - secondNumber;

            goToActivity(String.valueOf(result));
        } catch (NumberFormatException e){
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
        }
    }

    public void multiplication(View view){
        EditText numberOne = (EditText) findViewById(R.id.editTextText);
        EditText numberTwo = (EditText) findViewById(R.id.editTextText2);

        try{
            firstNumber = Integer.parseInt(numberOne.getText().toString());
            secondNumber = Integer.parseInt(numberTwo.getText().toString());

            float result = firstNumber * secondNumber;

            goToActivity(String.valueOf(result));
        } catch (NumberFormatException e){
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
        }
    }

    public void division(View view) throws ArithmeticException{
        EditText numberOne = (EditText) findViewById(R.id.editTextText);
        EditText numberTwo = (EditText) findViewById(R.id.editTextText2);

        try{
            firstNumber = Integer.parseInt(numberOne.getText().toString());
            secondNumber = Integer.parseInt(numberTwo.getText().toString());

            if(secondNumber == 0){
                throw new ArithmeticException();
            }

            float result = firstNumber / secondNumber;

            goToActivity(String.valueOf(result));
        } catch (NumberFormatException e){
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
        } catch (ArithmeticException e){
            Toast.makeText(this, "You can not divide by zero :(", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToActivity(String s){
        Intent intent = new Intent(this, result.class);
        intent.putExtra("result", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}