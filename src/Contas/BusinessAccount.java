package Contas;

public class BusinessAccount extends Account{
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(int number, String holder, double initialDeposit, Double loanLimit) {
		super(number, holder, initialDeposit);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	 public void loan(Double amount) {
		 if(amount <= loanLimit) {
		 balance +=amount - 10 ;//da erro se o balance da class Account não for protected (não posso deixar public) 
		 }
	 }
	 @Override
	 public void withdraw(double amount) {
		 super.withdraw(amount);
		 balance -=2.0;
	 }
	
	
}
