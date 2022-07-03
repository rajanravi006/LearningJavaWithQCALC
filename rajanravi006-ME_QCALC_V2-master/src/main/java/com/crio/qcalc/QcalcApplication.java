
package com.crio.qcalc;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class QcalcApplication {

    public static void main(String[] args) {

        System.out.println("Starting QCalc..");

        LogicCalculator calc = new LogicCalculator();

        calc.divide(10, 5);

        calc.printResult();

    }

}
