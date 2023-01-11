import Java.util.Scanner;
public class Sum{
    public static void main(String[] a)
    {
        int j, h, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("First: ");
        j = sc.nextInt();
        System.out.println("Second: ");
        h = sc.nextInt();
        sum = j+h;
        sc.close();
        System.out.println("Sum: " + sum);
    }
}