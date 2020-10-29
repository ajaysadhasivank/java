import java.io.*;
import java.util.*;

class matrix{
	public static void main(String[] args){
	Scanner two = new Scanner(System.in);
	System.out.println("Enter the number of rows and columns in the first matrix");
	String str1 = two.nextLine();
	String str2 = two.nextLine();
	System.out.println("Enter the number of rows and columns in the second matrix");
    String str3 = two.nextLine();
    String str4 = two.nextLine();
    int r1 = Integer.parseInt(str1);
    int c1 = Integer.parseInt(str2);
    int r2 = Integer.parseInt(str3);
    int c2 = Integer.parseInt(str4);
    int i=0;
    int j=0;
    int[][] arr1 = new int[10][10];
    int[][] arr2 = new int[10][10];
    int[][] arr3 = new int[10][10];
    String str5 = "";
    String str6 = "";
    if(r1!=r2||c1!=c2){
      System.out.println("Matrix addition is not possible");
      System.exit(0);
    }
    System.out.println("Enter the first matrix elements");
    for(i=0;i<r1;i++){
    for(j=0;j<c1;j++){
    str5 = two.nextLine();
    arr1[i][j] = Integer.parseInt(str5);
    }
    }
    System.out.println("Enter the second matrix elemnts");
    for(i=0;i<r2;i++){
    for(j=0;j<c2;j++){
    str6 = two.nextLine();
    arr2[i][j] = Integer.parseInt(str6);
    }
    }
    for(i=0;i<r1;i++){
    for(j=0;j<c1;j++){
    arr3[i][j] = arr1[i][j]+arr2[i][j];
    System.out.print( arr3[i][j]+" ");
    }
    System.out.println("");
    }

	}
}