package ExceptionHandling;

@SuppressWarnings("all")
public class ChatchMultipleException {

    public static void method1() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
    public static void main(String[] args) {

        try {
            method1();
        }
        catch (ClassCastException | ClassNotFoundException o)
        {

        }
        catch (Exception e)
        {

        }
    }
}
