import java.util.Scanner;
public class IfandElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner forinput= new Scanner(System.in);
		int marks=0;
        System.out.println("\n***This program displays the Grade of student.***\n");	
        System.out.println("Enter your marks:");
        marks=forinput.nextInt();
        if(marks>=90)
         System.out.println("Your grade is A.");
        else if(marks>=80)
            System.out.println("Your grade is B.");
        else if(marks>=70)
            System.out.println("Your grade is C.");
        else if(marks>=60)
            System.out.println("Your grade is D.");
        else
            System.out.println("Your grade is F.");
        
	}

}
