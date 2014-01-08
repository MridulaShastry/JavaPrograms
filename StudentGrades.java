// Create a program that uses a multidimensional array to store student
// grades. The first dimension should be a number for each student, and
// the second dimension should be for each student’s grades. Display the
// average of all the grades earned by each student and an overall aver-
// age for every student.

import java.util.*;

class StudentGrades {

	public static void main(String[] args){

		int[][] gradesStudent = new int[10][3];
		int sumPerStudent = 0;
		int avgPerStudent = 0;
		int overAllSum = 0;
		int overAllAverage = 0;

		for (int i = 0; i < gradesStudent.length; i++) {

			for (int j = 0; j < gradesStudent[i].length; j++) {

				gradesStudent[i][j] = i + j;
				System.out.println(gradesStudent[i][j]);
				sumPerStudent += gradesStudent[i][j];
			}

			overAllSum += sumPerStudent;
			avgPerStudent = sumPerStudent/(gradesStudent[i].length);
			System.out.println("Average for student " + i + ": " + avgPerStudent);
			sumPerStudent = 0;
		}

		overAllAverage = overAllSum/(gradesStudent.length);
		System.out.println("OverAll Average " + overAllAverage + ".");

	}

}