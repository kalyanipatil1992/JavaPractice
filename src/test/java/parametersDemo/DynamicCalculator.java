package parametersDemo;

public class DynamicCalculator {
    public static String getFullName(String firstName, String lastName){
        String fullname = firstName+lastName;
        return fullname;
    }
    public int sum(int a, int b){
        int c = a+b;
        return c;
    }
    public double sub(double x,double y){
        double d = y-x;
        return d;
    }
}
