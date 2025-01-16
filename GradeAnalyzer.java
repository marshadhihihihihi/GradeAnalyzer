import java.util.Scanner;
public class GradeAnalyzer {
	
	public static double calculateAverage (double [] marks) {

		double summationofMarks = 0;

		for (int i = 0; i < marks.length; i++) {

			summationofMarks += marks[i];
	
		}
		
		double average = summationofMarks / marks.length ;
		
		return  average;

	}


	public static double calculateHighestMark (double [] marks) {

		double highestMark = marks [0];

		for (double mark : marks) {

			if (mark > highestMark) {

				highestMark = mark;

			}
		}
		
		return  highestMark;
	}

	public static double calculateLowestMark (double [] marks) {

		double LowestMark = marks [0];

		for (double mark : marks) {

			if (mark < LowestMark) {

				LowestMark = mark;

			}
		}

		return LowestMark;
	}
	
	public static char[] calculateGrade (double [] marks) {
			
		char [] grades = new char [marks.length];
		
		for (int i = 0; i < marks.length; i++) {

			if (marks[i] >= 90 && marks[i] <= 100) {

				grades[i] = 'A';
		
			} else if (marks[i] >= 80 && marks[i]  < 90) {

				grades[i] = 'B';

			}  else if (marks[i] >= 70 && marks[i]  < 80) {

				grades[i] = 'C';

			} else if (marks[i] >= 60 && marks[i]  < 79) {

				grades[i] = 'D';

			} else {
				
				grades[i] = 'F';
	
			}

		}

			return grades;

	}
	
	//method to calculate grade distribution (A,B,C,D,F)

	public static int[] calculateGradeDistribution (char [] grades) {

		int [] scores = new int [5];// to store quantity of distribution
		
		for (int j = 0; j < grades.length; j++) {
			
			
			if (grades[j] == 'A') {

				scores[0]++;
		
			} else if (grades[j] == 'B') {

				scores[1]++;

			}  else if (grades[j] == 'C') {

				scores[2]++;

			} else if (grades[j] == 'D') {

				scores[3]++;

			} else {
				
				scores[4]++;
	
			}

		}

		return scores;
			
	}

public static void main (String...args) {

	Scanner sc = new Scanner (System.in);
	double [] marks = new double [10];

	System.out.println ("\nHello! welcome to Grade Analyzer website.");
	
	for (int i = 0; i < marks.length; i++) {

		System.out.print ("Enter your marks for student " +(i + 1)+" : " );
		double input = sc.nextDouble ();
		marks [i] = input;

	}
	

	double average = calculateAverage (marks);
	double HighestMark = calculateHighestMark (marks);
	double LowestMark = calculateLowestMark (marks);
	char[] grades = calculateGrade (marks);
	int[] scores = calculateGradeDistribution (grades) ;
	 
	System.out.println ("System analyzed result");
	System.out.println ("----------------------");
	
	System.out.println ("Average Mark is : "+average);
	System.out.println ("Highest Mark is : "+HighestMark);
	System.out.println ("Lowest mark is : "+LowestMark);
	
	System.out.println ("\nGrade Distribution");
	System.out.println ("A : " +scores[0]);
	System.out.println ("B : " +scores[1]);
	System.out.println ("C : " +scores[2]);
	System.out.println ("D : " +scores[3]);
	System.out.println ("F : " +scores[4]);

 }
}