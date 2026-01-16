package pac2;

class Human{
	String name;
	float age ;
	
	Human(String name ){
		this.name=name;
		
	}
	

	
		// TODO Auto-generated constructor stub
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}
	
	
	
}

class Account extends Human{
	long accNum;
	double balance ;
	Human accHolder;
	final double MIN_BALANCE=500.00;
	double amount;
	
	 public Account(String name,long accNum, double balance){
	    super(name);
		this.accNum=accNum;
		this.balance=balance;
		if (balance >= MIN_BALANCE) {
	        this.balance = balance;
	    } else {
	        this.balance = MIN_BALANCE;
	        System.out.println("Minimum balance ₹500 maintained.");  
		
	}
}
	
	   public void deposit(double amount) {
//	        if (amount > 0) {
	            balance += amount;
	        }
//	    }
	   
	    public void withdraw(double amount) {
	        if (balance - amount >= MIN_BALANCE) {
	            balance -= amount;
	        } else {
	            System.out.println("Withdrawal denied! Minimum balance ₹500 must be maintained.");
	        }
	    }
	    public void getbalance() {
	    	System.out.println(balance);
	    }

		public long getAccNum() {
			return accNum;
		}

		public void setAccNum(long accNum) {
			this.accNum = accNum;
		}

		public Human getAccHolder() {
			return accHolder;
		}

		public void setAccHolder(Human accHolder) {
			this.accHolder = accHolder;
		}
	    
	
	
}
public class lab2_1 {

	public static void main(String[] args) {
		Account ac = new Account("daksdh",12345678,2000);
//		ac.accHolder
		ac.deposit(2000);
		ac.getbalance();
		
		// TODO Auto-generated method stub

	}

}
