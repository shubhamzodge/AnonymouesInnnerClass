package Lambda.Predicate;

import java.util.function.Predicate;

public class Predi4 {
    public static void main(String [] args){
        Predicate<Integer> obj = (t)->{
            return t%3==0;
        };
        Predicate<Integer> obj2 = obj.or((t)->{
            return t%5==0;
        });
        System.out.println(obj2.test(9));


    }
}
