package Abstraction;

abstract class Payment{
    int TransId;
    String name;
    double amount;

    Payment(int tid,String n,double a){
        this.TransId = tid;
        this.name = n;
        this.amount = a;
    }
    void disPlay(){
        System.out.println("The cus Name:"+ name);
        System.out.println("The TransId :"+ TransId);
        System.out.println("The amount:"+ amount);
    }
    abstract boolean validate();
    abstract void process();
    abstract double transCal();
    abstract double cashCal();
    abstract double finalCal();

}
class Cerdit extends Payment{
    String Cardnum;
    Cerdit(int TransId,String name,double amount,String card){
        super(TransId,name,amount);
        this.Cardnum = card;
    }

    @Override
    boolean validate() {
        if(Cardnum.length() == 16){
            return true;
        }
        return false;
    }

    @Override
    void process() {
        if(validate()){
            System.out.println("processing!");
            System.out.println("Final Amount" + finalCal());
        }else {
            System.out.println("Not Successful");
        }
    }

    @Override
    double transCal() {
        return amount * 0.02;
    }

    @Override
    double cashCal() {
        return amount * 0.05;
    }

    @Override
    double finalCal() {
        return amount + transCal()-cashCal();
    }
}
class Upi extends Payment{
    String upi ;
    Upi(int TranId,String name,double amount,String upi){
        super(TranId,name,amount);
        this.upi = upi;
    }
    @Override
    boolean validate() {
        if(upi != null && upi.contains("@")){
            return true;
        }
        return false;
    }

    @Override
    void process() {
        if(validate()){
            System.out.println("Processing ");
            System.out.println("final amount" + finalCal());
        }
    }

    @Override
    double transCal() {
        return this.amount * 0.05;
    }

    @Override
    double cashCal() {
        return this.amount * 0.2;
    }

    @Override
    double finalCal() {
        return amount - transCal();
    }
}
class Net extends Payment{
    String accnNo;
    Net(int TranId,String name,double amount,String account){
        super(TranId,name,amount);
        this.accnNo = account;
    }

    @Override
    boolean validate() {
        if(accnNo != null){
            return true;
        }
        return false;
    }

    @Override
    void process() {
        if(validate()){
            System.out.println("Processing paymet!");
            System.out.println("Final amount" + finalCal());
        }
    }

    @Override
    double transCal() {
        return this.amount * 0.01;
    }

    @Override
    double cashCal() {
        return this.amount * 0.01;
    }

    @Override
    double finalCal() {
        return this.amount-transCal();
    }
}


public class Task {
    public static void main(String[] args) {
//       Payment cer = new Cerdit(123,"yuvaraj",1000,"1234567890123456");
//       cer.process();
//       Payment upi = new Cerdit(1234,"mani",2000,"yuvaraj@");
//       upi.process();
       Payment net = new Net(1234,"sameer",3000,"1234567890");
       net.process();

    }
}
