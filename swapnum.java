//wap swap two numbers

import java.util.*;
class SwapNum{
public static void main(String arg[]){

int x,y,t;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of x and y");

x=sc.nextInt();
y=sc.nextInt();
System.out.println("Before swapping the number"+x+" "+y);

t=x;
x=y;
y=t;
}
}