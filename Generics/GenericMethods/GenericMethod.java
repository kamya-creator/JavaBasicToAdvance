package Generic.GenericMethods;

class GenericClass<T>
{
    T var1;

}
class Example{

    public <T> T identity(T value)
    {
        return value;
    }

    public <T> void genericMethodArgument(T param1, T param2)
    {
        System.out.println(param1 + " "  + param2);
    }
}
public class GenericMethod {
    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println(obj.identity("KRISHNA") + " " +
        obj.identity(100)+ " " +
        obj.identity(5.5));


        obj.genericMethodArgument(2,"Kamya");
        obj.genericMethodArgument("Love", 100);

    }

}
