package org.example;

public abstract class Person {
    static int personNo;
    public String name;
    public int age;

    public Person(){
        personNo++;
    }

    public Person(String name) {
        this.name = name;
    }

    abstract String introduction();

}
