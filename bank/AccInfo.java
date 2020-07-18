import java.util.Scanner;

public class AccInfo {
	
	public Customer[] create() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of customers : ");
		int no=sc.nextInt();
		Customer c[]=new Customer[no];
		for(int i=0;i<c.length;i++) {
			
			System.out.println("Enter the customer name : ");
			String name=sc.next();
			System.out.println("Enter the account no. : ");
			long id=sc.nextLong();
			System.out.println("Enter the type of account : ");
			String type=sc.next();
			System.out.println("Enter the amount deposited at the time of creation : ");
			long amt=sc.nextLong();
			System.out.println("Create account with the above details ? Y/N ");
			String ans=sc.next();
			if(ans.charAt(0)=='Y' || ans.charAt(0)=='y') {
				
				NAccount a=new NAccount(id,type,(amt+1000));
				Customer c2=new Customer(name,a);
				System.out.println("Account created!!");
				show(c2);
				c[i]=c2;
			}
			else {
				System.out.println("Account details deleted !!");
				i-=1;
			}
		}
		display(c);
			trans(c);
		sc.close();
		return c;
	}
	
	public void display(Customer c[]) {
		
		System.out.println("\n------- CUSTOMER DETAILS ----- ");
		System.out.println("\n\n------------------------------------------------------------------------------------------");
		System.out.println("\tName\t\t\tA/C No.\t\t\tBalance\t\t\tType");
		System.out.println("------------------------------------------------------------------------------------------");
		for (int i=0;i<c.length;i++) {
			System.out.println("\t"+c[i].getAccName()+"\t\t"+c[i].getAcc().getAccNo()+"\t\t\t"+c[i].getAcc().getBalance()+"\t\t\t"+c[i].getAcc().getType());
		}
		System.out.println("------------------------------------------------------------------------------------------");
	}
	
	public void show(Customer c) {
		System.out.println("\n------------------------------------------------------------------------------------------");
		System.out.println("\tName\t\t\tA/C No.\t\t\tBalance\t\t\tType");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("\t"+c.getAccName()+"\t\t"+c.getAcc().getAccNo()+"\t\t\t"+c.getAcc().getBalance()+"\t\t\t"+c.getAcc().getType());
		System.out.println("------------------------------------------------------------------------------------------\n\n");
	}
	
	public void trans(Customer c[]) {
		System.out.println("\n\n------- TRANSACTIONS -------");
			
		System.out.println("\nDo you want to perform any transactions on any of these accounts ? Y/N");
		Scanner sc=new Scanner(System.in);
		String ans2=sc.next();
		
		if(ans2.charAt(0)=='Y' || ans2.charAt(0)=='y') {
			System.out.println("Enter the account number : ");
			long acc=sc.nextLong();
			
			for(int i=0;i<c.length;i++) {
				
				if(c[i].getAcc().getAccNo()==acc) {
					
					System.out.println("Account found : Account Number - "+c[i].getAcc().getAccNo());
					System.out.println("Which of the following operations do you wish to perform ?\n1.Deposit\n2.Withdraw");
					int ans3=sc.nextInt();
					switch(ans3) {
						case 1:
							Transactions t=new Transactions();
							t.deposit(c[i]);
							show(c[i]);
							break;
						case 2:
							Transactions t2=new Transactions();
							t2.withdraw(c[i]);
							show(c[i]);
							break;
						default:
							System.out.println("Invalid choice !!");
							break;
					}
				}
			}
		}
		else {
			System.out.println("------- THANKYOU !! -------");
		}
		sc.close();
		
	}
}
