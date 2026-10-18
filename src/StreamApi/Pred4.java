package StreamApi;
//AND operator in stream api
import java.util.function.Predicate;

public class Pred4 {
    public static void main(String [] args){
        Predicate<Integer> pred = (t)->{
            return t>10;
        };
        Predicate<Integer> pred2 = pred.and((t)->{
            return t>5;
        });
        System.out.println(pred2.test(14));
    }
}
