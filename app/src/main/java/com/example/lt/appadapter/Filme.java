package com.example.lt.appadapter;

/**
 * Created by LT on 29/03/2017.
 */

public class Filme {
    private int ID;
    private String titulos;
    private int ano;

    public Filme() {}

    public Filme(int ID, String titulos, int ano) {
        this.ID = ID;
        this.titulos = titulos;
        this.ano = ano;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
