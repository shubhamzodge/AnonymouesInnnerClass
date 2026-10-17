package Lambda.Predicate;

import java.util.function.Predicate;

public class predi2 {
    public static void main(String []args){
        Predicate<String> str =(t)->{
            return t.startsWith("J") && t.length()>3;
        };
        System.out.println(str.test("aJohn"));
    }
}
