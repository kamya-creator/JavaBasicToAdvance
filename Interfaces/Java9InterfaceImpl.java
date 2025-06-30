package Interfaces;

class Java9InterfaceImpl_ implements Java9PrivateMethodinInterface
{

    @Override
    public void methodAbstract() {
        System.out.println("Provided method body-----------");
    }
}

public class Java9InterfaceImpl {
    public static void main(String[] args) {
        Java9PrivateMethodinInterface obj = new Java9InterfaceImpl_();

        obj.methodAbstract();
        obj.methodDefault();
        Java9PrivateMethodinInterface.methodStatic();
    }
}
