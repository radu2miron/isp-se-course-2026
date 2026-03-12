package edu.tucn.ispse.lecture2.ex4;

import java.util.Date;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

public class Main {
    public static void main(String[] args) {
        createBread();

        long sevenDaysInMillis = 7 * 24 * 60 * 60 * 1000;

        Bread bread = new Bread("integral", true, new Date(System.currentTimeMillis() + sevenDaysInMillis), "pink", 1000, 9.5f);
        bread.grow();
        System.out.println(bread.toString());

        Bread bread1 = new Bread("white", false, new Date(System.currentTimeMillis() + sevenDaysInMillis), "white", 1500, 2f);
        System.out.println(bread1);
    }

    public static void createBread() {
        Bread breadX = new Bread("black", true, new Date(System.currentTimeMillis() + 1000000), "brown", 900, 12f);
        System.out.println(breadX);
    }
}
