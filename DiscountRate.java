package Shop;

public class DiscountRate extends Customer{
	
	String p = "Premium";
	String g = "Gold";
	String s = "Silver";
	Customer cs = new Customer();
	
	static double serviceDiscountPremium = 0.2;
	static double serviceDiscountGold = 0.15;
	static double serviceDiscountSilver = 0.1;
	
	static double productDiscountPremium = 0.1;
	static double productDiscountGold = 0.1;
	static double productDiscountSilver = 0.1;
	
	double getServiceDiscountRate(String type){
		super.memberType = type;
		double serviceExp = 0.0;
			if(type.equals(p)) {
				serviceExp = serviceDiscountPremium;
			}else if(type.equals(g)) {
				serviceExp = serviceDiscountGold;
			}else if(type.equals(s)){
				serviceExp = serviceDiscountSilver;
			}
		return serviceExp;
	}
	
	double getProductDiscountRate(String type) {
		super.memberType = type;
		double productExp = 0.0;
			if(type.equals(p)) {
				productExp = serviceDiscountPremium;
			}else if(type.equals(g)) {
				productExp = serviceDiscountGold;
			}else if(type.equals(s)){
				productExp = serviceDiscountSilver;
			}
		return productExp;
	}
}
