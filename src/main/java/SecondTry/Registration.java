package SecondTry;



public class Registration {
    public static void main(String[] args) {
        try {
            String[] classes = {"Chemistry","Algebra","CS"};
            Student s1 = new Student("Chuck", 3.4,classes);
            System.out.println(s1.asText());
            System.out.println(s1.toString());
        } catch (IllegalArgumentException ie) {
            System.out.println("problem is: " + ie);
        }
    }
}
