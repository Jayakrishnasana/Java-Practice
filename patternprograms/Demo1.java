package allprograms.patternprograms;


public class Demo1 {

	public static void main(String[] args) {
		
		int n=9;
		int space=n-1;
		int star=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
				System.out.print(" ");
			for(int j=1;j<=star;j++)
			{
				if(j==1||j==star)
					System.out.print("x");
				else
					System.out.print(". ");
			}
			if(i<=n/2)
			{
				space-=2;
				star+=2;
			}
			else
			{
				space+=2;
				star-=2;
			}
			System.out.println();
		}
	}
}


/*
 
       x
      x. x
    x. . . x
  x. . . . . x
x. . . . . . . x
  x. . . . . x
    x. . . x
      x. x
        x

 
 
 */
