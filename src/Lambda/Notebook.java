package Lambda;

public class Notebook {
    public static void main(String [] args){
        I_city obj =()->{
            System.out.println("Welcome");
        };
        obj.display();
    }
}
interface I_city{
    void display();
}
