package org.lessons.java.snack;

public class studente {

    private String nome;
    private String cognome;
    private int anni;

    public studente(String nome, String cognome, int anni) {
        this.nome = nome;
        this.cognome = cognome;
        this.anni = anni;
    }

    public String getInfo() {
        return (nome + " " + cognome + ", " + anni + " anni");
    }

}
