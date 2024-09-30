import java.util.*;

class second{
	
	public static void main(String[] args){
	long i=0;
	long acc_num=12001220+(i++);
	savings ob1=new savings("Aditi",1000,acc_num);
	System.out.println(12001220+i);
	acc_num=12001220+(i++);
	current ob2=new current("Neha",2000,acc_num);i++;
	System.out.println("For person1(saving):");
	System.out.println("acc_number="+ob1.acc_number);
	System.out.println("acc_balance="+ob1.acc_balance);
	System.out.println("acc_holder="+ob1.acc_holder);


	ob1.deposite(1500);

	ob1.withdraw(100);
	ob1.withdraw(1500);
	ob1.withdraw(1400);
	System.out.println();
	
	System.out.println("For person2(current account with 20000 overdraft):");
	System.out.println("acc_number="+ob2.acc_number);
	System.out.println("acc_balance="+ob2.acc_balance);
	System.out.println("acc_holder="+ob2.acc_holder);
	ob2.deposite(1000);
	ob2.withdraw(20000);
	ob2.withdraw(4000);
	ob2.withdraw(3000);

	}
		
}








class Account{
	public  long acc_number;
	public  double acc_balance;
	public  String acc_holder;
	
	public void deposite(){
		System.out.println("No type of account mentioned...");
	}

	public void withdraw(){
		System.out.println("No type of account mentioned...");
	}
	
	public void display(){
		System.out.println("Your Present Balance="+acc_balance);
	}
}

class savings extends Account{
	savings(String name,double money,long account_num){
		if(money>=1000){
			acc_number=account_num;
			acc_balance=money;
			acc_holder=name;
			System.out.println("thank you making your account,"+name+"here are some details:");
			System.out.println("acc_number="+acc_number);
			System.out.println("acc_balance="+acc_balance);
			System.out.println("acc_holder="+acc_holder);
		}
		else{
			System.out.println("No,account is created ...Atleast 1000/- is required for saving account creation.");
		}	
	}
	public void deposite(int depo_money){
		if(depo_money>0){
			acc_balance+=depo_money;
			System.out.println("Successfully deposite "+depo_money+" Rupee");
			display();
		}
		else{System.out.println("Providing negative deposite money");}

	}

	public void withdraw(int wd_money){
		if(acc_balance-wd_money>=1000){
			acc_balance-=wd_money;
			System.out.println("Successfully withdrawn "+wd_money+" Rupee");
			display();
		}
		else{
			System.out.println("Withdrawn isnot possible due to insufficient balance");
			System.out.println("Withdrawn isnot possible, Atleast 1000/- must be the balance...");

		}
	}

}


class current extends Account{
	current(String name,double money,long account_num){
		if(money>=2000){
			acc_number=account_num;
			acc_balance=money;
			acc_holder=name;
			System.out.println("thank you making your account,"+name+"here are some details:");
			System.out.println("acc_number="+acc_number);
			System.out.println("acc_balance="+acc_balance);
			System.out.println("acc_holder="+acc_holder);
		}
		else{
			System.out.println("No,account is created ...Atleast 2000/- is required for current account creation.");
		}	
	}
	public void deposite(int depo_money){
		if(depo_money>0){
			acc_balance+=depo_money;
			System.out.println("Successfully deposite "+depo_money+" Rupee");
			display();
		}
		else{System.out.println("Providing negative deposite money");}
	}

	public void withdraw(int wd_money){
		if(acc_balance-wd_money>=-20000){
			acc_balance-=wd_money;
			System.out.println("Successfully withdrawn "+wd_money+" Rupee");
			display();
		}
		else{
			System.out.println("Withdrawn isnot possible due to insufficient balance");
			System.out.println("overdraft limit=20000...");

		}
	}
}

	

	