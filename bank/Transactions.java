import java.util.Scanner;

public class Transactions {
	
	public Transactions() {
		
	}
	
	public void deposit(Customer c) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount you want to deposit : ");
		long amount=sc.nextLong();
		amount=c.getAcc().getBalance()+amount;
		System.out.println("\nNew Balance : Rs. "+amount);
		c.getAcc().setBalance(amount);
		sc.close();
	}
	
	public void withdraw(Customer c) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the amount you want to withdraw : ");
			long amount=sc.nextLong();
			if (amount>c.getAcc().getBalance()) {
				System.out.println("Low Balance !!");
				System.out.println("Your balance is Rs. "+c.getAcc().getBalance());
			}
			else if((c.getAcc().getBalance()-amount)<c.getAcc().getMinBalance()) {
				System.out.println("\nMinimum balance required is Rs 1000");
			}
			else {
				long newbal=c.getAcc().getBalance()-amount;
				c.getAcc().setBalance(newbal);
				System.out.println("\nCurrent Balance : Rs. "+newbal);
				c.getAcc().setBalance(newbal);
			}
			sc.close();
		}
}
