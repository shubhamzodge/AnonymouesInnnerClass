package StreamApi.Consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumeList {
    public static void main(String [] args){
        List<Integer> l1= List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> l2 = List.of(11,22,78,96,32,20,78,66,89);

        Even_num obj = new Even_num();
        obj.accept(l1);
        obj.accept(l2);

    }

}
class Even_num implements Consumer<List<Integer>> {


    @Override
    public void accept(List<Integer>t) {
        for(int i=0;i<t.size();i++){
            if(t.get(i)%2==0){
                System.out.println(t.get(i));
            }
        }
    }
}
