package TestThisPlease;



public class Computations {
    public static int addInt(int a, int b) {
        return a+b;
    }

    public static double divideDouble(double a, double b){
        if (b == 0) throw new ArithmeticException("Can't divide by zero");
        return a/b;
    }

}
