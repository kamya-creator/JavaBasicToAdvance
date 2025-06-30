package Reflection;

class Bird{
    
}
public class GetCLASS_Object {
    public static void main(String[] args) throws ClassNotFoundException {

        /*
        Refelction means the get the metadata of Running Class in JVM with the help of class CLASS object

        class Class object holds the all information about particular class you asked for
        it can provide you information about decleared fields , methods , return type access modifiers and almost everthing

        It goes to JVM and asks for information
        To get class Class object we have three ways
        1. by Using Class.forName(CLASSNAME_JISKI_INFO_CHAHIYE")
        2. by Using ClassName.class
        3. by using objectofClass.getClass()

         */
        // 1. Using Class.forName(CLASSNAME)
        // class.foreName need fully qualified name of class
        Class bird = Class.forName("Reflection.Bird");
        
        //2. Using .class
        Class<Bird> birdClass = Bird.class;

        //3 . Using ObjectofClass.getClass()
        Bird obj = new Bird();
        obj.getClass();
    }
}
