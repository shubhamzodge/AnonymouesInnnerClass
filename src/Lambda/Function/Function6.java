package Lambda.Function;

import javax.swing.*;
import java.util.function.Function;

public class Function6 {
    public static void main(String [] args){
        Function<Integer, Integer> fun =Function.identity();
        System.out.println(fun.apply(12));

    }
}
