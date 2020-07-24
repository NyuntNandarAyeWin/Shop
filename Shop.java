package Shop;

import java.util.Date;
import java.util.Scanner;

public class Shop {
	
	Customer cst;
	Date date;
	double serviceExpense;
	double productExpense;
	
	
	public Shop(Customer cst,double serviceExpense, double productExpense, Date date) {
		this.cst = cst;
		this.serviceExpense = serviceExpense;
		this.productExpense = productExpense; 
		this.date = date;
	}
	
	public double getTotalExpense() {
		double totExp;
		if(cst.isMember()) {
			totExp =(serviceExpense + productExpense) -((serviceExpense * DiscountRate.getServiceDiscountRate(cst.memberType)) + (productExpense * DiscountRate.getProductDiscountRate(cst.memberType)));
		}else {
			totExp = serviceExpense + productExpense;
		}
		return totExp;
	}

	public void display() {
		System.out.println(cst.toString());
		System.out.println("Service Expense : "+serviceExpense);
		System.out.println("Product Expense : "+productExpense);
		System.out.println("Total Expense : "+getTotalExpense());
		System.out.println("Date : "+date);
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer custom = new Customer();
		String ans = " ";
		
		do {
			custom.memberType = "Normal";
			System.out.print("Enter your name : ");
			custom.name = sc.next();
			System.out.print("Do you have member card : ");
			String mc = sc.next();
			if(mc.equals("yes")) {
				System.out.print("Enter your member type : ");
				custom.memberType = sc.next();
			}
			System.out.print("Enter your service expense : ");
			double service = sc.nextDouble();
			System.out.print("Enter your product expense : ");
			double product = sc.nextDouble();
			
			Shop sh = new Shop(custom, service, product,new Date());
			sh.display();
			
			System.out.print("Have Next Customer : ");
			ans = sc.next();
			
		}while(ans.equals("yes"));
		
		sc.close();
		
	}

}
