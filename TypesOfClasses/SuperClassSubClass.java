package TypesOfClasses;

class A{
    void ADisplay()
    {
        System.out.println("A is displayed");
    }
}
class B{
    void BDisplay()
    {
        System.out.println("B is displayed");
    }
}
public class SuperClassSubClass {
    public static void main(String[] args) {

        /*
        Object class is Super class of every class so, yes it can hold the reference of any class
         */
        Object obj = new A();
        Object obj2 = new B();
        System.out.println(obj.getClass());
        System.out.println(obj2.getClass());
    }
}
