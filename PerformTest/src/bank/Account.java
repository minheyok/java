package bank;

public class Account {
	
	public static void main(String[] args) {
		
		
		
	}
		
		String ano;
		String owner;
		int balance;
		

		public Account(String ano, String owner, int balance) {
			
			this.ano=ano;
			this.owner=owner;
			this.balance=balance;
				
		}
			public String getAno() {
				return ano;
		}
		public String getOwner() {
			return owner;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}	
	}
	
	


