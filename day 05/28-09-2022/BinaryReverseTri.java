/* 
print 

10101
 0101
  101
   01
    1
*/

public class BinaryReverseTri 
{  
public static void main(String args[])  
{  
int row=5;  
for (int i= row; i>= 1; i--)  
{  
for (int j=row; j>i;j--)  
{  
System.out.print(" ");  
}  
for (int k=1;k<=i;k++)  
{  

  if (((row + k) % 2) == 0)
        System.out.print("1");
        
        else
        System.out.print("0");
                     
            }
             
        System.out.print("\n");  
  
}  
}
}

 
