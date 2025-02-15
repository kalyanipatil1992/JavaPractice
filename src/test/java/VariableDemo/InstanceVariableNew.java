package VariableDemo;

public class InstanceVariableNew {
    int rollNo = 30;
    double marks = 95.94;

    public static void main(String[] args){
        InstanceVariableNew obj1 = new InstanceVariableNew();
        obj1.show();
        InstanceVariableNew obj2 = new InstanceVariableNew();
        obj2.show();
        InstanceVariableNew obj3 = new InstanceVariableNew();
        obj3.show();
    }
    public void show(){
        System.out.println("Roll No: "+rollNo +" "+"and Marks:" +marks);
    }
}
