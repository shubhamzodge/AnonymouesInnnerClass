package StreamApi;

import java.util.function.Predicate;

public class pred2 {
    public static void main(String [] args){
        Predicate<String> pred = (t)->{
            return t.startsWith("a");
        };
        System.out.println(pred.test("allu arjun"));
    }
}
