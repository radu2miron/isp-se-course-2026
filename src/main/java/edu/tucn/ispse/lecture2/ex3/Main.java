package edu.tucn.ispse.lecture2.ex3;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

public class Main {
    public static void main(String[] args) {
        Donut donut1 = new Donut("chocolate", 7.5f, 300);
        String donut1AsString = donut1.toString();
        System.out.println(donut1AsString);

        Donut donut2 = new Donut("vanilla", 7f, 320);
        String donut2AsString = donut2.toString();
        System.out.println(donut2AsString);

        createAndPrintDonut("strawberry", 8f, 350);

        System.out.println("Hello world!");
        System.out.println("Hello Universe!");
    }

    public static void createAndPrintDonut(String topping, float price, int calories) {
        Donut donut = new Donut(topping, price, calories);
        String donutAsString = donut.toString();
        System.out.println(donutAsString);
    }
}
