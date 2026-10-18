package StreamApi.Sorted;

import java.util.List;

public class Secondhighest {
    public static void main(String [] args){
       List <Integer> list= List.of(11,22,33,7,8,5,6,99,100);
        list.stream()
                .sorted((i,j)->{
                    return Integer.compare(j,i);
                })
                .limit(2)
                .skip(1)
                .forEach((i)-> System.out.println(i));

    }
}
