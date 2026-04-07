package edu.tucn.ispse.lecture6.ex2exceptions.ownExceptions.uncheckedException;


/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

public class Main {
    public static void main(String[] args) {
        MyInt myInt = new MyInt(8);
        MyInt myInt2 = new MyInt(0);

        myInt.safeDivide(myInt2); // this line will throw an exception (and it is not handled)
    }
}
