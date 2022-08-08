
public class Product {
	private int pId;
	private String pName;
	private double price;
	private int qty;
	private double total;
	private Product addr_next;
	public Product(int pId, String pName, double price, int qty) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.qty = qty;
	}
	public Product() {
		addr_next=null;
		
		// TODO Auto-generated constructor stub
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Product getAddr_next() {
		return addr_next;
	}
	public void setAddr_next(Product addr_next) {
		this.addr_next = addr_next;
	}
	
}
