package sum;
import java.util.Scanner;
public class atm {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int initialbalance=50000;
		bankaccount obj=new bankaccount(initialbalance);
	    int choice;
		do {
			System.out.println("press(1)-Withdraw");
			System.out.println("press(2)-Deposit");
			System.out.println("press(3)-check Balance");
			System.out.println("press(4)-Exit");
			
		    choice=a.nextInt();             //int choice only not accwpting in while
			
			switch(choice) {
			case 1:
				System.out.println("enter your withdraw amount: ");
				double withdrawamount=a.nextDouble();  //this is scanner line (getting the number)
				obj.withdraw(withdrawamount);          //this obj line
				break;
			case 2:
				System.out.println("enter your deposit amount: ");
				double depositamount=a.nextDouble();
				obj.deposit(depositamount);
				break;	
			case 3:
				//double balance=obj.checkbalance();
				//System.out.println("current balance: "+balance);
				obj.checkbalance();
				break;
			case 4:
				System.out.println("Have a good day");
				break;
		    default:
					System.out.println("invalid choice.try again.");
				
			}


		}while(choice !=4);
		a.close();
		

	}

}
