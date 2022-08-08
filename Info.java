import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Info {
	Scanner sc=new Scanner(System.in);
	public ArrayList<Product> create() {
		int ch=0;
		
		ArrayList<Product> pdarr=new ArrayList<>();
		do
		{
			
			System.out.println("Enter Product Details :) ");
			System.out.println("Enter Product Name");
			String Name=sc.next();
			System.out.println("Enter Id : ");
			int Id=sc.nextInt();
			System.out.println("Enter Price : ");
			double price=sc.nextDouble();
			System.out.println("Enter Qty : ");

			int qty=sc.nextInt();
			
			Product pd=new Product(Id,Name,price,qty);
			pdarr.add(pd);
			System.out.println("Do you want to add more press 1 : ");
			ch=sc.nextInt();
		}while(ch==1);
		
		return pdarr;
		
	}
	public void display(ArrayList<Product> pdarr)
	{
		System.out.println("ID\tNAME\tPRICE\tQTY");
		for(Product p:pdarr)
		{
			System.out.println(p.getpId()+"\t"+p.getpName()+"\t"+p.getPrice()+"\t"+p.getQty());
		}
	}
	
	public void insert(ArrayList<Product> pdarr, Product p) {
		// TODO Auto-generated method stub
		System.out.println("Enter Location :");
		int ch=sc.nextInt();
		pdarr.add(ch-1,p);	
	}
	public Product search(ArrayList<Product> pdarr,int pid)
	{
		boolean b=false;
		Product temp=null;
		
		for(Product p:pdarr)
		{
			if(p.getpId()==pid)
			{
				temp=p;
				b=true;
				break;
			}
			
		}
		if(b)
		{
			System.out.println("Product Found");
		}
		else
		{
			System.out.println("Product Not Found");
		}
		return temp;
	}
	public void deleteData(ArrayList<Product> pdarr,int pid)
	{
		Product temp=search(pdarr,pid);
		if(temp!=null)
		{
			pdarr.remove(temp);
			System.out.println("Record Deleted");
		}
		else
		{
			System.out.println("Record not found");
		}
	}
}
