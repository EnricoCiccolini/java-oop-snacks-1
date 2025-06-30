package org.lessons.java.snack;

public class RegistroStudenti {

    private int numStudenti = 0;
    private studente registro[] = new studente[numStudenti];

    public int getNumberStudent() {
        return numStudenti;
    }

    // public void addStudent(String Nome, String cognome, int age) {
    // String NameComplete = Nome + " " + cognome + "di " + age + " anni";
    // this.numStudenti++;
    // String nuovoRegistro[] = new String[numStudenti];
    // for (int i = 0; i < registro.length; i++) {
    // nuovoRegistro[i] = registro[i];
    // }
    // this.registro = nuovoRegistro;
    // nuovoRegistro[(numStudenti - 1)] = NameComplete;
    // registro = nuovoRegistro;

    // }

    public void addStudent(studente studente) {

        this.numStudenti++;
        studente nuovoRegistro[] = new studente[numStudenti];
        for (int i = 0; i < registro.length; i++) {
            nuovoRegistro[i] = registro[i];
        }
        this.registro = nuovoRegistro;
        nuovoRegistro[(numStudenti - 1)] = studente;
        registro = nuovoRegistro;

    }

    public String getAllClassStudent() {
        String AllClass = "la classe è composta da ";
        for (int i = 0; i < registro.length; i++) {

            AllClass = (AllClass + ", " + registro[i].getInfo());
        }
        return AllClass;
    }

}
