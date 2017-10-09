package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

interface GetLength{
    int count(String s);
}

@FunctionalInterface
interface LambdaInterface{
    int suma(int a, int b);
    default void sk(){}
    static int dauginti(){return  0;}
}

public class Main {

    public static void main(String[] args) {

        LambdaInterface lambdaInterface = (a, b) -> a+b;
        GetLength g = str -> str.length();
        Runnable r = () -> System.out.println("waeaw");
        new Thread(r).start();

        int a = g.count("Laba diena");
        System.out.println(a);
        //System.out.println(lambdaInterface.suma(50,20));
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("goodbye");
        atspausdinti(list, (p) -> p.startsWith("h"), c-> System.out.println(c));
        list.forEach(System.out::println);
    }
    public static void atspausdinti(List<String> list, Predicate<String> pre, Consumer<String> con){
        for (String s : list) {
            if(pre.test(s)){
                con.accept(s);
            }
        }
    }

}
