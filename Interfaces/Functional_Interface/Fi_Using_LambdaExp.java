package Interfaces.Functional_Interface;

public class Fi_Using_LambdaExp {
    public static void main(String[] args) {
        FunctionInterfaceExample obj = ()->{
            System.out.println("Abstarct Method body");
        };
        obj.methodAbstract();
    }
    /*
    With Lambda expression we can only provide the method body for abstract method, there is no provision
    of overriding the default method with lambda expression, for overriding the default method we have to use anonymous class
     */
}
