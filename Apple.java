package exercise4_5;

public class Apple extends Fruit {

	private int quantity; 
	private double price;

		
		public Apple (String name, int quantity,double price) {
			super(name);
			this.quantity = quantity;
			this.price = price;
			
		
			if (this.quantity <= 10) {
				totprice();
				
				System.out.println("Price Less than 10 Apples");
				System.out.println("Total Price : RM" + totprice());
				
			}
			
			else if((this.quantity > 10) && (this.quantity <= 20)) {
				
				double p = 0.80;
				totprice(p);
				System.out.println("Price More than 10 Apples");
				System.out.println("Total Price : RM" + totprice(p));
			}
			
			else {
				
			double pp = 0.70;
			double dd;
				 if (name.equals("Apple")) {
					 Discount apple = new AppleDiscount();
					 System.out.println("Total Discount :" + apple.DiscountRate());
				 dd = apple.DiscountRate();				 
				 }
				 
				 else if (name.equals("Honey Crisp")) {
					 Discount rapple = new RedAppleDiscount();
					 System.out.println("Total Discount :" + rapple.DiscountRate());
				 dd = rapple.DiscountRate();
				 }
				 
				 else if (name.equals("Crispin")) {
					 Discount gapple = new GreenAppleDiscount();
					 System.out.println("Total Discount :" + gapple.DiscountRate());
				 dd = gapple.DiscountRate();
				 }
				 
				 totprice(pp,dd);
				System.out.println("Price More than 20 Apples, You will receive discount price");
				System.out.println("Total Price : RM" + totprice(pp,dd));
			}
		}
		
		
		
		public int getQuantity() {
			return this.quantity;
		}
		public double getprice() {
			return this.price;
		}
			
		public double totprice() {
			return this.price * this.quantity ;
		}
		public double totprice(double p) {
			return p * this.quantity ;
		}
		public double totprice(double pp, double dd) {
			return pp * this.quantity * dd ;
		}
		public String toString() {
			return "Total Quantity sold : ";
		}

		public void summary() {
			System.out.println(toString() + getQuantity());
		}
}
