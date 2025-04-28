@FunctionalInterface
interface MyFunctionalInterface{

    void doSomething();
}

interface MyFunctionalInterface2{

    //Sample getSample();
    Sample getSample(int a);
}
class Sample{

    Sample()
    {
        System.out.println("I am constructor of Sample");
    }
    
    Sample(int a)
    {
        System.out.println("Parameterized Constructor");
    }
}
public class MethodAndConstructorRefrence {

    int add()
    {
        System.out.println("I m nonstatic reference function");
        return 2;
    }
    static int m1()
    {
        System.out.println("I m reference func for FI");
        return  0;
    }
    public static void main(String[] args) {

        MyFunationalInterface obj1 = () -> System.out.println("Hi I m calling");
        obj1.doSomething();

        MyFunationalInterface obj2 = MethodAndConstructorRefrence :: m1;
        obj2.doSomething();

        MethodAndConstructorRefrence obj = new MethodAndConstructorRefrence();

        MyFunationalInterface obj3 = obj ::add;
        obj3.doSomething();

        MyFunctionalInterface2 constructorRef = Sample::new;
        //constructorRef.getSample();
        
        MyFunctionalInterface2 constrctoreRef2 = Sample::new;
        constrctoreRef2.getSample(9);

    }
}
