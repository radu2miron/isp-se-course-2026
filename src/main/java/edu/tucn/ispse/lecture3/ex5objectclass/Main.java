package edu.tucn.ispse.lecture3.ex5objectclass;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

public class Main {
    public static void main(String[] args) {
        Flower flower1 = new Flower("rose", "red", 30);
        Flower flower2 = new Flower("tulip", "pink", 10);
        Flower flower3 = new Flower("tulip", "pink", 10);

        System.out.println(flower1.toString());
        System.out.println(flower2);

        System.out.println("flower1 == flower2? " + (flower1.equals(flower2))); //false
        System.out.println("flower2 == flower3? " + (flower2.equals(flower3))); //false

        System.out.println("Hash code of flower1: " + flower1.hashCode());
    }
}
