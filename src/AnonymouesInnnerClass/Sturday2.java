package AnonymouesInnnerClass;

public class Sturday2 {
    public static void main(String [] args){
        zoo<String,String,Integer> obj =(i,a)->{
           return (i.length()+a.length());
        };
        System.out.println(obj.display3("Pune","beed"));

    }
}
interface zoo<T,A,R>{
    R display3(T i,A a);
}
