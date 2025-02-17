package parametersDemo;

public class PassParameters2 {
    public static void main(String[] args){
        PassParameters2 obj = new PassParameters2();
        int sum = obj.sum(9,6);
        System.out.println("Result of Sum: " +sum);
        double sub =obj.sub(20,25);
        System.out.println("Result od Sub:" +sub);

    }
    public int sum(int a,int b){
        int c = a+b;
        return c;
    }
    public double sub(double x,double y){
        double d =y-x;
        return d;
    }
}
