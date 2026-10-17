package Lambda;

public class Classmate {
    public static void main(String [] args){
        I_city3 obj = (i,j)->{
            return i+j;
        };
        System.out.println(obj.display(20,30));

    }
}
interface I_city3{
    int  display(int i,int j);
}
