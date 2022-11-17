package SecondTry;

import java.util.ArrayList;
import java.util.Arrays;

class Student {
     private String name;
     private double gpa;
     private ArrayList<String> classes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public ArrayList<String> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<String> classes) {
        this.classes = classes;
    }

    public Student(String name, double gpa, String[] classList) {
        ArrayList<String> tempList = new ArrayList<>(Arrays.asList(classList));
        if (isValid(name, gpa, tempList)) {
            this.gpa=gpa;
            this.name=name;
            this.classes = new ArrayList<>(Arrays.asList(classList));
        } else {
            throw new IllegalArgumentException("Please enter valid name and gpa");
        }


    }

    public boolean isValid(String name, double gpa, ArrayList<String> classes) {
        return !classes.isEmpty() && gpa >= 0.0 && gpa <= 5.0 && name != null && name.length() >0;
    }

    @Override
    public String toString() {
        return name +
                "'s classes:" + classes;
    }


    public String asText() {
        return "Student: name=" + name + ", gpa=" + gpa;
    }
    //public static String asText(Student s) {
    //    return "Name:"+s.name+" GPA:"+s.gpa;
    //}
    //
}

