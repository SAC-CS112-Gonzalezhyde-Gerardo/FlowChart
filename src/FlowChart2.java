import java.util.Scanner;
public class FlowChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in );
		int thirst;
		int breakfast;
		
		System.out.println("1. Hungry");
		System.out.println("2. Get in line");
		System.out.println("3. Buy lunch");
		System.out.print(" Are you thirsty? (yes=1,no=2)");
		int thrist = input.nextInt();
		if (thrist == 1)
		System.out.println("Ate Breakfast? (yes=1,no=2");
		else System.out.println("Get Water");
		breakfast = input.nextInt();
		if (breakfast == 1)
			System.out.println("Buy Diet Coke");
		if (breakfast == 2)
			System.out.println("Buy Coke");
		System.out.println("4. Eat lunch");
		System.out.println("5. Return tray");
		System.out.println("6. Leave");
		
	
	}

}
