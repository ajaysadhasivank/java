import java.io.*;
import java.util.*;

class palindrome{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the string to be checked");
    String str1 = in.nextLine();
    int len = str1.length();
    String str2 = "";
    for(int i=len-1;i>=0;i--){
        str2 = str2 + str1.charAt(i);
    }
    if(str1.equalsIgnoreCase(str2)){
        System.out.println("The string is a palindrome");
    }
    else{
        System.out.println("The string is not a palindrome");
    }
}
}
