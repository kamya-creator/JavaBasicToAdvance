package SingletonClass;


import java.io.Serializable;

class DBConnection_Improved implements Serializable
{
    private static final DBConnection_Improved dbConnectionObj = new DBConnection_Improved();

    private DBConnection_Improved()
    {
        throw new RuntimeException("use getInstance() to create Object"); // Reflection proof
    }

    /*
    Serialization creates new Object when deserialization happen, then we will have 2 instances in our JVM
    How to prevent creating 2 instances?
    Ans- readResolve() comes to rescue,

    In deserialization(Without Read Resolve)
            loads object -> looks for class -> give reference of class to loaded object -> return newly created object


    In deserialization(With Read Resolve)
            loads object -> looks for class -> give reference of class to loaded object -> return Wait is written in readResolve()

     */
    protected Object readResolve()
    {
        return dbConnectionObj;
    }

    public static DBConnection_Improved getInstance()
    {
        return dbConnectionObj;
    }
}



class DBConnection
{
    // TO Do:
    // One instance is created eagerly by using private data member of class type itself
    // Constructor must be private
    // One static getInstance() method to get object of Class

    // Disadvantage
    /*
    1. Pre-initialization of object at the class loading time affect the memory space (Will see sol in Lazy Loading)
    2. It's not reflection proof ( throw exception in Constructor)
    3. It's not Serializable proof (give readResolve() body)
    4. It's not suitable for MultiThreading env (Will see in next example)
     */
    private static final DBConnection dbConnectionObj = new DBConnection();
    private DBConnection(){

    }
    public static DBConnection getInstance()
    {
        return dbConnectionObj;
    }

}
public class Eager_Initialization {
    public static void main(String[] args) {
        DBConnection instance = DBConnection.getInstance();
        System.out.println(instance.hashCode());



        DBConnection_Improved instance2 = DBConnection_Improved.getInstance();
        System.out.println(instance2.hashCode());
    }
}
