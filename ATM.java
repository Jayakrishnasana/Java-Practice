package collections;



import java.util.Scanner;

abstract class Bank{
	public String bankName="SBI" ;
	public String branch="Andhra Pradesh";
	
	public void bankDetails() {
		System.out.println("Bank Name :" +bankName +"");
	}
	
	abstract void deposite();
	abstract void withdraw();
	abstract void checkBalance();
	
}



class bankService extends Bank{
	private double money;
	private double bal=100000;
	
	
	Scanner scn=new Scanner(System.in);
	
	public void bankDetails() {
		super.bankDetails();
		System.out.println("Branch :"+branch);
	}
	
	void deposite() {
		System.out.print("Enter the money :");
		money=scn.nextDouble();
		bal=bal+money;
		System.out.println("Deposite money :"+money);
		System.out.println("Total Balance :"+bal);
		
	
	}
	
	void withdraw() {
		
			System.out.print("Enter the money :");
			money=scn.nextDouble();
			if(money<bal) {
			bal=bal-money;
			System.out.println("withdraw money :"+money);
			System.out.println("Total Balance :"+bal);
			}
			else {
				System.out.println("Insufficiant Balance ");
			}
			
			
		
	}
	
	void checkBalance() {
		System.out.println("Account Balance :"+bal);
			
	}
	
}

public class ATM {

	public static void main(String[] args) {
		bankService b= new bankService();
		b.bankDetails();
		
		
		Scanner scn=new Scanner(System.in);
		int ch;
		char x;
		int password=2345;
		
		System.out.println("Enter password :");
		int p2=scn.nextInt();
		if(password==p2) {
		
		do {
			
			
			System.out.println("Deposite : 1");
			System.out.println("Withdraw : 2");
			System.out.println("Check Account Balance : 3");
			System.out.print("Enter the choice : ");
			 ch=scn.nextInt();
			switch(ch)
			{
			case 1:b.deposite();
			break;
			case 2:b.withdraw();
			break;
			case 3:b.checkBalance();
			break;
			default :System.out.println("Invalid choice ...!");
			}
			
			System.out.println("do you want to continue(y/n)");
			 x=scn.next().charAt(0);
		} 
		while (x=='y');
		}
		else {
			System.out.println("Invalid Password....!Please Enter Correct Password !");
		}
	
		
		

	}
	
	

}
