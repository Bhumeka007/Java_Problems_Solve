import java.util.Scanner;
public class Compound{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		double pri = sc.nextDouble();
		double time = sc.nextDouble();
		double rate = sc.nextDouble();
		double CI = pri* (Math.pow((1+rate/100),time));

		System.out.println("CI: " +CI);
	}
}