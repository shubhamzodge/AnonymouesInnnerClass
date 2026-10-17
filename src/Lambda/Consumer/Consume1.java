package Lambda.Consumer;

import java.util.function.Consumer;

public class Consume1 {
    public static void main(String [] args){
        Consumer<String> cons = (t)->{
            System.out.println(t.toUpperCase());
        };
        cons.accept("hello");
    }
}
