import java.util.Scanner;
public class Squre{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		double root = Math.sqrt(num);

		System.out.println("Root: " +root);
	}
}