package Lambda.Supplier;

import java.util.function.Supplier;

public class Supply1 {
    public static void main(String [] args){
        Supplier<String > sup = ()->{
            return "Motu";
        };
        System.out.println(sup.get());
    }
}
