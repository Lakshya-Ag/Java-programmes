public class Casting{
	public static void main(String args[]){
		int var1=99;
		// 1. Down casting --> Copying of data from a large size container to a small one
		// Here we are copying data of 32 bits container (i.e. int) to 8 bits (i.e. byte) containers
		byte var2 = (byte)var1;
		System.out.println("Variable 2 is: "+var2);
		
		// 2. Up Casting --> Copying data from small to large container
		// Compiler does it by itself
		int var3 = var2;
		System.out.println("Variable 3 is: "+var3);
		
		// 3. Type casting --> Changes the type of variable, not the size
		char var4 = (char)var3;
		System.out.println("Variable 4 is: "+var4);
	}
}