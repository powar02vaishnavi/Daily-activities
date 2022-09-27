/* Write a program usinh array accept the size from the 
user than accordingly accept the no from the user and find 
out the greater no,smaller no, ascending, Descending  */

import java.util.*;
public class CompareNo
{
public static void main(string args[])
{
  accept_value()
    
}
  public satic void accept_value()
  {
    //taking input from user
  Scanner sc = new Scanner(System.in);
  int n; //declaring variable
   //Ask the user to enter array size
    System.out.println("Enter a size of number set:");
   n=sc.nextInt();
    
     //Declare the array
     int arr[] = new int[n]; 
     System.out.println("Enter numbers in set:");
     for(int i=0;i<n;i++)   //Initialize the array
       {
            arr[i]=sc.nextInt();
        }

      }
  
  public static void greaterno(int[]a,int total)
  {
  int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[total-1];  
  }
  public static void smallerNo(){}
  public static void ascendingNo(){}
  public static void DescendingNo(){}
  
  }
