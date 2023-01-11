import java.util.Scanner;
public class Rectangle{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		double length = sc.nextDouble();
		double width = sc.nextDouble();
		
		double Area = length*width;
		System.out.println("Area of rectangle: " +Area); 
	}
}