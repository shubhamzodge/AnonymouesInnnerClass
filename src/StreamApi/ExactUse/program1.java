package StreamApi.ExactUse;

import java.util.List;

public class program1 {
    public static void main(String [] args){
        List <Integer>list = List.of(11,22,3,44,55,66,7,88,9);
        list.stream()
                .filter((i)->{return i>40;})
                .forEach((i)->{System.out.println(i);});
    }
}
