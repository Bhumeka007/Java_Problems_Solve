import java.util.Scanner;
public class InduDig{
	static int a;
	static void digit(int n){
		if(n==0) return;
		int dig = n%10; 
		digit(n/10);
		if(n==a) System.out.println(dig);
		else System.out.print(dig+",");
	}
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = n;
		digit(n);
	}
}