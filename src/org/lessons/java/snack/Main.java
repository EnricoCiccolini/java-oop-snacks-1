package org.lessons.java.snack;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        System.out.println("------snack1-------");

        studente enrico = new studente("Enrico", "Ciccolini", 35);
        studente pincopallo = new studente("Pinco", "pallo", 35);
        System.out.println(enrico.getInfo());
        System.out.println(pincopallo.getInfo());
        ContoBancario mio = new ContoBancario(1234);
        System.out.println("------snack2-------");
        System.out.println(mio.getSaldo());
        mio.addValue(new BigDecimal(15));
        System.out.println(mio.getSaldo());
        mio.subtractValue(new BigDecimal(25));
        System.out.println(mio.getSaldo());
        mio.subtractValue(new BigDecimal(5));
        System.out.println(mio.getSaldo());
        System.out.println("------snack3-------");
        RegistroStudenti clase141 = new RegistroStudenti();
        clase141.addStudent(enrico);
        clase141.addStudent(pincopallo);
        System.out.println(clase141.getAllClassStudent());
        System.out.println(clase141.getNumberStudent());

    }
}
