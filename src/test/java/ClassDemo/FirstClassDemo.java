package ClassDemo;

public class FirstClassDemo {
    int x = 100;
    int y= 90;
    public static void main(String[] args){

        System.out.println("Program Started");
        FirstClassDemo obj1 = new FirstClassDemo();
        obj1.sum();
        System.out.println("Value of x is " +obj1.x);
        System.out.println("Value of y is " +obj1.y);

        FirstClassDemo obj2 = new FirstClassDemo();

        System.out.println("Value of x: " +obj2.x);
        System.out.println("Value of y:" +obj2.y);

        System.out.println("Program ended");

    }
    public void sum(){
        int a = 90;
        int b = 80;
        int c = a + b;
        System.out.println("Sum of two numbers is: " +c);
    }
}
