package Lambda.Predicate;

import java.util.function.Predicate;
//Use of And operator in predicate
public class Predi3 {
    public static void main(String [] args ){
        Predicate<Integer > pred = (t)->{
            return t>10;
        };
        Predicate<Integer> pred2 = pred.and((t->{
            return t>20;
        }));
        System.out.println(pred2.test(25));

    }
}
