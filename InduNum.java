import java.util.Scanner;
public class InduNum{
	public static void main(String[] a){
		int n, num=0, digit;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while(n != 0)
		{
			num = (num*10)+(n%10);
			n = n/10;
		}
		while(num != 0)
		{
			digit = num % 10;
			System.out.print(digit +", ");
			num = num/10;
		}
	}
}