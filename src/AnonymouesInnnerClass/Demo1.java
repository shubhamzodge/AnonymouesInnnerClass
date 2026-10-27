package AnonymouesInnnerClass;

public class Demo1 {
    public static void main(String [] args){
        nature obj = new nature() {
            @Override
            public void add() {
                System.out.println("Animals added in zoo");
            }
        };
        obj.add();

    }
}
interface nature{
    void add();
}
