package exercise4_5;

public class AppleDiscount implements Discount {
	public float DiscountRate() {
	return 0.25f;
	}

	public class RedAppleDiscount implements Discount {
		public float DiscountRate() {
			return 0.30f;
		}
		
	public class GreenAppleDiscount implements Discount {
		public float DiscountRate() {
			return 0.35f;
		}
	}
	}
}
