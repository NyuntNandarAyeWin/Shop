package Shop;

public class DiscountRate{
	
	static double serviceDiscountPremium = 0.2;
	static double serviceDiscountGold = 0.15;
	static double serviceDiscountSilver = 0.1;
	
	static double productDiscountPremium = 0.1;
	static double productDiscountGold = 0.1;
	static double productDiscountSilver = 0.1;
	
	static double getServiceDiscountRate(String type){
		double serviceExp = 0.0;
			if(type.equals("Premium")) {
				serviceExp = serviceDiscountPremium;
			}else if(type.equals("Gold")) {
				serviceExp = serviceDiscountGold;
			}else if(type.equals("Premium")){
				serviceExp = serviceDiscountSilver;
			}
		return serviceExp;
	}
	
	static double getProductDiscountRate(String type) {
		double productExp = 0.0;
			if(type.equals("Premium")) {
				productExp = serviceDiscountPremium;
			}else if(type.equals("Gold")) {
				productExp = serviceDiscountGold;
			}else  if(type.equals("Premium")){
				productExp = serviceDiscountSilver;
			}
		return productExp;
	}
}
