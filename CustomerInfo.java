import java.util.ArrayList;
import java.util.Scanner;

public class CustomerInfo {
	Product front,ptr,q;
	Scanner sc=new Scanner(System.in);
	
	Product pobj=null;
	double finaltotal=0;
	public void add(ArrayList<Product> parr)
	{
		System.out.println("Enter Product Id u want to Buy :");
		int id=sc.nextInt();
		Info obj=new Info();
		//obj.notifyAll();
		pobj=obj.search(parr, id);
		//pobj=obj.ainfo.search(obj.parr, id);
		if(pobj!=null)
		{
			Product newnode=new Product();
			newnode.setpId(pobj.getpId());
			newnode.setpName(pobj.getpName());
			newnode.setPrice(pobj.getPrice());
			System.out.println("Enter Product Qty : ");
			int qty=sc.nextInt();
			if(qty<=pobj.getQty())
			{
				newnode.setQty(qty);
				newnode.setTotal(qty*pobj.getPrice());
				if(front==null || pobj.getTotal() > newnode.getTotal())
				{
					newnode.setAddr_next(front);
					front=newnode;
				}
				else
				{
					q=front;
					while(q.getAddr_next()!=null && q.getAddr_next().getTotal()<=newnode.getTotal())
					{
						q=q.getAddr_next();
					}
					newnode.setAddr_next(q.getAddr_next());
					q.setAddr_next(newnode);
				}
				pobj.setQty(pobj.getQty()-qty);
			}
			else
			{
				System.out.println("Utne Items nahi hai store me");
				
			}
		}
		else
		{
			System.out.println("Product Not Found");
		}
			
	}
	public void display() {
		if(front==null)
		{
			System.out.println("Linked list is empty");
		}
		else
		{
			System.out.println("__________________________ Bill _____________________________");

			ptr=front;
			while(ptr!=null)
			{
				System.out.println("_______________________________________________________");
				System.out.println("ID\tNAME\tPRICE\tQTY\tTotal");
				System.out.println(ptr.getpId()+"\t"+ptr.getpName()+"\t"+ptr.getPrice()+"\t"+ptr.getQty()+"\t"+ptr.getTotal());
				finaltotal=finaltotal+ptr.getTotal();
				ptr=ptr.getAddr_next();
				System.out.println("_______________________________________________________");
			}
			System.out.println();
			System.out.println("_______________________________________________________");
			System.out.println("Final ToTal :\t\t\t"+finaltotal);
			System.out.println("_______________________________________________________");
		}

		
	}
	

}
