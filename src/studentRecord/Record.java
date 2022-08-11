package studentRecord;
import java.util.*;
public class Record {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sName;
		int sRollNo;
		float subject1Marks;
		float subject2Marks;
		float subject3Marks;
		float subject4Marks;
		float totalMarks;
		float totalAvg;
		boolean eCatch;
		
		Scanner scr1 = new Scanner(System.in);
do {
	try  {
		eCatch = false;
		System.out.println("How many student records are to be entered ? ");
		int n = scr1.nextInt();
		
		 
		int i=1;
		do {
			
		try {	
			eCatch = false;
		Scanner scr = new Scanner(System.in);

		System.out.println("Enter Name of Student"+(i)+":");
		sName = scr.nextLine();
		System.out.println("Enter Roll Number:");
		sRollNo = scr.nextInt();
		System.out.println("Enter Subject 1 Marks :");
		subject1Marks = scr.nextFloat();
		System.out.println("Enter Subject 2 Marks :");
		subject2Marks = scr.nextFloat();
		System.out.println("Enter Subject 3 Marks :");
		subject3Marks = scr.nextFloat();
		System.out.println("Enter Subject 4 Marks :");
		subject4Marks = scr.nextFloat();
		
		totalMarks = subject1Marks + subject2Marks +subject3Marks +subject4Marks;
		
		totalAvg = totalMarks/4;
	
		

		System.out.println("Student Name : "+ sName);
		System.out.println("Student Roll Number : "+ sRollNo);
		System.out.println("Subject 1 Marks : " + subject1Marks);
		System.out.println("Subject 2 Marks : " + subject2Marks);
		System.out.println("Total Marks of "+sName+" :"+ totalMarks);
		System.out.println("Average Total for "+sName+" :"+ totalAvg);
		i++;
		}
		
		catch(InputMismatchException e)
		{
			eCatch = true;
			System.out.println(" Enter valid data:");
		}
		}while(eCatch == true & i<n );
		
		
		System.out.println("End of data");
	}
	
	catch(InputMismatchException e) {
		eCatch = true;
		scr1.next();
		System.out.println("Please enter valid Integer : ");
	}
	}while(eCatch == true);
	
	}
	
	}

