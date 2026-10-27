package AnonymouesInnnerClass;

public class Functioninig {
    public static void main(String[] args) {
        Function<String,Integer> fun =((t)->{
            return t.length();
        });
        System.out.println(fun.apply("Freed"));
    }
}
interface Function<T,R>{
    R apply(T t);
}
