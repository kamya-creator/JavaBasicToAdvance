package Generic;

class Pair<T>
{
    T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}
public class RawGeneric {
    public static void main(String[] args) {

        // here we have not given parameter to generic class hence at runtime Object Class will be assigned by JVM
        Pair obj = new Pair();
        obj.setVar(2);
        System.out.println(obj.getVar());

    }
}
