package Stacks;

import java.io.*;
import java.util.*;
import java.text.*;
public class solution
{

   public static void main(String[] args)
   {
	   int list[]=new int[5];//declaration and instantiation  
	   list[0]=10;//initialization  
	   list[1]=20;  
	   list[2]=70;  
	   list[3]=40;  
	   list[4]=50; 
	   
     SelSort(list);
     
       for(int j=0;j<=list.length-1;j++) 
         System.out.print(list[j]+ " ");
     
   }
     public static void SelSort(int[] list)
     {
     
     
        for(int i =0;i<=list.length-2;i++)
        {
           int IndexMin=i;
          for(int j = i+1;j<= list.length-1;j++)
          { 
            if(list[j]<list[IndexMin])
             IndexMin=j;
          }
         swap(list,IndexMin,i);
        }
            
        
      }      
   
   public static void swap(int[] list,int IndexMin,int i)
   {
   
   int temp;
   temp=list[i];
   list[i]=list[IndexMin];
   list[IndexMin]=temp;
   
   }
  
  
  
  }


