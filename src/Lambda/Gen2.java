package Lambda;

public class Gen2 {
    public static void main(String [] args){
        I_dev <String,Integer,Integer> deva =(t1,a1)->{
            return t1.length()+ a1;
        };
        System.out.println(deva.add("Montya",5));

    }
}
interface I_dev<T,A,R >{
    R add(T t1,A a1);
}
