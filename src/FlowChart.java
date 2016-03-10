import java.util.Scanner;
public class FlowChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in );
		int huger;
	
		
		System.out.println("1. Hungry");
		System.out.println("2. Get in line");
		System.out.println("3. Buy lunch");
		System.out.print(" Are you thirsty? (yes=1,no=2)");
		int hunger = input.nextInt();
		if (hunger == 1)
			System.out.println("Buy Coke");
		else 
			System.out.println("Get Water");
		System.out.println("4. Eat lunch");
		System.out.println("5. Return tray");
		System.out.println("6. Leave");
		
	
	}

}
