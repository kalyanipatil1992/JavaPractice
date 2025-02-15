package loopDemo;

public class DoWhileLoopDemo {
    public static void main(String[] args){
        int ticket_number=91;
        do{
            System.out.println("Current Ticket Number is: " +ticket_number);
            ticket_number++;
        }while(ticket_number<100);
    }
}
