package Comparable;

import java.util.TreeSet;

public class Second {
    public static void main(String [] args){
        TreeSet<City> tree = new TreeSet<City>();
        City one = new City(500,"Beed");
        City two = new City (1000,"pune");
        City three = new City (700,"Kolhapur");
        City four = new City (7,"chausala");

        tree.add(one);
        tree.add(two);
        tree.add(three);
        tree.add(four);
        System.out.println(tree);


    }
}
class City implements Comparable<City>{
    int size;
    String name;
   public City(int size,String name){
        this.size = size;
        this.name = name;
    }
    public String toString(){
       return this.size + ": "+ this.name;
    }


    public int compareTo(City o){
       return o.name.compareToIgnoreCase(this.name);
    }
}
