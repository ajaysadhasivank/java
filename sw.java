import java.io.*;
import java.util.*;

class sw{
public static void main(String[] args){
		Scanner two = new Scanner(System.in);
		
		float res = 0;
		int bool = 5;
		while(bool!=6){
		System.out.println("Enter the 2 numbers for operation (Press enter after each)");
		String str1 = two.nextLine();
		String str2 = two.nextLine();
		float a = Float.parseFloat(str1);
		float b = Float.parseFloat(str2);
		System.out.println("Enter the operation to perform 1- addition 2- subtraction 3- multiplication 4- division");
		String str3 = two.nextLine();
		int ch = Integer.parseInt(str3);
		if(ch==1||ch==2||ch==3||ch==4){
		switch (ch) {
			case 1:
			  res = a+b;
			  System.out.println("The sum is " + res);
			  break;
		    case 2:
		      res = a-b;
		      System.out.println("The subtracted value is " + res);
		      break;
	        case 3:
	          res = a*b;
	          System.out.println("The product is " + res);
	          break;
	        case 4:  
	          res = a/b;
	          System.out.println("The divided value is " + res);
	          break;
        }
    }
    else{
    	System.out.println("Operation is not valid");
    }
    System.out.println("Do you want to continue 5-yes 6-no");
    String str4 = two.nextLine();
    bool = Integer.parseInt(str4);
}

}
}