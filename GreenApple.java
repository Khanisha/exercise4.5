package exercise4_5;

public class GreenApple extends Apple {
	private String color;
	 private int intake, calories;
	 
	 public GreenApple (String name, int quantity, double price, String color, int intake, int calories) {
		 super(name,quantity,price);
		 this.color=color;
		 this.intake=intake;
		 this.calories=calories;
	 }
	 
	 public String getColor() {
		 return this.color;
	 }
	 
	 public int getIntake() {
		 return this.intake;
	 }
	 
	 public int getCalories() {
		 return this.calories;
	 }
	 
	 public int Calories(int calories) {
		 return this.calories * this.intake;
	 }
	 
	 public String TotalCalories() {
			return "Total Calories of Green Apples are :" + Calories(40);
		}
	 public double totprice() {
		    return super.getprice() * super.getQuantity() ;
	}
	 
	 public String toString() {
		 return "Green Apple color is: ";
	 }
	 
	 public void summary() {
			System.out.println(toString() + getColor());
			System.out.println(TotalCalories() + "kCal");
			System.out.println(totprice());
		}
}
