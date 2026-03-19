package edu.tucn.ispse.lecture3.ex4constructors;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

public class Student extends Person {
    private int average;

    public Student() {
//        super("Default Student Name"); // 2. Call the parent constructor with a default name.
        System.out.println("Student constructor called"); // 3.
    }

    @Override
    public void breath() {
        super.breath(); // 4. Call the parent method to show that it works.
        System.out.println("and it is a student");
    }
}
