package Interfaces;

public interface Java8Child extends Java8Interface{

    @Override
    default void defaultMethod() {
        Java8Interface.super.defaultMethod();
        System.out.println("Override the default method of parent interface");
    }
}
