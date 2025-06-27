package org.lessons.java.snack;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        studente enrico = new studente("Enrico", "Ciccolini", 35);
        System.out.println(enrico.getInfo());

        ContoBancario mio = new ContoBancario(1234);

        System.out.println(mio.getSaldo());
        mio.addValue(new BigDecimal(15));
        System.out.println(mio.getSaldo());
        mio.subtractValue(new BigDecimal(25));
        System.out.println(mio.getSaldo());
        mio.subtractValue(new BigDecimal(5));
        System.out.println(mio.getSaldo());
    }
}
