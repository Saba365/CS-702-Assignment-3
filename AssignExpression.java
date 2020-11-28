import java.util.Scanner;
public class AssignExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI= 3.141;//Defining constant
		int radius=0;
		double area=1;
		Scanner forinput= new Scanner(System.in);//used to take input
        System.out.println("\n***This program finds the area of a Circle.***\n");	
		System.out.println("Enter radius:");
		 radius=forinput.nextInt();
		 area=2*PI*radius;
		 System.out.println("Area="+area);
	}

}
