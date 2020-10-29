import java.io.*;
import java.util.*;

class EvenOdd{
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number");
	String str = in.nextLine();
	int n = Integer.parseInt(str);
	if(n%2 == 0){
	System.out.println("Even");
	}
	else{
	System.out.println("Odd");
	}
}
}
