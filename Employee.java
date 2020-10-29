import java.io.*;
import java.util.*;

class work{
  public double salary;
  public double whour;
  public double getinfo(int sal, int hour){
    salary = sal;
    whour = hour;
    return salary;
  }
  public double Addsal(){
    if(salary<500){
      salary = salary+10;
    }
    return salary;
  }
  public double AddWork(){
    if(whour>6){
      salary = salary+5;
    }
    return salary;
  }
}

class Employee{
  public static void main(String[] args){
    work newemployee;
    Scanner in  = new Scanner(System.in);
    System.out.println("Enter the salary of the employee");
    String str1 = in.nextLine();
    System.out.println("Enter the hours working");
    String str2 = in.nextLine();
    int money = Integer.parseInt(str1);
    int rate = Integer.parseInt(str2);
    newemployee = new work();
    newemployee.getinfo(money, rate);
    double salresult = newemployee.Addsal();
    double worresult = newemployee.AddWork();
    System.out.println("The salary is " + worresult);
  }
}
