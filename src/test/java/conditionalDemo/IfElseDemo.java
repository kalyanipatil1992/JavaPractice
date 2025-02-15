package conditionalDemo;

public class IfElseDemo {
    public static void main(String[] args){
        System.out.println("Test Started");
        String browser = "xyz";
        if(browser.equalsIgnoreCase("Chrome")){
            System.out.println("Test is executed on Chrome");
        }
        else{
            System.out.println("Test is executed on Other browser");
        }
        System.out.println("Test End");
    }
}