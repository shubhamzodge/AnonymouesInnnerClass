package Lambda;

public class Navneet {
    public static void main(String [] args){
        I_city2 obj = (str)->{
            System.out.println(str.toUpperCase());
        };
            obj.display("The Monti");
    }
}
interface I_city2{
    void display(String str);
}
