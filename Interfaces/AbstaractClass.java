package Interfaces;

/*
Abstract class can implement the interface , it can provide the body of methods present in interfacse
or mark them abstract so this class child will provide implemenation

Abstract class doesn't have any restriction to implement all methods of interface
 */
public abstract class AbstaractClass implements NonFlyingLiving{
    @Override
    public void fly() {

    }

    public abstract void canRun();
}
