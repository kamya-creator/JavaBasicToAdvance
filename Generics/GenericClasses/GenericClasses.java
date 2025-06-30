package Generic.GenericClasses;

class Print1<T>
{
    T a;
    public void setA(T a)
    {
        this.a  = a;
    }
    public T getA()
    {
        return this.a;
    }
}
public class GenericClasses {
    public static void main(String[] args) {
        Print1<Integer> print1 = new Print1<Integer>();
        print1.setA(10);
        System.out.println(print1.getA());

        Print1<String> print2 = new Print1<String>();
        print2.setA("Krishna");
        System.out.println(print2.getA());

        /*
        Ab Hame baar baar typecast nhi krna pad raha h, while creating object itself we declared what datatype of object will hold
         */

       // Print1<int> obj = new Print1<int>(); // Generic Class only compatible with non-primitive classes

    }
}
