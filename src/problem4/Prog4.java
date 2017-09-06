package problem4;
import java.util.*;

public class Prog4 {

	public static void main(String[] args) {
		
		String MyStringToBeChanged="";
		String MyReversedWord="";
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please Enter any word\n");
		MyStringToBeChanged=input.nextLine();
		  System.out.println("You word is:- " + MyStringToBeChanged);
		for(int i=MyStringToBeChanged.length()-1;i>=0;i--)
		{
			MyReversedWord+=MyStringToBeChanged.charAt(i);
		}
        System.out.println("The reversed word is:- " + MyReversedWord);
        input.close();
       
	}

}
/* OUTPUT

Please Enter any word
Mengistu
You word is:- Mengistu
The reversed word is:- utsigneM

*/
