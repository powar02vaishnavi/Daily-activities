//IF:WAP to accept a no from user and display a square if no is divisible by 5.
import java.util.*;
class GreaterNo 
{
    public static void main(String args[])
    {
        int n1,n2,n3,n4,n5;
    System.out.println("Enter Five Numbers:");
    Scanner in=new Scanner(System.in);
    n1=in.nextInt();
    n2=in.nextInt();
    n3=in.nextInt();
    n4=in.nextInt();
    n5=in.nextInt();
    if(n1>n2 && n1>n3 && n1>n4 && n1>n5)
    {
        System.out.println(+n1+" is greater number");
    }
    else if(n2>n1 && n2>n3 && n2>n4 && n2>n5)
    {
        System.out.println(+n2+" is greater number");
    }
    else if(n3>n1 && n3>n2 && n3>n4 && n3>n5)
    {
        System.out.println(+n3+" is greater number");
    }
    else if(n4>n1 && n4>n2 && n4>n3 && n1>n5)
    {
        System.out.println(+n4+" is greater number");
    }
    else if(n5>n1 && n5>n2 && n5>n3 && n5>n4)
    {
        System.out.println(+n5+" is greater number");
    }
    else
    {
        System.out.println("Please Enter Different 5 nos");
    }

    }
}
 switch case: Accept chacter from user and check it is vowel or not
//switch case: Accept chacter from user and check it is vowel or not
import java.util.*;
class vowel
{
  
      public static void main(String[] args)
      {
       char c;
       System.out.println("Enter any character");
       Scanner in=new Scanner(System.in);
       c=in.next().charAt(0);
       switch(c)
       {
           case 'a': System.out.println(c+ " is vowel");
           break;
           case 'e': System.out.println(c+ " is vowel");
           break;
           case 'i': System.out.println(c+ " is vowel");
           break;
           case 'o': System.out.println(c+ " is vowel");
           break;
           case 'u': System.out.println(c+ " is vowel");
           break;
           case 'A': System.out.println(c+ " is vowel");
           break;
           case 'E': System.out.println(c+ " is vowel");
           break;
           case 'I': System.out.println(c+ " is vowel");
           break;
           case 'O': System.out.println(c+ " is vowel");
           break;
           case 'U': System.out.println(c+ " is vowel");
           break;
           default:
           System.out.println(c+ " is not vowel");    
       } 
      }
  
}
