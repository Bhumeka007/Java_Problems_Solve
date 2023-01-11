import java.util.Scanner;
public class Meter{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		double cm = sc.nextDouble();
		double meter = cm/100.0;
		double km = cm/100000.0;

		System.out.println("Meter: " +meter);
		System.out.println("kilometer: " +km);
	}
}