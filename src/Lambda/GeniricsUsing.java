package Lambda;

public class GeniricsUsing {
    public static void main(String [] args){

        I_gen<String,Integer> gen =(t1,t2)-> {
            return t1.length()+ t2.length();
        };
        System.out.println(gen.generate("Motu","Patlu"));

        I_gen<String,String> gen2=(t1,t2)->{
            return t1+t2;
        };
        System.out.println(gen2.generate("Hello ","java"));


    }
}
interface I_gen<T,R>{
    R generate(T t1,T t2);
}
/*interface I_dev<T,A,R>{
    R add(T t1,A a1);
}

 */
