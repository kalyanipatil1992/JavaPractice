package VariableDemo;

public class InstanceVariable {
    int rollNo;
    double marks;

    public InstanceVariable(int rollNo, double marks){
        this.rollNo = rollNo;
        this.marks = marks;

    }

    public static void main(String[] args){
        InstanceVariable obj1 = new InstanceVariable(1,80.90);
        obj1.show();
        InstanceVariable obj2 = new InstanceVariable(2,90.00);
        obj2.show();
        InstanceVariable obj3 = new InstanceVariable(3,70.80);
        obj3.show();
    }
    public void show(){
        System.out.println("RollNo: " +rollNo + " " + "Marks: "+marks);
    }
}
