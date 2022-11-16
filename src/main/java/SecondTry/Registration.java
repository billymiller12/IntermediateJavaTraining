package SecondTry;



public class Registration {
    public static void main(String[] args) {
        try {
            String[] classes = {"Chemistry","Algebra","CS"};
            Student s1 = new Student("Chuck", 3.4,classes);
            System.out.println("Name:"+s1.name+" gpa:"+s1.gpa);
            Student.showAllElements(s1.classes);
        } catch (IllegalArgumentException ie)   {
            System.out.println("problem is: "+ie);
        }


    }
}
