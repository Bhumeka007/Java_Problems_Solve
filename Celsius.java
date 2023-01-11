import java.util.Scanner;
public class Celsius{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		double far = sc.nextDouble();
		double celsius = (far-32)*5/9;

		System.out.println("Celsius: " +celsius);
	}
}