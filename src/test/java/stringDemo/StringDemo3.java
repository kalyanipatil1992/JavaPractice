package stringDemo;

public class StringDemo3 {
    public static void main(String[] args){
        String actual = "Welcome to the Selenium WebDriver World";
        String expected = "Selenium";
        boolean status = actual.contains(expected);
        System.out.println("Status is" +status);
    }
}
