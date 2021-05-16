package exercise4_5;

public abstract class Fruit {

		private String name;
	  
	    
		public Fruit(String name) {
			this.name = name;
			
			
			System.out.println(name + " constructor is invoked");
		}
		
	public abstract double totprice(); // define method as abstract, heading with no body
}

