import java.util.Scanner;
class Problem_2
{
	
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the range");
	int n=scan.nextInt();
	int count=0;

	for(int i=0;i<100;i++)
		{
		if(count<n)
			{
			if(i%2!=0)
				{
				++count;
				System.out.println(i);
				}
			}
		}

	}
}