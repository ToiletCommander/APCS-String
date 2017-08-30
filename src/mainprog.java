
import java.util.Scanner; //Import scanner from the system library.
public class mainprog {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Type your name");
		String name = kb.nextLine();
		System.out.println("Your name is:" + name);
		System.out.println("And welcome to the APCS 2.0 Philosophy system");
		System.out.println("Please follow the tortue of our king Bili Harington");
	}
}
