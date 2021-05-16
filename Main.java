package exercise4_5;

public class Main {

	public static void main(String[] args) {
			System.out.println("-APPLE-");
			Apple objapple = new Apple("Apple", 10, 0.90);
			objapple.summary();
			System.out.println();
			
			System.out.println("-REDAPPLE-");
			RedApple objredapple = new RedApple("Honey Crisp",2,0.95,100000,"Bright Red");
			objredapple.summary();
			System.out.println();
			
			System.out.println("-GREENAPPLE-");
			GreenApple objgreenapple = new GreenApple("Crispin",3,0.90,"Light Green",10,40);
			objgreenapple.summary();
			System.out.println();
			
		
	}

}
