package Lambda.Predicate;
//Use of negate operator
import java.util.function.Predicate;

public class predi5 {
    public static void main(String [] args){
        Predicate<Integer> obj = (t)->{
            return t>10;
        };
        Predicate<Integer> obj2 = obj.negate();
        System.out.println(obj2.test(198));
    }
}
