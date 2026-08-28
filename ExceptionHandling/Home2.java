package ExceptionHandling;
class BankAccount{
    int accountId;
    int currentBalance;
    int dailyLimit;
BankAccount(int acc,int curr,int dayily){
        this.accountId = acc;
        this.currentBalance = curr;
        this.dailyLimit = dayily;
}
}
class SecureTransaction extends BankAccount{
    int withdrawalAmount;
    SecureTransaction(int acc,int curr,int daily,int withdrawalAmount){
        super(acc,curr,daily);
        this.withdrawalAmount = withdrawalAmount;;
    }
    void processWithdrawal(){
        if(withdrawalAmount > dailyLimit){
            throw new IllegalArgumentException();
        }
        else {
            // Error illana mattum dhaan indha code run aaganum
            currentBalance -= withdrawalAmount;
            System.out.println("Transaction SuccessFull!");
            System.out.println("Remaining Balance: " + currentBalance);
        }

    }
}
public class Home2 {
    public static void main(String[] args) {
        SecureTransaction sc = new SecureTransaction(101,100000,25000,5000);
        try {
            throw  new IllegalArgumentException("Daily Limit Over!");
        }catch (Exception e){
            System.out.println("Security Alert! You cannot withdraw more than the daily limit of 25000!");
        }
        sc.processWithdrawal();
    }
}
