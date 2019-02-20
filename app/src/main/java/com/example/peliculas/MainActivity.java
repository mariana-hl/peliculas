package com.example.peliculas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txttitulo1, txtdescripcion1, txttitulo2, txtdescripcion2, txttitulo3, txtdescripcion3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txttitulo1 = (TextView) findViewById(R.id.textView) ;
        txtdescripcion1 = (TextView) findViewById(R.id.textView2) ;
        txttitulo2 = (TextView) findViewById(R.id.textView3) ;
        txtdescripcion2 = (TextView) findViewById(R.id.textView4) ;
        txttitulo3 =(TextView) findViewById(R.id.textView5) ;
        txtdescripcion3 = (TextView) findViewById(R.id.textView6) ;

        txttitulo1.setText("Battle Angel") ;
        txtdescripcion1.setText(" A deactivated female cyborg is revived, but cannot remember anything of her past life and goes on a quest to find out who she is. " );
        txttitulo2.setText("Green Book");
        txtdescripcion2.setText(" A working-class Italian-American bouncer becomes the driver of an African-American classical pianist on a tour of venues through the 1960s American South. ");
        txttitulo3.setText("How to Train Your Dragon: The Hidden World");
        txtdescripcion3.setText(" When Hiccup discovers Toothless isn't the only Night Fury, he must seek \"The Hidden World\", a secret Dragon Utopia before a hired tyrant named Grimmel finds it first. ");
    }
}
