import java.util.Scanner;
public class AreaTriangle{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int height = sc.nextInt();
		int area = (base*height)/2;

		System.out.println("Area: " +area);
	}
}