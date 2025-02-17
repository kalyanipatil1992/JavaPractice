package parametersDemo;

public class PassParameters3 {
    public static void main(String[] args){
        DynamicCalculator d = new DynamicCalculator();
        int sum = d.sum(9,9);
        System.out.println("Result of addition: " +sum);
        double sub = d.sub(20,10);
        System.out.println("Result of substraction:" +sub);
        String fullName = DynamicCalculator.getFullName("Kalyani ","Satam");
        System.out.println("Congratulations " +fullName);

    }
}
