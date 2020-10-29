import java.io.*;
import java.util.*;

class greatest{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number of elements in the array");
	String str1 = in.nextLine();
	int n = Integer.parseInt(str1);
	int arr[] = new int[10];
	String str2 = "";
	int big = 0;
	System.out.println("Enter the array elements");
	for(int i=0;i<n;i++){
	str2 = in.nextLine();
	arr[i] = Integer.parseInt(str2);
	}
	for(int i=0;i<n;i++){
       if(big<arr[i]){
       	big = arr[i];
       }
     }
     System.out.println("The greatest number is " + big);
	}
}