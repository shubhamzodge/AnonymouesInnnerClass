package StreamApi;
//use of or operator in Stream api
import java.util.function.Predicate;

public class Pred5 {
    public static void main(String [] args){
        Predicate<Integer > pred = (t)->{
            return t>5;
        };
        Predicate<Integer>pred2 = pred.or((t)->{
            return t>10;
        });
        //System.out.println(pred.test());
        System.out.println( pred2.test(9));
    }
}
