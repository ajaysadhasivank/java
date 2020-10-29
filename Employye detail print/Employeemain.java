import java.io.*;
import java.util.*;
class Employee{
  Employee(){}
String name;
int age;
String number;
String address;
float salary;
Scanner in = new Scanner(System.in);

public void printSalary(){
System .out.println("The salary is " + salary);
}
}

class Officer extends Employee{
Officer(){}
String specialization;
public void officerdetails(){
System.out.println("Enter the officer's name");
name = in.nextLine();
System.out.println("Enter the officer's address");
address = in.nextLine();
System.out.println("Enter the specialization");
specialization = in.nextLine();
System.out.println("Enter the officer's phone number");
number = in.nextLine();
System.out.println("Enter the officer's age");
age = in.nextInt();
System.out.println("Enter the officer's salary");
salary = in.nextFloat();
}

public void printofficer(){
System.out.println("Officer's name is " + name);
System.out.println("Officer's age is " + age);
System.out.println("Officer's phone number is " + number);
System.out.println("Officer's address is " + address);
System.out.println("Officer is specialised in " + specialization);
printSalary();
}
}

class Manager extends Employee{
  Manager(){}
String department;
public void managerdetails(){
System.out.println("Enter the Manager's name");
name = in.nextLine();
System.out.println("Enter the Manager's address");
address = in.nextLine();
System.out.println("Enter the Department");
department = in.nextLine();
System.out.println("Enter the Manager's phone number");
number = in.nextLine();
System.out.println("Enter the Manager's age");
age = in.nextInt();
System.out.println("Enter the Manager's salary");
salary = in.nextFloat();
}

public void printmanager(){
System.out.println("Manger's name is " + name);
System.out.println("Manger's age is " + age);
System.out.println("Manger's phone number is " + number);
System.out.println("Manger's address is " + address);
System.out.println("Manger's department is " + department);
printSalary();
}
}

class Employeemain{
public static void main(String[] args){
Officer off = new Officer();
Manager man = new Manager();
off.officerdetails();
man.managerdetails();
off.printofficer();
man.printmanager();
}
}
