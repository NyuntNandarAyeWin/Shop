package Shop;

public class DiscountRate extends Customer{
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
		if(super.isMember()) {
			if(type.equals("Premium")) {
				serviceExp = serviceDiscountPremium;
			}else if(type.equals("Gold")) {
				serviceExp = serviceDiscountGold;
			}else{
				serviceExp = serviceDiscountSilver;
			}
		}	
		return serviceExp;
	}
	
	double getProductDiscountRate(String type) {
		super.memberType = type;
		double productExp = 0.0;
		if(super.isMember()) {
			if(type.equals("Premium")) {
				productExp = serviceDiscountPremium;
			}else if(type.equals("Gold")) {
				productExp = serviceDiscountGold;
			}else{
				productExp = serviceDiscountSilver;
			}
		}
			
		return productExp;
	}
}
