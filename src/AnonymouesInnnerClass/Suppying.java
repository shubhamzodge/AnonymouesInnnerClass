package AnonymouesInnnerClass;

public class Suppying {
    public static void main(String[] args) {
        supplier<String>sup =(()->{
            return new String ("POP");
        });
        System.out.println(sup.get());
    }
}
interface supplier<T>{
      T get();
}
