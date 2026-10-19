package Comparable;

import java.util.TreeSet;

public class One {
    public static void main(String[] args) {
        TreeSet<Teacher> tree = new TreeSet<Teacher>();
        Teacher first = new Teacher("mahesh", 27);
        Teacher second = new Teacher("Aadarsh",29);
        Teacher third = new Teacher("Devshree",25);
        Teacher fourth = new Teacher ("alisha",29);

        tree.add(first);
        tree.add(second);
        tree.add(third);
        tree.add(fourth);
        System.out.println(tree);
    }
}
    class Teacher implements Comparable<Teacher>{
        String name;
        int age;
        //constructor
        public Teacher(String name,int age){
            super();
            this.name= name;
            this.age = age;
        }
        //toString method override
        public String toString(){
            return this.name+": "+ this.age;
        }
//        public int compareTo(Teacher o){
//            return this.name.compareToIgnoreCase(o.name);
//        }
        public int compareTo(Teacher o){
            System.out.println("*");
            return Integer.compare(this.age,o.age);
        }

}
