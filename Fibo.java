import java.util.Scanner;
public class Fibo{
	public static int fib(int n){
		if(n==0) return 0;
		else if(n==1) return 1;
		else
			return fib(n-1)+fib(n-2);
	}
	public static void main(String[] a){
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=0; i<=(n-1); i++)
		{
			System.out.println(fib(i));
		}
	}
}