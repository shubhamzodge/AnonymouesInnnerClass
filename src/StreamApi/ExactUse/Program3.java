package StreamApi.ExactUse;

import java.util.ArrayList;
import java.util.List;

public class Program3 {
    public static void main(String [] args){
        List<Book> list= new ArrayList<Book>();

        list.add(new Book("The Rebel",90,"Shubham"));
        list.add(new Book("Hitlor",89,"Monti carlo"));
        list.add(new Book("Biology",200,"Sir Thomsan"));
        list.add(new Book("Alchemist",150,"Robert"));

        System.out.println(list);

        list.stream()
                .filter((i)->{
                    return i.BookPages>100;
                })
                .forEach((i)->
                    System.out.println(i)
                );

    }
}
class Book{
    String BookName;
    int BookPages;
    String BookAuthor;

    public Book(String bookName, int bookPages, String bookAuthor) {
        BookName = bookName;
        BookPages = bookPages;
        BookAuthor = bookAuthor;
    }
    public String toString(){
        return "BookName: "+ BookName+ "BookPages: "+BookPages+" BookAuthor: "+ BookAuthor;
    }
}
