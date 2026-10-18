package StreamApi;
//use of negate
import java.util.function.Predicate;

public class Pred3 {
    public static void main(String [] args){
        Predicate<Integer> pred = (t)->{
            return t>10;
        };
        System.out.println(pred.test(100));

        Predicate<Integer> pred2 = pred.negate();
        System.out.println(pred2.test(100));
    }
}
