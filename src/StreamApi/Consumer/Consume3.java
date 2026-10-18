package StreamApi.Consumer;

import java.util.List;
import java.util.function.Consumer;

public class Consume3 {
    public static void main(String [] args){
        List<Integer> l1 = List.of(11,22,33,44,55,99);
        List<Integer> l2 = List.of(7,8,9,4,5,6,1,2);
        List<Integer> l3 = List.of(2,4,56,7,8,9);
      // List<List<Integer>>l4 = List.of(11,12,13);
        //System.out.println(l4);
        two_d t = new two_d();
        //t.accept(l4);

    }
}
class two_d implements Consumer<List<List<Integer>>>{
    Consume3 obj = new Consume3();

    @Override
    public void accept(List<List<Integer>>t) {
        for(int i=0;i<t.size();i++){
            //obj.accept(t.get(i));
        }
    }
}
