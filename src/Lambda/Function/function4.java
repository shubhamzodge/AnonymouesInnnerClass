package Lambda.Function;
//use of and then
import java.util.List;
import java.util.function.Function;

public class function4 {
    public static void main(String [] args){
        List<String> list = List.of("om","Raju","mahesh","krushnal");
        Function<String,Integer> fun=(t)->{
            return t.length();
        };
        Function<String,Integer> fun2= fun.andThen((j)->{
            return j*j;
        });
        for(String str:list){
            System.out.println(fun2.apply(str));
        }
    }
}
