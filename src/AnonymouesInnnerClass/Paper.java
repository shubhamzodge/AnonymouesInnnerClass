package AnonymouesInnnerClass;
//in case of functional Interface
public class Paper {
    public static void main(String [] args){
        walk obj=(i,j)->{
            System.out.println(i+j);
        };
        obj.run(10,20);
    }
}
interface walk{
    void run(int i,int j);
}
