package org.example;

import java.util.Formatter;
class Student {
    String name;
    double gpa;


    public Student(String name, double gpa) {
        if (isBothValid(name, gpa)) {
            this.name = name;
            this.gpa = gpa;
        } else {
            throw new IllegalArgumentException ("Please enter valid name and gpa");
        }
    }

    public static boolean isBothValid(String name, double gpa) {
        return gpa >=0.0 && gpa <=5.0 && name != null && name.length()>0;
    }

}


public class Main {
    public static void main(String[] args) {

        try {
            Student s1 = new Student("", 3.5);
            System.out.println("Name :"+ s1.name+", GPA:"+s1.gpa);
        } catch (IllegalArgumentException ie) {
            System.out.println(ie);
        }
        System.out.println("Still running");


    }
}