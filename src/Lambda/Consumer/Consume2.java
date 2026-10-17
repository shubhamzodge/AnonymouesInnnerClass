package Lambda.Consumer;
//use of and then
import java.util.function.Consumer;

public class Consume2 {

        public static void main(String [] args ){
            Consumer<Integer> obj =(t)->{
                System.out.println(t*2);
            };
            Consumer <Integer> obj2 = obj.andThen((j)->{
                System.out.println(j*4);

            });
            obj2.accept(10);
        }
    }


