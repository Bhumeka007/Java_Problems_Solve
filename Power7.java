import java.util.Scanner;
public class Power7{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		double base = sc.nextDouble();
		double expo = sc.nextDouble();
		double power = Math.pow(base, expo);

		System.out.println("Power: " +power);
	}
}