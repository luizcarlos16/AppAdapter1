package com.example.lt.appadapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListaFilmesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_filmes);

        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme(1, "A Lagoa Azul", 1988));
        filmes.add(new Filme(2, "A Bela e a Fera", 2017));
        filmes.add(new Filme(3, "Passageiros", 2017));

        ArrayAdapter<Filme> adapter = new FilmeAdapter(this,R.layout.filme_item,filmes);

        ListView listaFilmes = (ListView) findViewById(R.id.listaFilmes);
        listaFilmes.setAdapter(adapter);
    }
}
