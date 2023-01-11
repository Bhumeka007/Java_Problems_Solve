import java.util.Scanner;
public class Interest{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		double pri = sc.nextDouble();
		double time = sc.nextDouble();
		double rate = sc.nextDouble();
		double SI = (pri*time*rate)/100.00;

		System.out.println("SI: " +SI);
	}
}