package StreamApi.Consumer;

import java.util.function.Consumer;

public class Consum1 {
    public static void main(String [] args){
        Consumer<Integer> cons = (i)->{
            System.out.println(i*2);
        };
        Consumer<Integer>cons2 = cons.andThen((j)->{
            System.out.println(j*4);
        });
        //cons.accept(100);
        cons2.accept(100);
    }
}
