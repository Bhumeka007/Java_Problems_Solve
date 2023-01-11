import java.util.Scanner;
public class Circle{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double diameter = 2*radius;
		double circum = 2*3.1416*radius;
		double area = 3.1416*radius*radius;

		System.out.println("Diameter: " +diameter);
		System.out.println("Circumferenc: " +circum);
		System.out.println("Area: " +area);
	}
}