package SecondTry;

import java.util.ArrayList;
import java.util.Arrays;

class Student {
    String name;
    double gpa;
    ArrayList<String> classes;

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

    public static boolean isValid(String name, double gpa, ArrayList<String> classes) {
        return !classes.isEmpty() && gpa >= 0.0 && gpa <= 5.0 && name != null && name.length() >0;
    }

    //public static String asText(Student s) {
    //    return "Name:"+s.name+" GPA:"+s.gpa;
    //}
}

