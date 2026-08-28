package Abstraction;

abstract class remote{
    abstract void take();
    abstract void putDown();
}
class remote1 extends remote{
    @Override
    void take() {
        System.out.println("Take the remote and change");
    }

    @Override
    void putDown() {
        System.out.println("change the channel and put down the remote");
    }
}
public class Abs {
    public static void main(String[] args) {
        remote1 rm = new remote1();
        rm.take();
        rm.putDown();
    }
}
