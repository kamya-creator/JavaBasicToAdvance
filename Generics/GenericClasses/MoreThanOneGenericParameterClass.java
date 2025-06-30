package Generic.GenericClasses;

class Example<K,R,T>
{
    private K krishna;
    private R radha;
    private T tanishq;

    public Example(K krishna, R radha, T tanishq) {
        this.krishna = krishna;
        this.radha = radha;
        this.tanishq = tanishq;
    }

    @Override
    public String toString() {
        return "Example{" +
                "krishna=" + krishna +
                ", radha=" + radha +
                ", tanishq=" + tanishq +
                '}';
    }
}
public class MoreThanOneGenericParameterClass {
    public static void main(String[] args) {
        Example<Integer, String, String> obj = new Example<Integer, String, String>(100,"Radhe Radhe", "Krishna");
        System.out.println(obj);

    }
}
