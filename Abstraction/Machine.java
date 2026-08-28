package Abstraction;
abstract class WashinngMachie{
    abstract void StartWashing();
}
class waterLevel extends WashinngMachie{
    int waterlevel = 80;

    @Override
    void StartWashing() {
        System.out.println("Cheching Wtare LEvel");
        System.out.println("Mixing detergent");
        System.out.println("Washing Started");
    }
}

public class Machine {
    public static void main(String[] args) {
        WashinngMachie obj = new waterLevel();
        obj.StartWashing();
    }
}
