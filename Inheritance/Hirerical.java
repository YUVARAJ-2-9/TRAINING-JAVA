package Inheritance;
class Class1{
    int a = 500;
}
class Class2 extends Class1{
    int b = 50;
}
class Class3 extends Class1{
    int c = 90;
}
class Class4 extends Class2{
    int d = 100;
}
class Class5 extends Class3{
    int e = 200;
}
class  Class6 extends Class5{
    int f = 300;
}

public class Hirerical {
    public static void main(String[] args) {
        Class2 obj = new Class2();
        System.out.println(obj.b);
        System.out.println(obj.a);
        System.out.println("----Class C----");
        Class3 obj1 = new Class3();
        System.out.println(obj1.c);
        System.out.println(obj1.a);
        Class4 obj2 = new Class4();
        System.out.println(obj2.d);
        System.out.println(obj2.b);
        System.out.println(obj2.a);
        System.out.println("---------");
        Class6 obj4 = new Class6();
        System.out.println(obj4.e);
        System.out.println(obj4.c);
        System.out.println(obj4.a);

    }
}
