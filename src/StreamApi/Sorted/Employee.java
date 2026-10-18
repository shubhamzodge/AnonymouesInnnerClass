package StreamApi.Sorted;

public class Employee {
    public static void main(String []args){

    }
}
class RealEmployee{
    int id;
    String name;
    double salary;

    public RealEmployee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return "Id:"+id+ "name:"+name+"salary:"+salary;
    }
}
