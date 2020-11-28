import java.util.Scanner;


public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, fact=1;
		Scanner forinput= new Scanner(System.in);
                System.out.println("\n***This program displays the factorial of a Positive integer.***\n");	
		System.out.println("Enter a Positive integer:");
		 num=forinput.nextInt();
		 for(int i=1;i<=num;i++)
		    {  
			fact=i*fact;
	        }
		 System.out.println("Factorial of "+num+" is:"+fact);
	}

}
