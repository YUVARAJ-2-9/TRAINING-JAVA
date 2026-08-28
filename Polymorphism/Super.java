package Polymorphism;
class Employee{
    String name;
    Employee(String name){
        this.name = name;
    }
}
class Payment extends Employee{
    int salary;
    Payment(String name,int salary){
        super(name);
        this.salary = salary;
    }
}
public class Super {
    public static void main(String[] args) {
        Payment pay = new Payment("yuvaraj",50000);
        System.out.println(pay.name);
    }
}
