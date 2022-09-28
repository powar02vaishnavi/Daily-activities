/*
print  
    1
   12
  123
 1234
12345
*/

public class numRightTriangle   
{  
public static void main(String[] args)  
{  
int n=5,number=1;  
//inner loop  
for (int i= 0; i<n; i++)  
{  
//outer loop  
for (int j=1; j<=n-i; j++)  
{  
System.out.print(" ");  
}  
for (int k=0;k<=i;k++)  
{  
System.out.print(number+" "); 
number++;
}   
System.out.println(" ");  
}  
}  
}  
