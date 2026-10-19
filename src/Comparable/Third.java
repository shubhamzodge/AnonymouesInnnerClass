package Comparable;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Third {
    public static void main(String [] args){
        TreeSet<House> tree = new TreeSet<House>();
        House h1 = new House(1,"monti");
        House h2 = new House(50,"patlu");
        House h3 = new House(25,"kalu");
        House h4 = new House (78,"vento");
        tree.add(h1);
        tree.add(h2);
        tree.add(h3);
        tree.add(h4);
        System.out.println(tree);
    }
}
class House implements Comparable<House>{
    int HouseNumber;
    String HouseName;
    public House(int HouseNumber,String HouseName){
        this.HouseNumber= HouseNumber;
        this.HouseName = HouseName;
    }
    public String toString(){
        return "HouseNumber: "+ HouseNumber+" HouseName "+ HouseName;
    }
    public int compareTo(House o){
        return Integer.compare(this.HouseNumber,o.HouseNumber);
    }
}
