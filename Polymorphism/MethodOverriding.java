package Polymorphism;
class MyData1{
    void print(){
        System.out.println("one");
    }
}
class MyData2 extends MyData1{
    void print(){
        System.out.println("two");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        MyData1 obj1 = new MyData2();
        obj1.print();
    }
}
