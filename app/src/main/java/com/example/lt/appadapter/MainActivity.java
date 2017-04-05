package com.example.lt.appadapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirListaFilmes (View v){
        Intent novaTela = new Intent(this,ListaFilmesActivity.class);
        startActivity(novaTela);
    }
}
