import java.util.Scanner;
public class Equilateral{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		double side = sc.nextDouble();
		double area = (Math.sqrt(3)/4)*(side*side);

		System.out.println("Area: " +area); 
	}
}