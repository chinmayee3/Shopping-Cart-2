import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		ArrayList<Product> parr=null;
		Info ainfo=new Info();
		CustomerInfo cinfo=new CustomerInfo();
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int ch=0;
		
		do
		{
			System.out.println("1-Admin\t2-Customer");
			System.out.println("Enter your choice : ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				do
				{
					System.out.println("1-Add Item\t2-Display\t3-Insert\t4-Search\t5-Delete");
					System.out.println("Enter your choice ");
					ch=sc.nextInt();
					switch(ch)
					{
					case 1:
						parr=ainfo.create();
						break;
					case 2:
						if(parr!=null)
						{
							ainfo.display(parr);
						}
						else
						{
							System.out.println("List is empty");
						}
						break;
					case 3:
						System.out.println("Enter Product Details :) ");
						System.out.println("Enter Product Name");
						String Name=sc.next();
						System.out.println("Enter Id : ");
						int Id=sc.nextInt();
						System.out.println("Enter Price : ");
						double price=sc.nextDouble();
						System.out.println("Enter Qty : ");
						int qty=sc.nextInt();
						Product p=new Product(Id,Name,price,qty);
						ainfo.insert(parr,p);
						break;
					case 4:
						System.out.println("Enter Product Id to search : ");
						int id=sc.nextInt();
						ainfo.search(parr, id);
						break;
					case 5:
						System.out.println();
						System.out.println("Enter Product Id to search : ");
						id=sc.nextInt();
						ainfo.deleteData(parr, id);
						break;
					default:
						System.out.println("Invalid choice");
						break;
					}
					System.out.println("Do you want to continue press 1 ");
					ch=sc.nextInt();
				}while(ch==1);
				break;
			case 2:
				do
				{
					System.out.println("1-Add Item\t2-Display");
					System.out.println("Enter your choice ");
					ch=sc.nextInt();
					switch(ch)
					{
					case 1:
						if(parr!=null)
						{
							System.out.println("Select Items from this list : ");
							System.out.println("__________________________ CART _____________________________");

							ainfo.display(parr);
							System.out.println("_____________________________1_____________________________");
						}
						else
						{
							System.out.println("Sorry....Cart is empty");
						}
						cinfo.add(parr);
						break;
					case 2:
						cinfo.display();
						break;
					}
					System.out.println("Do you want to continue press 1 ");
					ch=sc.nextInt();
				}while(ch==1);

				break;
				
			}
			System.out.println("Do you want to continue press 1 ");
			ch=sc.nextInt();
			
		}while(ch==1);
		
	}

}
