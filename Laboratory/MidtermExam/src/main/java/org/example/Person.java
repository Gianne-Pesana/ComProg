package org.example;

public abstract class Person {
    String name;
    int age;
    String contactNumber;

    public Person() {}

    public Person(String name, int age, String contactNumber) {
        this.name = Main.formatString(name);
        this.age = age;
        this.contactNumber = Main.formatString(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public abstract String summary();

    @Override
    public String toString() {
        return name + " " + age + " " + contactNumber;
    }
}
