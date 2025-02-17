package parametersDemo;

public class PassParameters {
    public static void main(String[] args) {
        PassParameters obj = new PassParameters();
        obj.add(4, 5);
        obj.sub(10, 15);

    }

    public void add(int a, int b) {
        int c = a + b;
        System.out.println("Addition Result is: " + c);
    }

    public void sub(double x, double y) {
        double d = y - x;
        System.out.println("Subtraction Result is: " + d);
    }
}

