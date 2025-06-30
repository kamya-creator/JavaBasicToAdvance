package Interfaces.Functional_Interface;


/*
Interface having single abstract method is called functional interface
FI can have any number of static , default or private methods -- no issues, but it must have single abstract method(SAM)
 */

/*
@FunctionalInterface restricts the interface have exactly one public abstract method
 */
@FunctionalInterface
public interface FunctionInterfaceExample {
    public abstract void methodAbstract();

    public static void methodStatic1()
    {

    }

    public static void methodStatic2()
    {

    }

    default void methodDefault1()
    {

    }

    default void methodDefault2()
    {

    }


    private static void methodPrivateStatic1()
    {

    }

    private static void methodPrivateStatic2()
    {

    }
}
