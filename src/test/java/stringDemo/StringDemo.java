package stringDemo;

public class StringDemo {
    public static void main(String[] args){
        String name = "Selenium WebDriver";
        boolean status = name.startsWith("Selenium");
        System.out.println("Status is: "+status);
        String name1 = "Welcome to Selenium World";
        boolean status1 = name1.endsWith("QTP");
        System.out.println("Status is: "+status1);
    }

}
