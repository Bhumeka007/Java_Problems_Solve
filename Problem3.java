import java.util.Scanner;
public class Problem3{
	static int a;

	Boolean checkW(int n){
		while(n!=1){
			if(n%2==0)
			{
				n = n/2;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(checkW(n)==true) System.out.println("Power of two");
		else System.out.println("It's not");
	}
}
