// Q.26] BANK MANAGEMENT SYSTEM-1

import java.util.*;

class Bank
{
	static
	{
		System.out.println("\n************************| WELCOME TO SBI |************************\n");
		System.out.println("\n--------------------Creating Database--------------------");
	}
	
	private String name;
	private int account_no;
	private int balance;
	private String pass;
	//private int passcount;
	
	public Bank()					//Working as a Bank Manager
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter customer name   : ");
		name = sc.nextLine();
		name = name.toUpperCase();
		System.out.print("create account number : ");
		account_no = sc.nextInt();
		System.out.print("Enter initial balance : ");
		balance = sc.nextInt();
		System.out.print("Set the password      : ");
		password();										//this function will scan a valid password
	}
	
	public void password()			//to validate password
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			pass = sc.next();						//password should not be space seperated
			if(pass.length() >= 4)
				break;
			else
				System.out.print("password must contain minimum 4 characters\nEnter password again  : ");
		}	
	}
	
	public void printData()
	{
		System.out.println("\nName       = " + name);
		System.out.println("Acc Number = " + account_no);
		System.out.println("Balance    = " + balance + " Rs");
		System.out.print("Password   = ");
		for(int i=0; i<pass.length(); i++)
		{
			System.out.print('*');
		}
		System.out.println();
	}
	
	public void deposit()
	{
		Scanner sc = new Scanner(System.in);
		int amount;
		System.out.print("Enter amount to deposit : ");
		amount = sc.nextInt();
		
		//update the balance of customer 
		balance = balance + amount;
		
		System.out.println("\n" + amount + " Rs deposited successfully to your account.");
		System.out.println("\nDetails of customer");
		printData();			//print details with the updated amount
	}
	
	public void withdraw()
	{
		Scanner sc = new Scanner(System.in);
		int amount;
		System.out.print("Enter amount to withdraw: ");
		amount = sc.nextInt();
		
		while(balance-amount <= 0)
		{
			System.out.println("cannot withdraw. Plz enter valid amount.");
			System.out.print("Enter amount to withdraw: ");
			amount = sc.nextInt();
		}
		
		//update the balance of customer 
		balance = balance - amount;
		
		System.out.println("\n" + amount + " Rs withdraw successfully from your account.");
		System.out.println("\nDetails of customer");
		printData();			//print details with the updated amount
	}
	
	public static void depositMoney(Bank sbi[])
	{
		Scanner sc = new Scanner(System.in);
		int i,acc_no,pass_count=0,flag=0;
		String pass;
		
		System.out.print("\nEnter Account Number    : ");
		acc_no = sc.nextInt();
		for(i=0; i<sbi.length; i++)
		{
			if(sbi[i].account_no == acc_no)
			{
				flag = 1;
				System.out.print("Enter the Password      : ");
				while(true)
				{
					pass = sc.next();
					pass_count++;
					if(pass_count >= 3)
					{
						System.out.println("\nYou have exceeded your password count. Your account is suspended for a day.");
						//break;
						return;				//return from deposit system
					}
					else if(pass.equals(sbi[i].pass))			//if password is correct then deposit money
					{
						sbi[i].deposit();						//calling deposite() function for sbi[i]
						break;
					}
					else
					{
						System.out.print("Wrong password\nEnter password again    : ");
					}
				}
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println("\nCustomer with Account number: " + acc_no + " does not exists.");
		}
	}
	
	public static void withdrawMoney(Bank sbi[])
	{
		Scanner sc = new Scanner(System.in);
		int i,acc_no,pass_count=0,flag=0;
		String pass;
		
		System.out.print("\nEnter Account Number    : ");
		acc_no = sc.nextInt();
		for(i=0; i<sbi.length; i++)
		{
			if(sbi[i].account_no == acc_no)
			{
				flag = 1;
				System.out.print("Enter the Password      : ");
				while(true)
				{
					pass = sc.next();
					pass_count++;
					if(pass_count >= 3)
					{
						System.out.println("\nYou have exceeded your password count. Your account is suspended for a day.");
						//break;
						return;				//return from withdraw system
					}
					else if(pass.equals(sbi[i].pass))			//if password is correct then withdraw money
					{
						sbi[i].withdraw();						//calling withdraw() function for sbi[i]
						break;
					}
					else
					{
						System.out.print("Wrong password\nEnter password again    : ");
					}
				}
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println("\nCustomer with Account number: " + acc_no + " does not exists.");
		}
	}
	
	static void updatePassword(Bank sbi[])
	{
		Scanner sc = new Scanner(System.in);
		int i,acc_no,pass_count=0,flag=0;
		String pass;
		
		System.out.print("\nEnter Account Number    : ");
		acc_no = sc.nextInt();
		for(i=0; i<sbi.length; i++)
		{
			if(sbi[i].account_no == acc_no)
			{
				flag = 1;
				System.out.print("Enter old Password      : ");
				while(true)
				{
					pass = sc.next();
					pass_count++;
					if(pass_count >= 3)
					{
						System.out.println("\nYou have exceeded your password count. Your account is suspended for a day.");
						//break;
						return;				//return from deposit system
					}
					else if(pass.equals(sbi[i].pass))			//if password is correct then deposit money
					{
						//means old password is correct, update new password
						System.out.print("Enter new Password      : ");
						sbi[i].password();				//this function will set new password
						System.out.println("Password Updated Successfully");
						System.out.println("\nCustomer details");
						sbi[i].printData();
						break;
					}
					else
					{
						System.out.print("Wrong password\nEnter old password      : ");
					}
				}
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println("\nCustomer with Account number: " + acc_no + " does not exists.");
		}
	}
	
}

class Que26
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Bank sbi[] = new Bank[3];
		
		int i;
		for(i=0; i<sbi.length; i++)
		{
			sbi[i] = new Bank();
		}
		System.out.println("\n--------------------Database  Created--------------------");

		
		System.out.println("\n\nBank customers");
		for(i=0; i<sbi.length; i++)
		{
			sbi[i].printData();
		}
		//Bank.depositMoney(sbi);
		//Bank.withdrawMoney(sbi);
		//Bank.updatePassword(sbi);
		//Bank.withdrawMoney(sbi);
		
		int ch;
		do
		{
			System.out.println("\n_____________________| SBI BANKING |_____________________");
			System.out.println("1. Deposite Amount");
			System.out.println("2. Withdraw Amount");
			System.out.println("3. Update Password");
			System.out.println("4. Exit");
			System.out.println("_________________________________________________________");
			System.out.print("\nEnter your choice : ");
			ch = sc.nextInt();
			sc.nextLine();					//to avoid buffer problem
			
			switch(ch)
			{
				case 1:
					Bank.depositMoney(sbi);
					break;
					
				case 2:
					Bank.withdrawMoney(sbi);
					break;
					
				case 3:
					Bank.updatePassword(sbi);
					break;
					
				case 4:
					System.out.println("\n********************| THANK YOU! |********************");
					break;
				
				default:
					System.out.println("\nInvalid choice...");
			}
		}while(ch != 4);
	}
}	