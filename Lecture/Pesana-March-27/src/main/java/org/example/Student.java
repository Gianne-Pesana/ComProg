package org.example;

public class Student extends Person{
    private String studentID;
    private String program;

    public Student() {
    }



    public Student(String studentID, String program) {
        this.studentID = studentID;
        this.program = program;
    }

    public Student(String name, int age, String address, String studentID, String program) {
        super(name, age, address);
        this.studentID = studentID;
        this.program = program;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String introduction() {
        return getName() + " " + getAge() + " " + " " + getAddress() + " " + getStudentID() + " " + getProgram();
    }

}
