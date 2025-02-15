package VariableDemo;

public class LocalVarDemo {
    int result;
    public static void main(String[] args){
        int x=0;
        System.out.println(x);
    }
    public void printNames(){
        for(int i=0; i<=5; i++){
            System.out.println(i);
        }
        // System.out.println("Value of i is "+i);
    }
    public void marks(){
        int marks= 90;
    }
    public void show(){
        int result = 90;
        System.out.println("Marks are: "+result);
    }

}
