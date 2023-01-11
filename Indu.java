import java.util.Scanner;
public class Indu{
	public static void main(String[] a){
		int n, m;
		Scanner sc = new Scanner(System.in);
   		n = sc.nextInt();
		if(n==0)
		{
			return;
		}
		m = n%10;
		n = n/10;
		System.out.println(m +" , ");
	}
}