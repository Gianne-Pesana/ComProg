package org.example;

public class Student extends Person {
//    public Student() {}
    public Student(String name) {
        super(name);
    }

    @Override
    public String introduction() {
        return "Hello student";
    }
}
