import java.util.Scanner;
public class Day{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int year = day/365;
		int week = (day%365)/7;
		int days = day-((year*365)+(week*7));

		System.out.println("Years: " +year);
		System.out.println("Weeks: " +week);
		System.out.println("Days: " +days);
	}
}