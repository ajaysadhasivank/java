import java.io.*;
import java.util.*;

class natural{
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number of natural numbers to be printed");
	String str = in.nextLine();
	int n = Integer.parseInt(str);
	for(int i=1; i<=n; i++){
		System.out.println(i);
	}
}
}