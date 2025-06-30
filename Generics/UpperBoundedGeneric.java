package Generic;

class UpperBoundedGenericExample<T extends Number>
{

    private T number;

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
}
public class UpperBoundedGeneric {
    public static void main(String[] args) {
        // Ab UpperBoundedGenericExample sirf or sirf vhi parameters accept karega jo Number class ko extends kr rhe honge, isliye Object class is not acceptable here
       // UpperBoundedGenericExample<Object> obj = new UpperBoundedGenericExample();


        /*
        Integer, Float, BigInteger, BigDecimal and others are all which are extending the number class isliye vhi acceptable h
         */
        UpperBoundedGenericExample<Integer> obj = new UpperBoundedGenericExample<>();
        obj.setNumber(100);
        System.out.println(obj.getNumber());

        UpperBoundedGenericExample<Float> obj2 = new UpperBoundedGenericExample<>();
        obj2.setNumber(10.0f);
        System.out.println(obj2.getNumber());
    }
}
