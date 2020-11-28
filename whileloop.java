import java.util.Scanner;
public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner forinput= new Scanner(System.in);
		int start,end,num;
		System.out.println("\n***This program displays the Even Numbers in the given range.***\n");
		System.out.println("Enter starting number:");
		start=forinput.nextInt();
		System.out.println("Enter ending number:");
		end=forinput.nextInt();
		num =start;
		while(num<=end)
		{
			if(num%2==0)
			System.out.println(num);
			num++;
		}
	}

}
