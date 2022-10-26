// Q.28] SALESPERSON MANAGEMENT SYSTEM

import java.util.Scanner;

class SalesPerson
{
	private int id;
	private String name;
	private String area;
	private int amount;
	
	public SalesPerson()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter id of salesperson   : ");
		id = sc.nextInt();
		sc.nextLine();				//to avoid buffer problem
		System.out.print("Enter name of salesperson : ");
		name = sc.nextLine();
		name = name.toUpperCase();
		System.out.print("Enter area of sale        : ");
		area = sc.nextLine();
		area = area.toLowerCase();
		System.out.print("Enter amount of sale      : ");
		amount = sc.nextInt();
	}
	
	public void printData()
	{
		System.out.println("\nId of salesperson   = " + id);
		System.out.println("Name of salesperson = " + name);
		System.out.println("Area of sale        = " + area);
		System.out.println("Amount of sale      = " + amount + " Rs");
	}
	
	public static void maxSaleAmount(SalesPerson sp[])		//this function will print details of salesperson having max sales amount
	{
		int i, max_amount = sp[0].amount;
		SalesPerson temp = sp[0];
		for(i=0; i<sp.length; i++)
		{
			if(max_amount < sp[i].amount)
			{
				max_amount = sp[i].amount;
				temp = sp[i];
			}
		}
		System.out.println("\nSalesperson having maximum sales amount : ");
		temp.printData();
	}
	
	public static void sortBySaleAmount(SalesPerson sp[])
	{
		int i,j;
		SalesPerson temp;
		for(i=0; i<sp.length; i++)
		{
			for(j=i+1; j<sp.length; j++)
			{
				if(sp[i].amount < sp[j].amount)			//decreasing order of sales amount
				{
					temp  = sp[i];
					sp[i] = sp[j];
					sp[j] = temp;
				}
			}
		}
	}
	
	public static void updateName(SalesPerson sp[])
	{
		Scanner sc = new Scanner(System.in);
		int i,id,flag=0;
		System.out.print("\nEnter id of salesperson whose name is to be updated : ");
		id = sc.nextInt();
		sc.nextLine();
		for(i=0; i<sp.length; i++)
		{
			if(id == sp[i].id)
			{
				flag = 1;
				System.out.print("Enter updated name : ");
				sp[i].name = sc.nextLine();
				sp[i].name = sp[i].name.toUpperCase();
				System.out.println("\nName updated successfully");
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println("\nNo salesperson with such a id");
		}
	}
}

class Que28
{
	static
	{
		System.out.println("\n********************| Jivan Marketing Company |********************\n");
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		//Note username & password is case sensitive
		System.out.println("\nCreating Accout for SalesManager");
		String manager_username;
		String manager_pass;
		System.out.print("\nCreate Username : ");
		manager_username = sc.nextLine();
		System.out.print("Create Password : ");
		while(true)
		{
			manager_pass = sc.next();						//password should not be space seperated
			if(manager_pass.length() >= 4)
				break;
			else
				System.out.print("password must contain minimum 4 characters\nEnter password again  : ");
		}	
		
		System.out.println("\nAccount Created Successfully\n");
		
		SalesPerson sp[] = new SalesPerson[2];
		
		System.out.println("\n______________________| Creating Database |______________________\n");
		int i;
		for(i=0; i<sp.length; i++)
		{
			sp[i] = new SalesPerson();
		}
		System.out.println("\n______________________| Database  Created |______________________\n");
		
		String username,pass;
		int pass_count = 0;
		int ch;
		
		/*
		System.out.println("\n\nSalespersons details : ");
		for(SalesPerson temp : sp)
		{
			temp.printData();
		}
		
		SalesPerson.maxSaleAmount(sp);
		
		SalesPerson.sortBySaleAmount(sp);
		
		System.out.println("\n\nSalespersons details : ");
		for(SalesPerson temp : sp)
		{
			temp.printData();
		}
		
		System.out.println();
		sc.nextLine();
		while(true)
		{
			System.out.print("Enter Username : ");
			username = sc.nextLine();
			if(username.equals(manager_username))
			{
				break;
			}
			System.out.println("Wrong username");
		}
		while(pass_count <= 3)
		{
			System.out.print("Enter Password : ");
			pass = sc.next();
			pass_count++;
			if(pass.equals(manager_pass))
			{
				break;
			}
			System.out.println("Wrong password");
		}
		if(pass_count > 3)
		{
			System.out.println("\nYou have exceeded your password count, your account is suspended for a day");
			//return;
		}

		SalesPerson.updateName(sp);
		
		System.out.println("\n\nSalespersons details : ");
		for(SalesPerson temp : sp)
		{
			temp.printData();
		}
		
		//update Manager username & password
		sc.nextLine();
		System.out.println();
		while(true)
		{
			System.out.print("Enter old Username : ");
			username = sc.nextLine();
			if(username.equals(manager_username))
			{
				break;
			}
			System.out.println("Wrong username");
		}
		pass_count = 0;
		while(pass_count <= 3)
		{
			System.out.print("Enter old Password : ");
			pass = sc.next();
			pass_count++;
			if(pass.equals(manager_pass))
			{
				break;
			}
			System.out.println("Wrong password");
		}
		if(pass_count > 3)
		{
			System.out.println("\nYou have exceeded your password count, your account is suspended for a day");
			//return;
		}
		
		sc.nextLine();
		System.out.print("\nEnter new username : ");
		manager_username = sc.nextLine();
		System.out.print("Enter new password : ");
		while(true)
		{
			manager_pass = sc.next();						//password should not be space seperated
			if(manager_pass.length() >= 4)
				break;
			else
				System.out.print("password must contain minimum 4 characters\nEnter new password : ");
		}	
		
		System.out.println("\nUsername & Password updated successfully\n");
		*/
	
		do
		{
			System.out.println("\n\n--------------------------------------------------------");
			System.out.println("1. print details of salespersons.");
			System.out.println("2. salesperson having maximum sales amount.");
			System.out.println("3. sort salespersons by decreasing sales amount.");
			System.out.println("4. update name of salesperson.");
			System.out.println("5. update manager username & password.");
			System.out.println("6. exit.");
			System.out.println("--------------------------------------------------------");
			System.out.print("\nEnter your choice : ");
			ch = sc.nextInt();
			sc.nextLine();				//to avoid buffer problem
			
			switch(ch)
			{
				case 1:
					System.out.println("\n\nSalespersons details : ");
					for(SalesPerson temp : sp)				//for each loop
					{
						temp.printData();
					}
					break;
					
				case 2:
					SalesPerson.maxSaleAmount(sp);
					break;
					
				case 3:
					SalesPerson.sortBySaleAmount(sp);
					break;
					
				case 4:
					System.out.println();
					//sc.nextLine();
					pass_count = 0;
					while(true)
					{
						System.out.print("Enter Username : ");
						username = sc.nextLine();
						if(username.equals(manager_username))
						{
							break;
						}
						System.out.println("Wrong username");
					}
					while(pass_count <= 3)
					{
						System.out.print("Enter Password : ");
						pass = sc.next();
						pass_count++;
						if(pass.equals(manager_pass))
						{
							break;
						}
						System.out.println("Wrong password");
					}
					if(pass_count > 3)
					{
						System.out.println("\nYou have exceeded your password count, your account is suspended for a day");
						break;
					}
					SalesPerson.updateName(sp);
					break;
					
				case 5:
					//sc.nextLine();
					System.out.println();
					pass_count = 0;
					while(true)
					{
						System.out.print("Enter old Username : ");
						username = sc.nextLine();
						if(username.equals(manager_username))
						{
							break;
						}
						System.out.println("Wrong username");
					}
					while(pass_count <= 3)
					{
						System.out.print("Enter old Password : ");
						pass = sc.next();
						pass_count++;
						if(pass.equals(manager_pass))
						{
							break;
						}	
						System.out.println("Wrong password");
					}
					if(pass_count > 3)
					{
						System.out.println("\nYou have exceeded your password count, your account is suspended for a day");
						break;
					}
				
					sc.nextLine();
					System.out.print("\nEnter new username : ");
					manager_username = sc.nextLine();
					System.out.print("Enter new password : ");
					while(true)
					{
						manager_pass = sc.next();						//password should not be space seperated
						if(manager_pass.length() >= 4)
							break;
						else
							System.out.print("password must contain minimum 4 characters\nEnter new password : ");
					}	
					System.out.println("\nUsername & Password updated successfully\n");
					break;
				
				case 6:
					System.out.println("\n*********************| THANK YOU! |********************\n");
					break;
				
				default:
					System.out.println("\nInvalic Choice...");
			}
		}while(ch != 6);
	}
}