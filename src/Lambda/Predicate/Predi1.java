package Lambda.Predicate;

import java.util.function.Predicate;

public class Predi1 {
    public static void main(String [] args){
        Predicate<Integer> pred= (t)->{
            return t%2==0;
        };
        System.out.println(pred.test(26));
    }
}
