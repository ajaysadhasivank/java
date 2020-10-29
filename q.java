import java.io.*;
import java.util.*;
class queue
{
int front=-1,rear=-1,MAX;
queue()
{
front=-1;
rear=-1;
}
queue(int n){
MAX = n;
}
int enqueue(int item,int q[])
{
if (rear==MAX-1)
{
System.out.println("QUEUE OVERFLOW");
return 0;
}
else
    {
        if (front==-1){
        front = 0;
      }
         rear = rear + 1;
        q[rear]=item;
        return 1;
        }
}
int dequeue(int q[])
{
int del;
if (front == - 1 || front > rear)
return -999;
else
{
del=q[front];
front=front+1;
return(del);
}
}
void display(int q[])
{
int i;
if(front==-1||front>rear){
System.out.println("Queue is empty");
}
else{
for(i=front;i<=rear;i++)
System.out.println(q[i]);
}
}}
 class q{
public static void main(String args[]){
int q[]=new int[10];
Scanner in=new Scanner(System.in);
System.out.println("Enter then number of elements in the queue");
int n = in.nextInt();
queue s=new queue(n);
int item,status,ch;
int opt = 0;
while(opt!=4)
{
System.out.println("Enter your choice 1.ENQUEUE 2.DEQUEUE 3.Display 4.EXIT");
opt=in.nextInt();
switch(opt)
{
case 1:
System.out.println("Enter an item:");
item=in.nextInt();
status=s.enqueue(item,q);
if(status==1)
System.out.println("Successfully added");
else
System.out.println("QUEUE OVERFLOW");
break;
case 2:
status=s.dequeue(q);
if(status==-999)
System.out.println("Unsuccesful dequeue");
else
System.out.println("Deleted element is "+status);
break;
case 3:
s.display(q);
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
