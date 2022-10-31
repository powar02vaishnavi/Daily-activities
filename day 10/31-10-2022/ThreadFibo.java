/* Thread Class: Display Fibonacci series */

package thread1;
public class ThreadFibo extends Thread{
	public static void main(String[] args) {
	ThreadFibo ob=new ThreadFibo();
	ob.start();
	ThreadFibo ob1=new ThreadFibo();
	ob1.start();
	}
	public void run()
{
  int n, a = 0, b = 0, c = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n:");
        n = s.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
}
}
