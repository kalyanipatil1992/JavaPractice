package conditionalDemo;

public class IfElseIfDemo {
    public static void main(String[] args){
        String browser = "IoireoE";
        if(browser.equalsIgnoreCase("Chrome")){
            System.out.println("Test executed in Chrome");
        }else if(browser.equalsIgnoreCase("Firefox")) {
            System.out.println("Test executed in Firefox");
        }else if(browser.equalsIgnoreCase("IE")) {
            System.out.println("Test executed in IE");
        }else{
            System.out.println("Please select the valid browser");
            }
        }
    }
