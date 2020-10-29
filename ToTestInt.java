import java.io.*;
import java.util.*;

interface test{
public int square(int a);
}

class arithmetic implements test{
public int square(int a){
int d = a*a;
return(d);
}
}

class ToTestInt{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
arithmetic obj = new arithmetic();
System.out.println("Enter the number whose square is to be found");
int b = in.nextInt();
int c = obj.square(b);
System.out.println("The square of " + b + " is " +c);
}
}
