package problem5;

import problem1.RandomNumbers;

public class Prog5 {

	public static void main(String[] args) {
		
		int x=0;
		
		int n=4;// It is dynamic
		System.out.println(" There are " + n + " questions\n");
		int[][] MyMultiArray=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i%2!=0)
				{
					System.out.print("+");
				}
				else
				{
					System.out.print(" ");
				}
				MyMultiArray[i][j]=RandomNumbers.getRandomInt(1,99);
				System.out.print(MyMultiArray[i][j] + "\t");			
				
			}
			if(i%2!=0)
				{
				System.out.println("\n");
				for(int j=0;j<n;j++)
				{
					System.out.print("____\t");
				}
					System.out.println("\n\n\n");
				}
			System.out.print("\n");
			
		}

	}

}
/* OUTPUT
 * 
 * There are 4 questions


70	     2	     30		 29	
+35	    +33	    +86		+75	

____	____	____	____	




22	 	40		 20		 8	
+72		+39		+69		+16	

____	____	____	____	



*/