import p1.C;

class A{
private int a=10;
protected int b=20;
public int c=30;
int d=40;

A(){}

void displayA(){
System.out.println("Inside class");
System.out.println("a private = "+a);
System.out.println("b protected = " +b);
System.out.println("c public = " +c);
System.out.println("d default = " +d);
System.out.println(" ");
}
}

class B extends A{

B(){}

void displayB(){
  System.out.println("Inside Derived class");
  System.out.println("b protected = " +b);
  System.out.println("c public = " +c);
  System.out.println("d default = " +d);
  System.out.println(" ");
}
}

class visibility{
public static void main(String args[]){
A obj1 = new A();
B obj2 = new B();
C obj3 = new C();
obj1.displayA();
obj2.displayB();
System.out.println("inside a package");
System.out.println("c public = " +obj3.c);
System.out.println(" ");
}
}
