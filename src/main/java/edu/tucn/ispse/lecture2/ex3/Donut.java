package edu.tucn.ispse.lecture2.ex3;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

public class Donut {
    private String topping;
    private float price;
    private int calories;

    public Donut(String topping, float price, int calories) {
        this.topping = topping;
        this.price = price;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Donut{" +
                "topping='" + topping + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}
