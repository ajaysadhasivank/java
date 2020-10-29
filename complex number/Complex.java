import java.io.*;
import java.util.*;

class Complexop{
Complexop(){}
public void comadd(int t1, int c1, int t2, int c2){
int t3 = t1+t2;
int c3 = c1+c2;
System.out.println("The sum of complex numbers are "+t3 +" + "+c3+"i");
}
public void comsub(int t1, int c1, int t2, int c2){
int t3 = t1-t2;
int c3 = c1-c2;
System.out.println("The subtraction of complex numbers are "+t3+" + "+c3+"i");
}
public void commul(int t1, int c1, int t2, int c2){
int t3 = (t1*t2)-(c1*c2);
int c3 = (t1*c2)+(t2*c1);
System.out.println("The product of complex numbers are "+t3+" + "+c3+"i");
}
}

class Complex{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
Complexop obj = new Complexop();
System.out.println("Enter the first complex number true part");
int true1 = in.nextInt();
System.out.println("Enter the first complex number complex part");
int comp1 = in.nextInt();
System.out.println("Enter the second complex number true part");
int true2 = in.nextInt();
System.out.println("Enter the second complex number complex part");
int comp2 = in.nextInt();
obj.comadd(true1,comp1,true2,comp2);
obj.comsub(true1,comp1,true2,comp2);
obj.commul(true1,comp1,true2,comp2);
}
}
