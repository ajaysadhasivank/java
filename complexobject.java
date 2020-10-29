import java.io.*;
import java.util.*;

class Complexop{
Complexop(){}
Complexop(int tru,int com){
  int num1 = tru;
  int co = com;
}
public static void comadd(Complexop a, Complexop b){
int t3 = a.num1+b.num1;
int c3 = a.co+b.co;
System.out.println("The sum of complex numbers are "+t3 +" + "+c3+"i");
}
public static void comsub(Complexop a, Complexop b){
int t3 = a.num1-b.num1;
int c3 = a.co-b.co;
System.out.println("The subtraction of complex numbers are "+t3+" + "+c3+"i");
}
public static void commul(Complexop a, Complexop b){
int t3 = (a.num1*b.num1)-(a.co*b.co);
int c3 = (a.num1*b.co)+(b.num1*a.co);
System.out.println("The product of complex numbers are "+t3+" + "+c3+"i");
}
}

class complexobject{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.println("Enter the first complex number true part");
int true1 = in.nextInt();
System.out.println("Enter the first complex number complex part");
int comp1 = in.nextInt();
System.out.println("Enter the second complex number true part");
int true2 = in.nextInt();
System.out.println("Enter the second complex number complex part");
int comp2 = in.nextInt();
Complexop obj1 = new Complexop(true1,comp1);
Complexop obj2 = new Complexop(true2,comp2);
Complexop.comadd(obj1,obj2);
Complexop.comsub(obj1,obj2);
Complexop.commul(obj1,obj2);
}
}
