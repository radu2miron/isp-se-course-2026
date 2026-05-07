package edu.tucn.ispse.lecture10.ex10volatile;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

public class Main {
    public static void main(String[] args) {
        new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
        }).start();

        new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
        }).start();

        new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
        }).start();
    }
}