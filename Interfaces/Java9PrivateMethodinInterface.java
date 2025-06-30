package Interfaces;

public interface Java9PrivateMethodinInterface {


    public abstract void methodAbstract();

    public static void methodStatic()
    {
        // static method can access only static methods
        System.out.println("Static Method starts-------------");

        methodPrivateStatic();
        System.out.println("Static Method of interface");
        System.out.println("Static Method ends-------------");

    }

    default void methodDefault()
    {
        // non-static methods can access non-static as well as static methods
        System.out.println("Default Method starts-------------");
        methodPrivateStatic();
        methodPrivate();
        System.out.println("default method of Interface");
        System.out.println("Default Method End-------------");

    }


    /*
    Both private methods - private , and private static methods are not accessible to the child of interface, these methods are for
    interface default and abstract methods,
     */
    private void methodPrivate() {
        System.out.println("Private Method of Interface");
    }

    private static void methodPrivateStatic()
    {
        System.out.println("Private static method of interface");
    }
}
