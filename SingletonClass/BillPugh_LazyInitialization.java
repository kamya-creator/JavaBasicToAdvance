package SingletonClass;


import java.io.Serializable;
import java.util.concurrent.*;

class LazyInitializationExample implements Serializable
{
    private static LazyInitializationExample instance ;


    // static Inner classes load only when they are called ,
    // hence in nested inner class we can create object of outclass as following lazy loading property

    /*
    Note Non-static Inner class doesn't load lazy because they are bound to object , jav object create hoga tab class ko bhi initialize
    honga hoga hi, but static class are not bound to object isliye jab static class ko explicitly call karoge clasName ke sath tab hi vo call hoga
     */
    private static final class NestedClassHelpsInLazyLoading
    {
        private static final LazyInitializationExample INSTANCE = new LazyInitializationExample();  // Lazy Loading
    }
    private LazyInitializationExample()
    {
        if(NestedClassHelpsInLazyLoading.INSTANCE != null)
        {
            throw new RuntimeException("Use getInstance to create Object----------"); // Reflection proof
        }
    }
    public static LazyInitializationExample getInstance()
    {
        return NestedClassHelpsInLazyLoading.INSTANCE;
    }

    protected Object readResolve()
    {
        return getInstance(); // Serializable Proof
    }


}
public class BillPugh_LazyInitialization {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        LazyInitializationExample obj = LazyInitializationExample.getInstance();
//        LazyInitializationExample obj2 = LazyInitializationExample.getInstance();
//        System.out.println(obj.hashCode() + " " + obj2.hashCode());

        int threadCount = 100;
        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);
        Callable<Integer> task = ()->{
            LazyInitializationExample instance = LazyInitializationExample.getInstance();
            return instance.hashCode();
        };

        Future<Integer>[] result = new Future[threadCount];
        for (int i = 0; i < threadCount; i++) {
            result[i] = executorService.submit(task);
        }

        Integer expected = result[0].get();
        for (int i = 1; i < 100; i++) {
            if(!result[i].get().equals(expected))
            {
                System.out.println("Objects didn't matched");
            }
        }

        executorService.shutdown();
        System.out.println("All Objects are same");

    }
}
