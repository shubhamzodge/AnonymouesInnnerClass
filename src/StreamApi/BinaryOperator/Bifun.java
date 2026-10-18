package StreamApi.BinaryOperator;

import java.util.function.BinaryOperator;

public class Bifun {
    public static void main(String []args){
        BinaryOperator<Integer> byfun=((i,j)->{
            return i+j;
        });
        System.out.println(byfun.apply(2,4));

    }
}
