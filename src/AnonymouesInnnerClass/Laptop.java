package AnonymouesInnnerClass;

public class Laptop {
    public static void main(String [] args){
        I_jungle <String > jung = (i,j)->{
            System.out.println(i.toUpperCase()+":"+j.toUpperCase());
        };
        jung.display("Monti","vento");

        I_jungle<Integer> jung2=(i,j)->{
            System.out.println(i+j);
        };
        jung2.display(1,2);
    }
}
interface I_jungle<T>{
    void display(T i,T j);
}
