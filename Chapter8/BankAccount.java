package Chapter8;

public class BankAccount {

		private double balance;
		
		/**
		 * Constructor
		 */
		public BankAccount() {
			this.balance = 0;
		}
		
		/**
		 * Constructor
		 * @param balance The balance to start the account with
		 */
		public BankAccount(double balance) {
			this.balance = balance;
		}
		
		/**
		 * Constructor
		 * @param str The balance to start the account with as a String
		 */
		public BankAccount(String str) {
			this.balance = Double.parseDouble(str);
		}
		
		/**
		 * Copy Constructor
		 * @param acc The account to copy
		 */
		public BankAccount(BankAccount acc) {
			this.balance = acc.balance;
		}
		
		/**
		 * deposit Method
		 * @param amount The amount to add to the account
		 */
		public void deposit(double amount) {
			this.balance += amount;
		}
		
		/**
		 * deposit Method
		 * @param str The amount to deposit passed as a String
		 */
		public void deposit(String str) {
			
			this.balance += Double.parseDouble(str);
		}
		
		/**
		 * withdraw Method
		 * @param amount The amount to withdraw from the account
		 */
		public void withdraw(double amount) {
			
			this.balance -= amount;
		}
		
		/**
		 * withdraw Method
		 * @param str The amount to withdrawn passed as String
		 */
		public void withdraw(String str) {
			
			this.balance -= Double.parseDouble(str);
		}
		
		/**
		 * setBalance Method
		 * @param b The balance
		 */
		public void setBalance(double b) {
			
			this.balance = b;
		}
		
		/**
		 * setBalance Method
		 * @param str The balance as a String
		 */
		public void setBalance(String str) {
			
			this.balance = Double.parseDouble(str);
		}
		
		/**
		 * getBalance Method
		 * @return The balance of the account
		 */
		public double getBalance() {
			
			return this.balance;
		}
		
		/**
		 * equals Method
		 * @param b The object to compare to
		 * @return If the objects are equal or not
		 */
		public boolean equals(BankAccount b) {
			if(this.balance == b.balance) {
				return true;
			}
			else
				return false;
		}
}
