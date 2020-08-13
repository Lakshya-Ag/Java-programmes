public class Operators {

	public static void main(String[] args) {
		
		// Controller:
		// 1. Mathematical Computations
		// Operators
		
		// 1. Arithmetic Operators like +, -, *, /, %
		
		int data = 36;
		int buckets = 13;
		
		int Code = data % buckets;			// will return the remainder of the calculation
		System.out.println("Code for data is: "+Code);
		
		// 2. Assignement Operators like +=, -=, *=, /=, %=
		
		Code += 2;		// it means hashCode = hashCode + 2
		
		System.out.println("Code now is: "+Code);
		
		Code %= 5;

		System.out.println("Code finally is: "+Code); // 2
		
		// 3. Increment and Decrement like ++, --
		
		Code++; 		// increment value by 1 aka Postfix
		++Code; 		// increment value by 1 aka Prefix
		++Code;
		
		--Code;
		Code--;
		
		System.out.println("hasCode after increment and decrement is: "+Code);
		
		int result = ++Code;
		System.out.println("result is: "+result+" and Code is: "+Code);
		
		int i = 1;
		int j = ++i + ++i + i++ + i--;
		System.out.println("i is: "+i+" and j is: "+j); 
		
		// 4. Conditional Operators like >, <, >=, <=, ==, !=
		
		int amount = 300;
		int Fare = 500;
		
		System.out.println("Amount enough to book a Cab? "+(amount >= Fare));
		
		// 5. Logical Operators like &&, ||, !
		
		int promoCode = 101;
		int cartAmount = 570;
		
		System.out.println("Can i get Promotional Off: "+(promoCode == 101 && cartAmount >= 600));
		System.out.println("Can i get Promotional Off: "+(promoCode == 101 || cartAmount >= 600));
		
		// 6. BitWise Operators like &, |, ^
		
		int num1 = 10;				//  1 0 1 0
		int num2 = 12;				//  1 1 0 0
		
		int res1 = num1 & num2;  //  1 0 0 0		|	 8
		int res2 = num1 | num2;  //  1 1 1 0 	|	 14
		int res3 = num1 ^ num2;  //  0 1 1 0 	|	 6
		
		System.out.println("result 1 is: "+res1);
		System.out.println("result 2 is: "+res2);
		System.out.println("result 3 is: "+res3);
		
		// 7. Shift Operators like >>, <<, >>>
		// Works on the binary format
		
		int num3 = 10; 				// 1 0 1 0
		int num4 = num3 >> 2;		// _ _ 1 0 -> 0 0 1 0	|	divide the number by 2 power shift
		System.out.println("number 4 is: "+num4);
		
		int num5 = num3 << 2;		// 1 0 1 0 _ _ -> 1 0 1 0 0 0	|	multiple number by 2 power shift
		System.out.println("number 5 is: "+num5);
		
		// 2. Misc Operators : as in when we advance
		
		int tResult = (-10 > 2) ? 1 : 0;
		System.out.println("tResult is "+tResult);
		
		
		
		// Assignment: Explore shift operators on negative numbers
		
		num5 = -10;							// 1 0 1 0 1
		int num6 = num5 >> 2;				// _ _ 1 0 1 -> 1 0 1 0 1
		System.out.println("Number 5 in binary is: "+Integer.toBinaryString(num5));
		System.out.println("Number 6 in binary is: "+Integer.toBinaryString(num6));
		System.out.println("Number 6 is: "+num6);
	}

}