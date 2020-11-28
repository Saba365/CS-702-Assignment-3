import java.util.Scanner;  
public class MethodsValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating Scanner class object     
		Scanner forinput=new Scanner(System.in); 
		System.out.println("\n***This program is using two user define functions***");
		System.out.println("***1st Function Checks if the given number is even or odd and has no return type***");
		System.out.println("***2nd function returns the square of given number.***\n");
		System.out.print("Enter the number: ");    
		int num=forinput.nextInt();   
		findnumtype(num);//Function used to find even/odd number
		int sq=square(num);
		System.out.println("The square of "+num+" = "+sq);
	}
	
	//Defining the first function to check the type
	public static void findnumtype(int num)  
	{    
	if(num%2==0)   
	System.out.println(+num+" is an even number");   
	else   
	System.out.println(+num+" is an odd number");  
	}
	//Defining the 2nd function to calculate square
		public static int square(int num)
		{
			return num*num;
		}
}
