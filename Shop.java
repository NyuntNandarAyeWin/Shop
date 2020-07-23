package Shop;

import java.util.Date;

public class Shop extends DiscountRate {
	
	Customer cst;
	Date date;
	double serviceExpense;
	double productExpense;
	
	
	public Shop(Customer cst,double serviceExpense, double productExpense, Date date) {
		super.name = cst.name;
		super.memberType = cst.memberType;
		this.cst = cst;
		this.serviceExpense = serviceExpense;
		this.productExpense = productExpense; 
		this.date = date;
	}
	
	public double getTotalExpense() {
		double totExp =(serviceExpense + productExpense) -((serviceExpense * getServiceDiscountRate(memberType)) + (productExpense * getProductDiscountRate(memberType)));
		return totExp;
	}

	public void display() {
		System.out.println(super.toString());
		System.out.println("Service Expense : "+serviceExpense);
		System.out.println("Product Expense : "+productExpense);
		System.out.println("Total Expense : "+getTotalExpense());
		System.out.println("Date : "+date);
		System.out.println();
	}
	public static void main(String[] args) {
		Customer cst1 = new Customer("Daw Aye", "Premium");
		Customer cst2 = new Customer("Ma Ma", "Gold");
		Customer cst3 = new Customer("Shwe Yote", "Silver");
		Customer cst4 = new Customer("khay","");
		
		Shop sh1 = new Shop(cst1, 2000, 8000,new Date());
		Shop sh2 = new Shop(cst2, 1000, 5000, new Date());
		Shop sh3 = new Shop(cst3, 500, 3000,new Date());
		Shop sh4 = new Shop(cst4, 200, 4000, new Date());
		
		sh1.display();
		sh2.display();
		sh3.display();
		sh4.display();
	}

}
