package Interfaces.Functional_Interface;

class FunctionalInterfaceImplExmp implements FunctionInterfaceExample
{

    @Override
    public void methodAbstract() {
        System.out.println("Abstract method implemented");
    }
}
public class FunctionalInterfaceImplUsingImplentation {
    public static void main(String[] args) {
        FunctionInterfaceExample obj = new FunctionalInterfaceImplExmp();
        obj.methodAbstract();
        obj.methodDefault1();
    }
}
