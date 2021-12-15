package Contas;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//Upcasting
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003,"Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		//muito usado em polimorfismo
		
		//Downcasting
		
		//BusinessAccount acc4 = acc2;  a conversão não é natural
		BusinessAccount acc4  = (BusinessAccount) acc2; //casting manual
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;//não é permitida mas o compilador não sabe de acc3 é uma SavingsAccount
		//corrigir esse erro
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("loan!");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	
	}
}
