import java.util.Scanner;
public class EvenOdd{
	public static void main(String[] a){
		int jh;
		Scanner sc = new Scanner(System.in);
		jh = sc.nextInt();
		if(jh%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}