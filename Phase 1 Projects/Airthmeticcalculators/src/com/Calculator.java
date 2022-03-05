package com;
/*Java program for Calculator.*/

import java.util.*;
 
public class Calculator{
 
     public static void main(String []args){
         int x,y,result;
         float res=0;
         /*scanner class object to read values*/
         Scanner val=new Scanner(System.in); 
          
         System.out.print("Enter first number");
         x=val.nextInt();
         System.out.print("Enter second number");
         y=val.nextInt();
          
         System.out.print("\n1: Addition.\n2: Subtraction.");
         System.out.print("\n3: Multiplication.\n4: Divide.");
         System.out.print("\n5: Remainder.\n6: Exit.");
          
         System.out.print("\nEnter your choice: ");
         result=val.nextInt();
          
         switch(result)
         {
             case 1:
                 res=(x+y); break;
             case 2:
                 res=(x-y); break;
             case 3:
                 res=(x*y); break;
             case 4:
                 res=(float)((float)x/(float)y); break;
             
             default:
                 System.out.println("An Invalid res!!!\n");
         }
         if(result>=1 && result<=4)
            System.out.println("Result is: " + res);
          
     }
}


