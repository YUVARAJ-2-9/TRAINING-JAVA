package Inheritance;
class ClassA{
    int a = 10;
    public void printData(int a,int b){
        System.out.println("Class A");
    }
}
class ClassB extends ClassA{
    int a = 30;
    public void printData(int a) {
        System.out.println("Class B");
    }
}
public class Single {
    public static void main(String[] args) {
        ClassB obj = new ClassB();
        System.out.println(obj.a);
        obj.printData(10,20);
    }
}
