package ClassDemo;

public class SecondClassDemo {
    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println("Program Started");
        c.sum();
        c.sub();
        System.out.println("Name is: "+c.name);
        System.out.println("Job is: "+c.job);
        System.out.println("Program Ended");
    }
}
