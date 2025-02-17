package stringDemo;

public class StringDemo2 {
    public static void main(String[] args){
        String actuals = "Welcome to the Selenium WebDriver World";
        String expected = "Welcome to the Selenium WebDriver World";

        boolean status = actuals.equalsIgnoreCase(expected);
        System.out.println("Status is" +status);
    }
}
