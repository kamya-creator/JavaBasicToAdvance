package Interfaces;

public interface Java8Interface {

    public abstract void abstractMethod();

    /*
    Java 8 provided default method feature in interface to support backward compatibility
    Suppose if a new method is introduced in the interface then all the child classes have to provide its implementation, with the help of
    default java removed the overhead to provide implementation , child class can override the default method as well to accommodate its changes or behaviour
     */
    default void defaultMethod()
    {
        System.out.println("I am default method of Interface");
    }

    static void staticMethod()
    {
        System.out.println("Static method of Interface");

    }

}
