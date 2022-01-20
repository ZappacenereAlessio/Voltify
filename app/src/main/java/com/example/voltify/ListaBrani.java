package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ListaBrani extends AppCompatActivity {

    private String titolo;
    public  static final String TITOLO = "TITOLO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_brani);

        TextView lBrani =(TextView)findViewById(R.id.textView6);

        Intent intent = getIntent();
        titolo = intent.getStringExtra(TITOLO);

        lBrani.setText(titolo);

    }

}