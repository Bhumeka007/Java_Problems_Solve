import javax.swing.JOptionPane;
public class Name1{
	public static void main(String[] a){
		//System.out.println("first argument" +a[0]);
		//System.out.println("Second ars: " +a[1]);

		String name = JOptionPane.showInputDialog(null,"Enter your name:");
		System.out.println("My name " +name);
	}
}