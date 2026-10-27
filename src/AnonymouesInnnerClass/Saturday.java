package AnonymouesInnnerClass;

public class Saturday {
    public static void main(String [] args){
        I_jungle2 <String,Integer> jung3=(i,a)->{
            System.out.println(i.length()+a);
        };
        jung3.display("Hello",8);
    }
}
interface I_jungle2<T,A>{
    void display(T i,A a);

}
