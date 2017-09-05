package problem1;

public class Prog1 {
//Problem 1
	public static void main(String[] args) {
		// 1. get a random number x in the range 1 .. 9 and compute πx.
		
		int x=RandomNumbers.getRandomInt(1,9);
		System.out.println("Randomlly generated value of x is : " + x);
		System.out.println("π the power of x is: " + Math.pow(3.14, x));
		
		//2. get a random number y in the range 3 .. 14 and compute yπ
		
		int y=RandomNumbers.getRandomInt(3,14);
		System.out.println("Randomlly generated value of y is : " + y);
		System.out.println("y the power of π is: "+ Math.pow(y, 3.14));		
		
	}

}
