package exercise4_5;

public class RedApple extends Apple {
	private int weight;
	private String color;
	
	public RedApple(String name, int quantity, double price, int weight, String color) {
		super(name,quantity,price);
		this.weight = weight;
		this.color = color;
		
		if (weight >= 10000) {
			double p = 0.50;
			System.out.println("Price for More than 10KG of Apples");
			System.out.println("Total Price : RM" + totprice(p));
		}
		else {
			System.out.println("Total Price : RM" + totprice());
		}
	}
	
	
	public int getWeight() {
		return this.weight;
	}

	public String getColor() {
		return this.color;
	}
		
	public int Weight() {
		return weight  * super.getQuantity() ;
	}
	public String TotalWeight() {
		return "Total weight of Red apples: " + Weight();
	}
	public double totprice() {
	    return super.getprice() * super.getQuantity() ;
}
    public double totprice(double p) {
	    return p * super.getQuantity() ;
}
	public String toString() {
		return "Red Apple color is: ";
	}
	
	public void summary() {
		System.out.println(toString() + getColor());
		System.out.println(TotalWeight() + "g");
		
}
}
