import java.util.Scanner;
public class Pera{
	public static void main(String[] a){
		double length, width, P;
		Scanner sc = new Scanner(System.in);
		length = sc.nextDouble();
		width = sc.nextDouble();

		P = 2*(length+width);
		System.out.println("Perimeter: " +P);
	}
}
