package problem2;

public class Prog2 {

	public static void main(String[] args) {

	//1. the sum of the floats as an integer, obtained by casting the sum to type int	
		float number1=1.27f;
		float number2=3.881f;
		float number3=9.6f;

		int sum2= (int)(number1 +number2 +number3);
		System.out.println("The Sum obtained by casting is: " + sum2);
		
	/*2. the sum of the floats as an integer, obtained by rounding the sum to the nearest integer,
		using the Math.round function*/
		
		int sum4= (int)Math.round(number1 +number2 +number3);
		System.out.println("The Sum obtained by rounding is: " + sum4);
			
	/*	
	    what if we cast them before adding them 
	    int sum1= (int)number1 + (int)number2 + (int)number3;
		System.out.println(sum1);//will output 13 */
		
	/*  what if we round and cast them before adding them 
	  	int sum3= (int)Math.round(number1) + (int)Math.round(number2) + (int)Math.round(number3);
		System.out.println(sum3);// will output 15 */
		
	}

}
/* OUTPUT
 * 
The Sum obtained by casting is: 14
The Sum obtained by rounding is: 15

*/
