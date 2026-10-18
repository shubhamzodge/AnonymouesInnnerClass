package StreamApi.Reduce;

import java.util.List;
// addition of all numbers using reduce operation
public class Red1 {
    public static void main(String [] args){
        int numbers= List.of(10,20,30,40,50)
                .stream()
                .reduce(0,(i,j)->{
                    return i+j;
        });
        System.out.println(numbers);

    }
}
