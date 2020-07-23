package Shop;

public class Customer {

	String name;
	boolean member = false;
	String memberType;
	
	String p = "Premium";
	String g = "Gold";
	String s = "Silver";
	
	public Customer() {
		
	}
	public Customer(String name, String memberType) {
		this.name = name;
		this.memberType = memberType;
	}
	
	public boolean isMember() {
		if(memberType.equals(p)) {
			member = true;
		}else if(memberType.equals(g)) {
			member = true;
		}else if(memberType.equals(s)) {
			member = true;
		}
		return member;
	}
	
	public String toString() {
		String str;
			str = "Customer Name : "+name+"\nMember Type : "+memberType;
		return str;
	}
}
