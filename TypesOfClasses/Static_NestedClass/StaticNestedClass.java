package TypesOfClasses.Static_NestedClass;

class OuterClass{

    int outerInstanceVar = 10;
    static int outerStaticVar = 20;
    static class Inner
    {
        public void display()
        {
            // Static class can access only static members of Outclass and non-static variables are not accessible for same
            // System.out.println(outerStaticVar + outerInstanceVar);
            System.out.println(outerStaticVar);
        }
    }
}
public class StaticNestedClass {
    public static void main(String[] args) {
        OuterClass.Inner obj = new OuterClass.Inner();
        obj.display();

    }
}
