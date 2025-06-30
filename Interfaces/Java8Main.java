package Interfaces;

class Example implements Java8Child
{

    @Override
    public void abstractMethod() {
        System.out.println("Provided the body for abstract method");
    }
}
public class Java8Main {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.abstractMethod();
        obj.defaultMethod();
    }
}
