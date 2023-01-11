import java.util.Scanner;
public class Power{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		double base = sc.nextDouble();
		double expo = sc.nextDouble();
		double power = pow(base, expo);

		System.out.println("Power: " +power);
	}
}