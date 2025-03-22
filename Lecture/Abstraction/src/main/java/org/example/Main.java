package org.example;

import java.io.FileInputStream;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Student();
        Person person2 = new Person();
        Student student1 = new Student();
        Staff staff1 = new Staff();

        System.out.println(Person.personNo);
    }
}