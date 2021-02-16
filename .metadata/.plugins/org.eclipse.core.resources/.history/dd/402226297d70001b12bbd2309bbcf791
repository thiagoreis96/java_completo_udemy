package entities;

public class BankClient {
	
	private int account;
	private String holder;
	private double balance;
	
	public BankClient(int account, String holder, double balance) {
		this.account = account;
		this.holder = holder;
		this.balance = balance;
	}
	
	public BankClient(int account, String holder) {
		this.account = account;
		this.holder = holder;
	}
	
	public int getAccount() {
		return account;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double deposit) {
		balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		balance -= withdraw + 5;
	}
	
	public String toString() {
		return "Account "
		+ account
		+ ", Holder: "
		+ holder
		+ ", Balance: $ "
		+ String.format("%.2f", balance);
	}
}
