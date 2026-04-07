package edu.tucn.ispse.lecture6.ex2exceptions.ownExceptions.uncheckedException;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

class DivisionByZeroExceptionUC extends RuntimeException {
    public DivisionByZeroExceptionUC(String message) {
        super(message);
    }
}
