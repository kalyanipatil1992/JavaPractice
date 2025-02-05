package conditionalDemo;

public class IfElseDemo {
    public static void main(String[] args){
        System.out.println("Test Started");
        String browser = "IE";
        if(browser.equalsIgnoreCase("Chrome")){
            System.out.println("Test is executed on Chrome");
        }
        else{
            System.out.println("Test is executed on Firefox");
        }
        System.out.println("Test End");
    }
}