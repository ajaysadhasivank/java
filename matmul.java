import java.io.*;
import java.util.*;
class matmul{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of rows and columns in the first matrix");
    String str1 = in.nextLine();
    String str2 = in.nextLine();
    System.out.println("Enter the number of rows and columns in the second matrix");
    String str3 = in.nextLine();
    String str4 = in.nextLine();
    int r1 = Integer.parseInt(str1);
    int c1 = Integer.parseInt(str2);
    int r2 = Integer.parseInt(str3);
    int c2 = Integer.parseInt(str4);
    int[][] arr1 = new int[10][10];
    int[][] arr2 = new int[10][10];
    int[][] arr3 = new int[10][10];
    int i=0;
    int j=0;
    int k=0;
    if(r1!=c2){
      System.out.println("Multiplication is not possible");
      System.exit(0);
    }
    System.out.println("Enter the first matrix elements");
    for(i=0;i<r1;i++){
      for(j=0;j<c1;j++){
        String str5 = in.nextLine();
        arr1[i][j] = Integer.parseInt(str5);
      }
    }
    System.out.println("Enter the second matrix elements");
    for(i=0;i<r2;i++){
      for(j=0;j<c2;j++){
        String str6 = in.nextLine();
        arr2[i][j] = Integer.parseInt(str6);
      }
    }
    for(i=0;i<r1;i++){
      for(j=0;j<c2;j++){
        arr3[i][j]=0;
        for(k=0;k<r2;k++){
          arr3[i][j] = arr3[i][j]+(arr1[i][k]*arr2[k][j]);
        }
      }
    }
    System.out.println("The multiplied matrix is");
    for(i=0;i<r1;i++){
      for(j=0;j<c2;j++){
        System.out.print(arr3[i][j]+ " ");
      }
      System.out.println("");
    }
  }
}
