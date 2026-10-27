package AnonymouesInnnerClass;

public class pred {
    public static void main(String[] args) {
        predicate<Integer> predi4=((t)->{
            return t>10;
        });
        System.out.println(predi4.test(5));
    }
}
interface predicate<T>{
    boolean test(T t);
}
