package Abstraction;
abstract class Atm{
    abstract void withDraw(int amount);
}
class Sbi extends Atm{
    int accBal = 10000;

    @Override
    void withDraw(int amount) {
        System.out.println("Processing transaction at SBI ATM");
        if(amount <= accBal){
            accBal -= amount;
            System.out.println("Please Collect your Cash" + amount);
            System.out.println("Remaing Balance "+ accBal);
        }
        else {
            System.out.println("Insufficient Balance!");
        }
    }
}

public class Money {
    public static void main(String[] args) {
        Atm obj = new Sbi();
        obj.withDraw(2000);
    }
}
