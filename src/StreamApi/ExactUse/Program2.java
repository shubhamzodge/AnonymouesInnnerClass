package StreamApi.ExactUse;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
    public static void main(String [] args){
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(1,"shubham",400.8));
        list.add(new Employee(2,"raju",500.8));

        System.out.println(list);

        list.stream()
                .filter((i)->{return i.salary>400;})
                .forEach((i)-> System.out.println(i));


    }
}
class Employee{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return "Id:"+id+ "name:"+name+"salary:"+salary;
    }
}
