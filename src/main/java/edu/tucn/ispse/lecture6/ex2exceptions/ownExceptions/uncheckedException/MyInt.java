package edu.tucn.ispse.lecture6.ex2exceptions.ownExceptions.uncheckedException;


/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

class MyInt {
    private int v;

    public MyInt(int v) {
        this.v = v;
    }

    public MyInt safeDivide(MyInt d) { // 'throws' is missing since DivisionByZeroExceptionUC is unchecked
        if(d.v == 0) {
            throw new DivisionByZeroExceptionUC("Division by zero");
        }
        return new MyInt(this.v/d.v);
    }
}