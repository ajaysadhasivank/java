import java.io.*;
import java.util.*;
class st{
public int top=-1,size;
Scanner in=new Scanner(System.in);
st()
{
top=-1;
}
st(int n){
  size = n;
}

void push(int stack[]){
if((top+1)==size)
System.out.println("STACK OVERFLOW");
else{
System.out.print("Enter the item :");
int item=in.nextInt();
top++;
stack[top]=item;
}
}
void pop(int stack[]){
if(top==-1)
System.out.println("STACK UNDERFLOW");
else{
System.out.println("The deleted element is"+stack[top]);
top--;
}
}

void display(int stack[]){
if(top==-1)
System.out.println("STACK UNDERFLOW");
else{
System.out.print(" stack :");
for(int i=0;i<=top;i++)
System.out.println(" "+stack[i]);
}
}
}

class stack{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter the number of elements");
int n = in.nextInt();
st s=new st(n);
int ch;
int stack[]=new int[10];
int option = 0;
while(option!=4){
System.out.println("1-Push 2-Pop 3-Display 4-Exit Enter the option :");
option=in.nextInt();
switch(option){
case 1:
s.push(stack);
break;
case 2:
s.pop(stack);
break;
case 3:
s.display(stack);
break;
case 4:
System.exit(0);
break;
default:
System.out.println("Invalid operation");
break;
}
}
}
}
