package edu.tucn.ispse.lecture3.ex5objectclass;

import java.util.Objects;

/**
 * This class explains how to override the equals, hashCode and toString methods from the Object class.
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

public class Flower {
    private String name;
    private String color;
    private int petals;

    public Flower(String name, String color, int petals) {
        this.name = name;
        this.color = color;
        this.petals = petals;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return petals == flower.petals && Objects.equals(name, flower.name) && Objects.equals(color, flower.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, petals);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", petals=" + petals +
                '}';
    }
}
