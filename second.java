import java.io.*;
import java.util.*;
class second{
	public static void main(String[] args){
	Scanner var = new Scanner(System.in); 
	System.out.println("Enter the number of elements in the array");
    String str1 = var.nextLine();
    int n = Integer.parseInt(str1);
    String str2 = "";
    int i = 0;
    int j = 0;
    int temp = 0;
    int arr[] = new int[10];
    System.out.println("Enter the array elements");
    for(i=0;i<n;i++){
    str2 = var.nextLine();
    arr[i] = Integer.parseInt(str2);
    }
    for(i=0;i<n;i++){
    for(j=1;j<(n-i);j++){
    if(arr[j-1]>arr[j]){
    temp = arr[j-1];
    arr[j-1] = arr[j];
    arr[j] = temp;
    }
    }
    }
    System.out.println("The second smallest number is "+ arr[1]);
	}
} 