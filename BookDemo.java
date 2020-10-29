import java.io.*;
import java.util.*;

class Book{
  public String t;
  public String title;
  public String a;
  public String author;
  public double p;
  public double price;
  Book(){}
  public Book(String title, String author, double price){
    t = title;
    a = author;
    p = price;
  }
  public void setTitle(String title){
    t = title;
  }
  public void setAuthor(String author){
    a = author;
  }
  public void setPrice(double price){
    p = price;
  }
  public String getTitle(){
    return t;
  }
  public String getAuthor(){
    return a;
  }
  public String toString(){
    return(("Book Titled "+ getTitle() +" By Author "+ getAuthor()+ " Priced "+ p));
  }
}

class BookDemo{
  public static void main(String[] args){
    Book var = new Book("Developing Java Software", "Russel Winderand", 79);
    System.out.println(var.toString());
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the title of the book");
    String str1 = in.nextLine();
    System.out.println("Enter the Author's name");
    String str2 = in.nextLine();
    System.out.println("Enter the price");
    double val = in.nextDouble();
    var.setTitle(str1);
    var.setAuthor(str2);
    var.setPrice(val);
    System.out.println(var);/*for toString method with that name if we call
    System.out.println no need to call the method it is called by default*/
  }
}
