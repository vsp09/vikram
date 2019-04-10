import java.util.Scanner;

class Q2
{
	public static void main(String args[])
	{
	
	int a;
	
	Scanner vsp=new Scanner(System.in);
	System.out.print("Enter percentage: ");
	a=vsp.nextInt();

	if(a<35)
		{
			if(a>60)
			   System.out.print("Grade A");
			System.out.print("Grade B");
		}
		System.out.print("Grade C");
	}
	System.out.print("Done...! ");
}
