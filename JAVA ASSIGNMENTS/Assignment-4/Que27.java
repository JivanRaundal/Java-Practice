// Q.27] BOOK SHOP MANAGEMENT SYSTEM

import java.util.*;

class Book
{
	public int book_id;
	public String book_name;
	public String book_auth;
	public int book_price;
	public int book_copies;
	public Book next;
	
	Book()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter book id      : ");
		book_id = sc.nextInt();
		sc.nextLine();							//to avoid buffer problem
		System.out.print("Enter book name    : ");
		book_name = sc.nextLine();
		book_name = book_name.toUpperCase();
		System.out.print("Enter auther name  : ");
		book_auth = sc.nextLine();
		book_auth = book_auth.toLowerCase();
		System.out.print("Enter book price   : ");
		book_price = sc.nextInt();
		System.out.print("Enter no of copies : ");
		book_copies = sc.nextInt();
		next = null;
	}
}

class BookShop
{
	static
	{
		System.out.println("\n******************************| BOOKS STORE |******************************\n");
	}
	
	private Book book_head;
	
	BookShop()
	{
		book_head = null;
	}
	
	public void addBook()				//addAtEnd()
	{
		if(book_head == null)
		{
			book_head = new Book();
		}
		else
		{
			Book p = book_head;
			while(p.next != null)
			{
				p = p.next;
			}
			p.next = new Book();
		}
	}
	
	public void show(Book p)				//will print info of only 1 book
	{
		if(p == null)
		{
			return;
		}
		System.out.printf("\n%s    %-35s  %-25s  %10s   %10s","ID","Book Name","Book Author","Price","copies");
		System.out.println("\n----------------------------------------------------------------------------------------------");
		System.out.printf("\n%d   %-35s  by %-25s %6d Rs %6d", p.book_id, p.book_name, p.book_auth, p.book_price, p.book_copies);
		System.out.println();
	}
	
	public void showBooks()
	{
		if(book_head == null)
		{
			System.out.println("\nEmpty list");
			return;
		}		
		System.out.println("\nBOOKS LIST :");
		Book p = book_head;
		System.out.printf("\n%s    %-35s  %-25s  %10s   %10s","ID","Book Name","Book Author","Price","copies");
		System.out.println("\n----------------------------------------------------------------------------------------------");
		while(p != null)
		{
			System.out.printf("\n%d   %-35s  by %-25s %6d Rs %6d", p.book_id, p.book_name, p.book_auth, p.book_price, p.book_copies);
			p = p.next;
		}
		System.out.println();
	}
	
	public Book searchById(int id)
	{
		Book p = book_head;
		while(p != null)
		{
			if(p.book_id == id)
			{
				return p;
			}
			p = p.next;
		}
		return p;		// return null if not found
	}
	
	public Book searchByName(String name)
	{
		Book p = book_head;
		while(p != null)
		{
			if(name.equalsIgnoreCase(p.book_name))
			{
				return p;
			}
			p = p.next;
		}
		return p;		// return null if not found	
	}
	
	public void updateBook(int id)
	{
		Scanner sc = new Scanner(System.in);
		
		Book p = searchById(id);
		if(p == null)
		{
			System.out.println("\nNo book with such ID.");
			return;
		}
		
		int ch;
		System.out.println("\n------------------------------");
		System.out.println("1. update book id");
		System.out.println("2. update book name");
		System.out.println("3. update book author");
		System.out.println("4. update book price");
		System.out.println("5. update book copies");
		System.out.println("-------------------------------");
		System.out.println("What do you want to update ? ");
		ch = sc.nextInt();
		sc.nextLine();				//to avoid buffer problem
		
		switch(ch)
		{
			case 1:
				System.out.print("\nEnter updated id  : ");
				p.book_id = sc.nextInt();
				break;
				
			case 2:
				System.out.println("\nEnter updated name : ");
				p.book_name = sc.nextLine();
				p.book_name = p.book_name.toUpperCase();
				break;
				
			case 3:
				System.out.println("\nEnter updated author : ");
				p.book_auth = sc.nextLine();
				p.book_auth = p.book_auth.toLowerCase();
				break;
				
			case 4:
				System.out.println("\nEnter updated price : ");
				p.book_price = sc.nextInt();
				break;
				
			case 5:
				System.out.println("\nEnter updated no of copies : ");
				p.book_copies = sc.nextInt();
				break;
				
			default:
				System.out.println("\nInvalid Choice...");
		}
		//show update Book details
		show(p);
	}
	
	public void addBookCopies(int id)
	{
		Scanner sc = new Scanner(System.in);
		
		Book p = searchById(id);
		if(p == null)
		{
			System.out.println("\nNo book with such ID.");
			return;
		}
		int extra;
		System.out.print("\nEnter the no of extra copies : ");
		extra = sc.nextInt();
		p.book_copies = p.book_copies + extra;
		//show details of updated book
		show(p);
	}
	
	public void checkCopies()
	{
		if(book_head == null)
		{
			System.out.println("\nEmpty Books list");
			return;
		}		
		
		Book p = book_head;
		System.out.printf("\n%s    %-35s  %10s","ID","Book Name","copies");
		System.out.println("\n------------------------------------------------------");
		while(p != null)
		{
			System.out.printf("\n%d   %-35s  %6d", p.book_id, p.book_name,p.book_copies);
			p = p.next;
		}
		System.out.println();
	}
	
	public void checkCopiesId(int id)			//will print copies of only 1 book with given id
	{
		Book p = searchById(id);
		if(p == null)
		{
			System.out.println("\nNo book with such id");
			return;
		}
		
		System.out.printf("\n%s    %-35s  %10s","ID","Book Name","copies");
		System.out.println("\n------------------------------------------------------");
		System.out.printf("\n%d   %-35s  %6d", p.book_id, p.book_name,p.book_copies);
		System.out.println();
	}
	
	public void orderBooks()
	{
		if(book_head == null)
		{
			System.out.println("\nNo data of books");
			return;
		}
		
		System.out.println("\nFollowing books should be order : ");
		Book p = book_head;
		int flag=0;
		System.out.printf("\n%s    %-35s  %-25s  %10s   %10s","ID","Book Name","Book Author","Price","copies");
		System.out.println("\n----------------------------------------------------------------------------------------------");
		while(p != null)
		{
			if(p.book_copies == 0)
			{
				System.out.printf("\n%d   %-35s  by %-25s %6d Rs %6d", p.book_id, p.book_name, p.book_auth, p.book_price, p.book_copies);
			}
			p = p.next;
		}
		if(flag == 0)
		{
			System.out.printf("\n%s    %-35s  %-25s  %10s   %10s","00","none","none","00","00");
			System.out.println("\n\nNo books to order.\n");	
		}
	}
	
	public void sellBookId(int id)
	{
		Scanner sc = new Scanner(System.in);
		
		Book p = searchById(id);
		if(p == null)
		{
			System.out.println("\nNo book with such id");
			return;
		}
		
		int copies;
		System.out.print("\nHow many copies of book you want to sell ? ");
		copies = sc.nextInt();
		
		while(p.book_copies - copies < 0)
		{
			System.out.println("Cannot sell, number of copies available are : " + p.book_copies);
			System.out.print("\nWant to enter no of copies again ? (y/n) : ");
			char ch = sc.next().charAt(0);
			if(ch == 'n' || ch == 'N')
			{
				return;
			}
			copies = sc.nextInt();
		}
		p.book_copies = p.book_copies - copies;
		System.out.println("\nSold Book : ");
		show(p);
		System.out.println("\nTotal Bill Amount = " + (copies * p.book_price) + " Rs");
	}
	
	public void sellBookName(String name)
	{
		Scanner sc = new Scanner(System.in);
		
		Book p = searchByName(name);
		if(p == null)
		{
			System.out.println("\nNo book with such id");
			return;
		}
		
		int copies;
		System.out.print("\nHow many copies of book you want to sell ? ");
		copies = sc.nextInt();
		
		while(p.book_copies - copies < 0)
		{
			System.out.println("Cannot sell, number of copies available are : " + p.book_copies);
			System.out.print("\nWant to enter no of copies again ? (y/n) : ");
			char ch = sc.next().charAt(0);
			if(ch == 'n' || ch == 'N')
			{
				return;
			}
			copies = sc.nextInt();
		}
		p.book_copies = p.book_copies - copies;
		System.out.println("\nSold Book : ");
		show(p);
		System.out.println("\nTotal Bill Amount = " + (copies * p.book_price) + " Rs");
	}
}

class Que27
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		BookShop book = new BookShop();
		
		int ch,id;
		String name;
		Book p;
		
		do
		{
			System.out.println("\n\n______________________________| BOOKS STORE |______________________________");
			System.out.println("1.  add new book.");
			System.out.println("2.  print books list.");
			System.out.println("3.  update existing book.");
			System.out.println("4.  add extra copies of existing book.");
			System.out.println("5.  search book by name.");
			System.out.println("6.  search book by id.");
			System.out.println("7.  check no of copies of all books.");
			System.out.println("8.  check no of copies of individual book.");
			System.out.println("9.  check which books should be ordered.");
			System.out.println("10. sell a book by id.");
			System.out.println("11. sell book by name.");
			System.out.println("12. exit.");
			System.out.println("___________________________________________________________________________");
			System.out.print("\nEnter your choice : ");
			ch = sc.nextInt();
			sc.nextLine();				//to avoid buffer problem
			
			switch(ch)
			{
				case 1:
					book.addBook();
					break;
				
				case 2:
					book.showBooks();
					break;
				
				case 3:
					System.out.print("\nEnter book id : ");
					id = sc.nextInt();
					book.updateBook(id);
					break;
				
				case 4:
					System.out.print("\nEnter book id : ");
					id = sc.nextInt();
					book.addBookCopies(id);
					break;
					
				case 5:
					System.out.print("\nEnter book name : ");
					name = sc.nextLine();
					p = book.searchByName(name);
					if(p != null)
					{	
						System.out.println("\nBook Found");
						book.show(p);
					}
					else
					{
						System.out.println("\nNot Found");
					}
					break;
					
				case 6:
					System.out.print("\nEnter book id : ");
					id = sc.nextInt();
					p = book.searchById(id);
					if(p != null)
					{	
						System.out.println("\nBook Found");
						book.show(p);
					}
					else
					{
						System.out.println("\nNot Found");
					}
					break;
					
				case 7:
					book.checkCopies();
					break;
				
				case 8:
					System.out.print("\nEnter book id : ");
					id = sc.nextInt();
					book.checkCopiesId(id);
					break;
				
				case 9:
					book.orderBooks();
					break;
					
				case 10:
					System.out.print("\nEnter book id : ");
					id = sc.nextInt();
					book.sellBookId(id);
					break;
					
				case 11:
					System.out.print("\nEnter book name : ");
					name = sc.nextLine();
					book.sellBookName(name);
					break;
					
				case 12:
					System.out.println("\n_______________________| THANK YOU! |_______________________\n");
					break;
					
				default:
					System.out.println("\nInvalid Choice...");

			}
		}while(ch != 12);
	}
}



