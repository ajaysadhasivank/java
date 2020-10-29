import java.io.*;
import java.util.*;

class prime{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		String str = in.nextLine();
		int n = Integer.parseInt(str);
		 int flag=0;
 if(n==0||n==1){
   System.out.println("It is not prime number");    
  }else{
   for(int i=2;i<=n/2;i++){    
    if(n%i==0){    
     System.out.println("It is not prime number");    
     flag = 1;    
     break;    
    }    
   }    
   if(flag==0)  { System.out.println("It is prime number"); }
  }//end of else
}  
} 
