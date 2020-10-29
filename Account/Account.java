import java.io.*;
import java .util.*;

class Accountdet{
  Scanner in = new Scanner(System.in);
   Accountdet(){}
}
class Curr_acct extends Accountdet{
Curr_acct(){}
float currbal;
int currno;
String currname;
public void setdetails(){
  System.out.println("Enter the account holders name");
  currname = in.nextLine();
  System.out.println("Enter the account number");
  currno = in.nextInt();
  System.out.println("Enter the account balance");
  currbal = in.nextInt();
}
public void deposit(){
  System.out.println("Enter the amount to deposit");
  float dep = in.nextFloat();
  currbal = dep+currbal;
  System.out.println("The balance in the account is " + currbal);
}
public void bala(){
  System.out.println("The account holder's name is " + currname);
  System.out.println("The account number is " + currno);
  System.out.println("The balance in the account is " + currbal);
}
}

class Sav_acct extends Accountdet{
 Sav_acct(){}
   float min = 500;
   float savbal;
   String savname;
   int savno;
   public void setdetails(){
     System.out.println("Enter the account holders name");
     savname = in.nextLine();
     System.out.println("Enter the account number");
     savno = in.nextInt();
     System.out.println("Enter the account balance");
     savbal = in.nextFloat();
   }
   public void interest(){
     float interest = savbal/10;
     savbal = interest+savbal;
     System.out.println("The balance in the account is " + savbal);
   }
   public void depo(){
     System.out.println("Enter the amount to be added");
     float dep = in.nextFloat();
     savbal = dep+savbal;
     System.out.println("The balance in the account is " + savbal);
   }
    public void bal(){
      System.out.println("The account holder's name is " + savname);
      System.out.println("The account no is " + savno);
      System.out.println("The balance in the account is " + savbal);
  }
    public void withdraw(){
      System.out.println("Enter the amiunt to withdraw");
      float with = in.nextFloat();
      savbal = savbal-with;
      System.out.println( with + "was withdrawn");
      System.out.println("The balance in the account is " + savbal);
}
    public void penalty(){
      if(savbal<min){
        savbal = savbal - 100;
        System.out.println("The balance in the account is " + savbal);
        System.out.println("penalty of" + 100 + "imposed");
      }
      else{
        System.out.println("No penalty imposed");
      }
    }
}

class Account{
  public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  int option=0;
  Curr_acct current = new Curr_acct();
  Sav_acct saving = new Sav_acct();
  System.out.println("Enter your account type 1-CURRENT 2-SAVINGS");
  int acc = in.nextInt();
  if(acc==1){
  current.setdetails();
  while(option!=3){
    System.out.println("Enter the operation 1-Deposit 2-Display account details 3-Exit");
    option = in.nextInt();
    switch(option){
      case 1:
      current.deposit();
      break;
      case 2:
      current.bala();
      break;
      case 3:
      System.exit(0);
    }
  }
  }
  else{
  saving.setdetails();
  int ch=0;
  while(ch!=6){
    System.out.println("Enter the operation 1-Deposit 2-Display account details 3-withdraw 4-Add interest to account 5-check for penalty 6-exit");
    ch = in.nextInt();
  switch(ch){
    case 1:
    saving.depo();
    break;
    case 2:
    saving.bal();
    break;
    case 3:
    saving.withdraw();
    break;
    case 4:
    saving.interest();
    break;
    case 5:
    saving.penalty();
    break;
    case 6:
    System.exit(0);
    break;
  }
  }
  }
}
}
