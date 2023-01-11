import java.util.Scanner;
public class Fahrenheit{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		double celsius = sc.nextDouble();
		double far = (celsius*9/5)+32;

		System.out.println("Fahrenheit: " +far);
	}
}