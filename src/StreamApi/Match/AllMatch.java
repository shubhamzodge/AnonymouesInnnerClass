package StreamApi.Match;

import java.util.List;

public class AllMatch {
    public static void main(String [] args){
        List<Integer> list = List.of(1,2,45,78,96,4,3,0,11);

        boolean result = list
                .stream()
                .allMatch((i)->{
                    return i>50;
                });
        System.out.println(result);

    }
    }

