package com.jose.smartsync;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView contactos,fotos,musica,calendario,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactos = (TextView)findViewById(R.id.txtcontactos);
        fotos = (TextView)findViewById(R.id.txtfotos);
        musica = (TextView)findViewById(R.id.txtmusica);
        calendario = (TextView)findViewById(R.id.txtcalendario);
        email = (TextView)findViewById(R.id.txtmail);

        Typeface face=Typeface.createFromAsset(getAssets(),"fonts/roboto-thin.ttf");
        contactos.setTypeface(face);
        fotos.setTypeface(face);
        musica.setTypeface(face);
        calendario.setTypeface(face);
        email.setTypeface(face);

    }
}
