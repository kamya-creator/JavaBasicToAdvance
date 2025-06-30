package Interfaces;


class BChildClass implements NestedInterfcae.B
{

    @Override
    public void BMethod() {
        System.out.println("Implemented Inner Interface");
    }
}

public class NestedInterfaceChildClass implements NestedInterfcae{
    @Override
    public void canFly() {
        System.out.println("Implemented Outer Interface");
    }

    public static void main(String[] args) {
        NestedInterfcae obj = new NestedInterfaceChildClass();
        obj.canFly();

        NestedInterfcae.B obj2 = new BChildClass();
        obj2.BMethod();

    }
}
