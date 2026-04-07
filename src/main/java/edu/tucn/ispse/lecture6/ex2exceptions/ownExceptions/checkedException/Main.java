package edu.tucn.ispse.lecture6.ex2exceptions.ownExceptions.checkedException;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

public class Main {
    public static void main(String[] args) {
        MyInt myInt = new MyInt(9);
        MyInt myInt2 = new MyInt(0);

        try {
            myInt.safeDivide(myInt2);
        } catch (DivisionByZeroException e) {
            e.printStackTrace();
        }
    }
}
