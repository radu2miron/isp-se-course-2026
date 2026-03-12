package edu.tucn.ispse.lecture2.ex4;

import java.util.Date;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

public class Bread {
    private String flour;
    private boolean sourdough;
    private Date expiryDate;
    private String color;
    private int weightInGrams;
    private float price;

    public Bread(String flour, boolean sourdough, Date expiryDate, String color, int weightInGrams, float price) {
        this.flour = flour;
        this.sourdough = sourdough;
        this.expiryDate = expiryDate;
        this.color = color;
        this.weightInGrams = weightInGrams;
        this.price = price;
    }

    public void grow() {
        System.out.printf("the %s bread grows\n", this.color);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "flour='" + this.flour + '\'' +
                ", sourdough=" + this.sourdough +
                ", expiryDate=" + this.expiryDate +
                ", color='" + this.color + '\'' +
                ", weightInGrams=" + this.weightInGrams +
                ", price=" + this.price +
                '}';
    }
}
