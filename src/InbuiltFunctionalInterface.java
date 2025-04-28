import java.util.function.*;

@FunctionalInterface
interface MyFunationalInterface{
    void doSomething();
}
public class InbuiltFunctionalInterface {
    public static void main(String[] args) {


        Predicate<Integer> predicate = x->x%2 ==0;
        System.out.println(predicate.test(44));

        Predicate<Integer> predicate1 = x->x > 30;
        Predicate<Integer> predicate2 = predicate.and(predicate1);
        System.out.println(predicate2.test(66));
        predicate1.test(33);

        Predicate<Integer> greaterThan10 = x ->x>10;
        Predicate<Integer> even = x -> x%2==0;

        Predicate<Integer> res = greaterThan10.or(even);
        System.out.println("Even   "+res.test(-7));


        Function<Integer, Integer> doubleNum = n -> n*2;
        System.out.println("doubling" + doubleNum.apply(3));

        Function<String , Integer> len = s -> s.length();
        System.out.println(len.apply("Hello Worlds Krishna!!"));

        Function<String, Character> firstLetter = (s )->{
            mymethod();
            System.out.println("Calling another FI----"+doubleNum.andThen(doubleNum).apply(5));
            return s.toLowerCase().charAt(9);
        };
        System.out.println(firstLetter.apply("I am learning streams"));

        Function<String, String> tolowerCase = s -> s.toLowerCase();
        Function<String, String> replace = s -> s.replaceAll(" ", "!!");
        // left to right -- first replace and then toLowerCase
        // ------------->
        String apply = replace.andThen(tolowerCase).apply("I M NEW TO  STREAMS");
        System.out.println(apply);


        Function<Integer, Integer> doubleIt = x -> x*2;
        Function<Integer, Integer> tripleIt = x -> x*3;


        /*
        Ques - Who can call default method?
          With the help of lambda exp we are provide implementation of functional interface, indirectly we are creating object of FI
          , hence only with help of that implementation we can call default methods .
          Any object that implements the interface can call the default method directly.

         */

        // apply function from left to right -- first doubleIt and then tripleIt and then doubleIt
        // ----------------> left to right
        System.out.println(doubleIt.andThen(tripleIt).andThen(doubleIt).apply(20));

        // apply function from right to left --- first tripleIt and then compose answer from it and then doubleIt
        // <---------------  right to left
        System.out.println(doubleIt.compose(tripleIt).apply(40));


        // Identity method in Function is static method hence called by Class name i.e Function.identity()
        // It returns what is given in parameter , hence parameter type and return type must be same
        Function<Integer, Integer> indentityFunc = Function.identity();
        System.out.println(indentityFunc.apply(56443211));

        /*
        Consumer accepts INPUT and don't return anything just do something that is not returnable like printing
         */
        Consumer<String> consumer = (s) -> System.out.println(s);
        //consumer.accept(20);

        Consumer<String> consumer1 = s -> System.out.println(s.substring(2,7));
        consumer1.andThen(consumer).accept("Radhe Radhe ");


        // Bi-Function -- Takes 2 argument for Function
        BiFunction<Double, Integer , Double> sum = (x, y) -> x+y;
        Function<Double, Double> forBiFunctionAndThen = x -> (x+10);

        /*
            Sum is returning Double type and forBiFunctionAndThen is accepting double type
            andThen tabhi apply hoga jab ek function return kre ussi type ka jis type ka next function Input maang rha h
         */
        System.out.println(sum.andThen(forBiFunctionAndThen).apply(2.0,3));


        // Bi-consumer
        BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println(s1.concat(s2));
        biConsumer.accept("Radhe Radhe " , " Govinda Radhe");

        // Sugar Coated -- extending Function FI
        /*
            In Function we have to give one return type and one parameter type , if both types are same then we can use
            UnaryOperator with single Type argument
            Function<Integer, Integer> ======= UnaryOperator<Integer>
            No need to write Integer 2 times
         */
        UnaryOperator<Long> unaryOperator = (x) -> x*12;
        System.out.println(unaryOperator.apply(12L));


        /*
        Sugar Coated - BiFunction FI
         In Function we have to give one return type and 2 parameter type , if all three types are same then we can use
            BinaryOperator with single Type argument
            BiFunction<Integer, Integer, Integer> ======= BinaryOperator<Integer>
            No need to write Integer 3 times
         */
        BinaryOperator<Long> binaryOperator = (x, y) -> x*y;
        System.out.println(binaryOperator.apply(12L , 78L));
        
        
        // Method Reference
        MyFunationalInterface obj1 = ()-> System.out.println("Hello from method");
        obj1.doSomething();


    }

    private static void mymethod() {
        System.out.println("Calling method from lambda exp");
    }
}