package Inheritance;
class  Classa{
    int a = 10;
}
class Classb extends Classa{
    int b = 20;
}
class  Classc extends Classb{
    int c = 30;
}
public class MultiLevel {
    public static void main(String[] args) {
        Classb obj = new Classb();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println("---------MULTI LEVEL--------");
        Classc obj1 = new Classc();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(obj1.c);
    }
}
