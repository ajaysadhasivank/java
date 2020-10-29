import java.io.*;
import java.util.*;

class reverse{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the string to reverse");
	String str1 = in.nextLine();
	int len = str1.length();
	String str2 = "";
	for(int i=len-1;i>=0;i--){
	str2 = str2+str1.charAt(i);
	}
	System.out.println(str2);
	}
}