package com.mikezalik.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.String.format;

public class MainActivity extends AppCompatActivity {

public void convertCurrency (View view){
    EditText editText = findViewById(R.id.editText);
    String amountInPesos = editText.getText().toString();
    double amountInPesosDouble = Double.parseDouble(amountInPesos);
    double amountInDollarsDouble = amountInPesosDouble * 0.053;
    String convertAmount = format("%.2f", amountInDollarsDouble);

    Toast.makeText(this, "$" + amountInPesos + convertAmount + "USD", Toast.LENGTH_LONG).show();

    Log.i ("This works!","This also works!");

}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
