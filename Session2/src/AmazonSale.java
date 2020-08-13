
public class AmazonSale {

	public static void main(String[] args) {
		// Sale of all home and kitchen products on sale days
		int HKday1 = 1452;
		int HKday2 = 1785;
		int HKday3 = 1365;
		
		// Sale of mobile devices on the sale days
		int MDday1 = 8555;
		int MDday2 = 9856;
		int MDday3 = 7461;
		// Display home and kitchen sales
		System.out.println("For Home and Kitchen");
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Sale on Day 1: \u20B9"+HKday1);
		System.out.println("Sale on Day 2: \u20B9"+HKday2);
		System.out.println("Sale on Day 3: \u20B9"+HKday3);
		
		System.out.println();
		// Display mobile device sales
		System.out.println("For Mobile Devices");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("Sale for Day 1: \u20B9"+MDday1);
		System.out.println("Sale for Day 2: \u20B9"+MDday2);
		System.out.println("Sale for Day 3: \u20B9"+MDday3);
		
		// Finding total sale
		int totalHK = HKday1 + HKday2 + HKday3;
		int totalMD = MDday1 + MDday1 + MDday1;
		
		// Display total sales
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("Total Sales for Home and kitchen is: \u20B9"+totalHK);
		System.out.println("Total Sales on Mobile devices is: \u20B9"+totalMD);
		
		// discount for all three days
		double discHK = 0.10 * totalHK;
		double discMD = 0.10 * totalMD;
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~");
		// Display discounts
		System.out.println("Discount offered");
		System.out.println("Total discount offered for home and kitchen is: \u20B9"+discHK);
		System.out.println("Total discount offered for mobile devices is: \u20B9"+discMD);
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("Where to put the stall??");
		if(totalHK > totalMD)
			System.out.println("SBI should put on a stall for Home and kitchen in order to sell redit cards");
		else
			System.out.println("SBI should put on a stall for Mobile devices in order to sell redit cards");
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~");
		if(discHK > discMD)
			System.out.println("Discount offered by SBI is more on Home and kitchen by \u20B9"+(discHK-discMD));
		else
			System.out.println("Discount offered by SBI is more on Mobile Devices by \u20B9"+(discMD-discHK));
	}

}
