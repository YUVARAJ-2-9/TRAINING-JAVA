package ExceptionHandling;
class Theater{
    int totalSeats;
    Theater(int Ts){
        this.totalSeats = Ts;;
    }
}
class TicketCounter extends Theater{
    int ticReq;
    TicketCounter(int Tr,int ts){
        super(ts);
        this.ticReq = Tr;;
    }
    void bookTicket(){
            if(ticReq > 5){
                throw  new ArithmeticException("Limit exceed!");
            }
        System.out.println("Ticket Booked Successfully!");
    }
}

public class HomeTask {
    public static void main(String[] args) {
        TicketCounter tk = new TicketCounter(100,5);
        try {
            tk.bookTicket();
        } catch (ArithmeticException e) {
            System.out.println("Only 5 tickets");
        }
    }
}
