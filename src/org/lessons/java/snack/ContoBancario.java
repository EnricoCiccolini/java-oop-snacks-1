package org.lessons.java.snack;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContoBancario {

    private int numeroConto;
    private BigDecimal saldo;

    public ContoBancario(int numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = BigDecimal.valueOf(0);
    }

    public BigDecimal getSaldo() {
        return this.saldo.setScale(2, RoundingMode.DOWN);
    }

    public void subtractValue(BigDecimal value) {
        if (this.saldo.compareTo(value) >= 0) {
            this.saldo = this.saldo.subtract(value);
        } else {
            System.out.println("fondi insufficenti per l operazione richiesta ");
        }
    }

    public void addValue(BigDecimal value) {
        this.saldo = this.saldo.add(value);
    }

}
