package allprograms.numberprograms;
import java.util.Scanner;
class Amstrong 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enetr Minim range of Number :" );
		int a=scn.nextInt();
		System.out.println("Enetr Maxim range of Number :" );
		int b=scn.nextInt();


		int max=0;
        int min=0;

		for (int i=a;i<=b ;i++ )
		{
			int num1=i;
			int num2=num1;
			int sum=0,rem=0;
			int count=0;
            


			while (num1!=0)
			{
				count++;
				num1/=10;
			}


			while (num2!=0)
			{
				rem=num2%10;
				sum=sum+(int)Math.pow(rem,count);
				num2/=10;
			}

			if (sum==i)
			{
				System.out.println(sum);
				if(sum>max) max=sum;
			}
		}
		System.out.println();
		System.out.println(max);
		System.out.println(min);
	}
}
