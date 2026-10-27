package AnonymouesInnnerClass;
//in case of functional interface
public class Book {
    public static void main(String[] args){
        name obj = (b1,b2)->{
          //  System.out.println("hello world");
            //System.out.println("hello world");
            return b1+b2;

        };

        System.out.println(obj.addBooks("Shubham"," Zodge"));
    }
}
interface name{
    String  addBooks(String b1,String b2);
}
