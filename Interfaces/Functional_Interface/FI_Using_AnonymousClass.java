package Interfaces.Functional_Interface;


public class FI_Using_AnonymousClass {
    public static void main(String[] args) {
        FunctionInterfaceExample obj = new FunctionInterfaceExample() {
            @Override
            public void methodAbstract() {
                System.out.println("Overriden by using amonymous class");
            }

            @Override
            public void methodDefault1() {
                FunctionInterfaceExample.super.methodDefault1();
                System.out.println("Overriden default method as well");
            }
        };

        obj.methodAbstract();
        obj.methodDefault1();
    }
}
