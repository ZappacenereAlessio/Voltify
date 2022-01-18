package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button inserisci=(Button)findViewById(R.id.button3);
        Button visualizza=(Button)findViewById(R.id.button4);

        EditText titolo=(EditText)findViewById(R.id.editText);
        EditText autore=(EditText)findViewById(R.id.editText2);
        EditText durata=(EditText)findViewById(R.id.editText3);

        Spinner genere=(Spinner)findViewById(R.id.spinner);

        GestoreBrani gestoreBrani = new GestoreBrani();

        inserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gestoreBrani.aggBrano(titolo.getText().toString(), autore.getText().toString(), genere.getSelectedItem().toString(), Integer.getInteger(durata.getText().toString()));

            }
        });

        visualizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}