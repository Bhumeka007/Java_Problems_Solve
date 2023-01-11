import java.util.Scanner;
public class TotalAvgPer{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		double eng = sc.nextDouble();
		double phy = sc.nextDouble();
		double chm = sc.nextDouble();
		double mat = sc.nextDouble();
		double com = sc.nextDouble();

		double total = eng+phy+chm+mat+com;
		double avg = total/5.0;
		double per = (total/500.0)*100;

		System.out.println("Total: " +total);
		System.out.println("Average: " +avg);
		System.out.println("Percentage: " +per);
	}
}