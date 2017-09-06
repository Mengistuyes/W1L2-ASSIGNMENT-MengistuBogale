package problem6;

public class RemoveDups {

	public static void main(String[] args) {
		
			String[] MyListOfAnimals={"horse", "dog", "cat", "horse","dog"};
			String[] CopyMyListOfAnimals=MyListOfAnimals;//Work on copy of the array
			int count=0;
			for(int i=0;i<MyListOfAnimals.length;i++)
			{
					for(int j=i+1;j<MyListOfAnimals.length;j++)
					{
						if(MyListOfAnimals[i]==MyListOfAnimals[j])
							{
								CopyMyListOfAnimals[i]=null;
								count++;//Count duplicates
							}
					}// End of for loop
			}//End of for loop
			
			String[] MyNewStringWithoutDups=new String[MyListOfAnimals.length-count];
			
			int index=0,comma=0;;
			for(int i=0;i<CopyMyListOfAnimals.length;i++)
			{
				if(CopyMyListOfAnimals[i]!=null)
				{
					MyNewStringWithoutDups[index]=CopyMyListOfAnimals[i];
					index++;
				}
			}
			System.out.print("[");
			for(String nonDups : MyNewStringWithoutDups)
			{
				if(comma>0)
				{
					System.out.print(",");
				}
				System.out.print(nonDups.toString());
				comma++;
			}
			System.out.print("]");
	}

}

/* OUTPUT
 * [cat,horse,dog]*/
 