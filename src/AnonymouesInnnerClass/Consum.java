package AnonymouesInnnerClass;

import java.util.function.Consumer;

public class Consum {
    public static void main(String[] args) {
        consumer<String >cons =(t)->{
            System.out.println(t.toUpperCase());
        };
        cons.accept("abcd");
    }
}
interface consumer<T>{
    void accept(T t);
}
