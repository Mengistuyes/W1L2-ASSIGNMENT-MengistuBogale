package problem7;

public class Prog7 {

	public static void main(String[] args) {
		
		int totalWordCount=0;
		//a. Print the length of each string input.
		System.out.println("a. Print the length of each string input.\n");
		for(String i:args)
		{
			totalWordCount++;//Counting total length of all words
			System.out.println("The word is " + i + " its length " + i.length());
		}
		System.out.println("\n");
		System.out.println("Total number of words " + totalWordCount);
		System.out.println("_________________________________________\n ");
		//b. Count the string inputs starts with ‘A’.
		int count=0,countAa=0;
		for(String i:args)
		{
			//If it is case sensitive
			if(i.charAt(0)=='A')
					{
				 		count++;
					}
			
			//If it is not case sensitive
			if(Character.toLowerCase(i.charAt(0))==Character.toLowerCase('A'))
					{
						countAa++;
					}
		}
		System.out.println("b. Count the string inputs starts with ‘A’.\n");
		System.out.println("Total number of words that start with A character is: " + count);
		System.out.println("Total number of words that start with a and A character is: " + countAa); //Note this output not required (not case sensitive) 
	}

}

/*
 a. Print the length of each string input.

The word is DO its length 2
The word is LESS its length 4
The word is AND its length 3
The word is ACCOMPLISH its length 10
The word is MORE. its length 5
The word is Like its length 4
The word is that its length 4
The word is one its length 3
The word is action its length 6
The word is which its length 5
The word is is its length 2
The word is contacting its length 10
The word is transcendental its length 14
The word is consciousness its length 13
The word is nourishes its length 9
The word is all its length 3
The word is aspects its length 7
The word is of its length 2
The word is life. its length 5


Total number of words 19
_________________________________________
 
b. Count the string inputs starts with ‘A’.

Total number of words that start with A character is: 2
Total number of words that start with a and A character is: 5
 * */
