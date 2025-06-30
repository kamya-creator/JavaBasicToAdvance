package SingletonClass;


class LazyInitialize
{
    private static volatile LazyInitialize INSTANCE;
    private LazyInitialize()
    {
        if(INSTANCE != null)
            throw new RuntimeException("Call Get Instance method");
    }

    public static LazyInitialize getInstance()
    {
        if(INSTANCE == null) {
            synchronized (LazyInitialize.class) {
                if (INSTANCE == null)
                    INSTANCE = new LazyInitialize();
            }
        }
        return INSTANCE;
    }
}
public class LazyInitailization {
    public static void main(String[] args) {
        LazyInitialize obje = LazyInitialize.getInstance();
        System.out.println(obje.hashCode());
    }
}
