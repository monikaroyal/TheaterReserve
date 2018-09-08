import java.util.Scanner;
public class Tckts {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Insert no of tcks to book");
		System.out.println("Cost :158");
		int n=s.nextInt();
		System.out.println("Select your Seats");
		int[][] a=new int[5][9];
		for(int i=0;i<4;i++)
			{for(int j=0;j<4;j++)
				System.out.print(a[i][j]+" ");
			System.out.print(".."+" ");
			for(int j=4;j<8;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
			}
		System.out.println("......SCREEN......");
		System.out.println();
		for(int i=0;i<n;i++)
			{
			if(i==0)
				System.out.println("Enter seat no's");
			else
				System.out.println("Next seat:");
			System.out.println("Enter row no:");
			int sn=s.nextInt();
			System.out.println("Enter column no:");
			int sj=s.nextInt();
				if(a[sn-1][sj-1]==0)
					{
					a[sn-1][sj-1]=1;
					for(int y=0;y<4;y++)
					{for(int j=0;j<4;j++)
						System.out.print(a[y][j]+" ");
					System.out.print(".."+" ");
					for(int j=4;j<8;j++)
						System.out.print(a[y][j]+" ");
					System.out.println();
					}
				System.out.println("......SCREEN......");
				System.out.println();
					}
				else
					{	System.out.println("Seat Not Available");i--;System.out.println("Enter seat Again");}
			}
		int amount=158;
		amount=amount*n;
		System.out.println("Total Amount :"+amount);
		int loop=0;
		while(loop==0)
		{
			System.out.println("Enter Money to Book Tcks");
			int m=s.nextInt();
		if(m>=amount) {
			m=m-amount;
			System.out.println("Seats Booked No's:");loop=1;
		}
		else
			System.out.println("Transaction Failed");
		System.out.println("Amount Returned:"+m);
		if(loop==0)
			System.out.println("Try Again");
		}
		System.out.println("Tckts Booked Enjoyy");
	}

}
