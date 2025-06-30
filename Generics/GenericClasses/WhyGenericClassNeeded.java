package Generic.GenericClasses;

class Print{
    
    Object a;
    public void setA(Object a)
    {
        this.a  = a;
    }
    public Object getA()
    {
        return this.a;
    }
}
public class WhyGenericClassNeeded {
    public static void main(String[] args) {
        Print p = new Print();
        p.setA(1);
        Object a = p.getA();
        a = (int)a;
        System.out.println(a);

        p.setA("A");
        a = p.getA();
        if(a == "A")
            System.out.println(a);

        p.setA(2.5f);
        float f = (float)p.getA();
        if(f==2.5f)
        System.out.println(f);
        /*
        We have to typecast returned object into the form we want to use, that's overhead can be resolved with Generic Classes
         */
    }
}
