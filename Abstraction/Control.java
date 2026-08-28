package Abstraction;
abstract class Remote{
    abstract void powerOn();

}
class TvRemote extends Remote{
    @Override
    void powerOn() {
        System.out.println("Tv is Turning on");
    }
}
class AcRemote extends Remote{
    @Override
    void powerOn() {
        System.out.println("Ac is Turning On!");
    }
}

public class Control {
    public static void main(String[] args) {
        Remote ob = new TvRemote();
        Remote ob1 = new AcRemote();
        ob.powerOn();
        ob1.powerOn();
    }
}
