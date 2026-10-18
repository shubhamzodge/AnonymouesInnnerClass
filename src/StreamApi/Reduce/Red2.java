package StreamApi.Reduce;
//use for concatenation of string
import java.util.List;

public class Red2 {
    public static void main(String [] args){
        String str = List.of("Beed","pune","Nager","Mumbai")
                .stream()
                .reduce("",(i,j)->{
                    return i+" "+j;
                });
        System.out.println(str);
    }
}
