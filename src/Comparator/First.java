package Comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class First {
    public static void main(String [] args){
        TreeSet<Book> tree = new TreeSet<Book>(new priceComparator());
        Book b1 = new Book(50,25);
        Book b2 = new Book (100,55);
        Book b3 = new Book (200,100);
        Book b4 =  new Book (300,200);

        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        tree.add(b4);
        System.out.println(tree);
    }
}
class Book{
    int pages;
    int price;

    //constructor
    public Book(int pages,int price){
        this.pages= pages;
        this.price = price;
    }
    //toString
    public String toString(){
        return "pages:"+pages+ " price: " +price;
    }
}
class pageComparator implements Comparator<Book>{
    public int compare(Book o1,Book o2){
        return Integer.compare(o2.pages,o1.pages);
    }

//    @Override
//    public int compare(Comparator.Book o1, Comparator.Book o2) {
//        return 0;
//    }
}
class priceComparator implements Comparator<Book>{
    public int compare(Book o1,Book o2){
        return Integer.compare(o1.price,o2.price);
    }

        }
