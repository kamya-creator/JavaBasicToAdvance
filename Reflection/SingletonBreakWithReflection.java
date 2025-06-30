package Reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Singleton
{
    private static Singleton INSTANCE ;
    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
        if(INSTANCE == null)
        {
             INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

}
public class SingletonBreakWithReflection {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {

        Class<Singleton> singletonClass = Singleton.class;
        Constructor<?>[] declaredConstructors = singletonClass.getDeclaredConstructors();
        for(Constructor constructor : declaredConstructors)
        {
            // Making constructor accessible with the help of Reflection
            constructor.setAccessible(true);

            // Creating the object of Class Singleton after making constructor public
            Object o = Singleton.getInstance();
            System.out.println(o.hashCode());

        }


    }
}
