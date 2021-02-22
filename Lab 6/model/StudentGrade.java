package model;

import java.io.IOException;
import java.io.Serializable;

import util.FileIO;

public class StudentGrade implements Serializable {
	public int[] grade = new int[5];
	public int student = 0;
	public int[] high = new int[5];
	public int[] low = new int[5];
	public float[] average = new float[5];

	public int[] getHigh() {
		return high;
		// Gets the high scores for each quiz.
	}

	public void setHigh(int[] high) {
		this.high = high;
		// sets the array given to the highest scores for each quiz.
	}

	public int[] getLow() {
		return low;
	}// Gets the low scores for each quiz.

	public void setLow(int[] low) {
		this.low = low;
	}// sets the array given to the lowest scores for each quiz.

	public float[] getAverage() {
		return average;
	}// Gets the average scores for each quiz.

	public void setAverage(float[] average) {
		this.average = average;
	}// sets the array given to the average scores for each quiz.

	public int[] getGrade() {
		return grade;
	}// Gets the grades of the tests.

	public void setGrade(int[] grade) {
		this.grade = grade;
	}// Sets the grades for the tests.

	public int getStudent() {
		return student;
	}// Gets the Student ID.

	public void setStudent(int x) {
		student = x;
	}// Sets the student ID to value given.

}

/*
 * First started with requirement 1, and tried to see how I can fix a null
 * pointer exception. I found that I can't pass a string with letters as an int,
 * so I made sure that the null pointer exception was caught, and I called
 * another method to make sure that if the file had any letters in it, then the
 * program would ignore it and go on to convert the numbers from the file. I
 * then decided to rename the null pointer exception to
 * CannotConvertFromStringToInt Exception. I then moved on to requirement two, I
 * decided to copy a text file from lab 5 with 45 students over to lab 6. I
 * tried making the student array, but I kept getting null pointer exceptions.
 * Then I figured out that I had to set each student grade in the array equal to
 * one instance of a student grade. I then managed to find out how to serialize
 * data into a file. At first I was doing individual integers and floats, but
 * then I realized that I had to do a student grade array. while I was able to
 * create an array, I noticed that the only values serialized in a file were the
 * values from the last student. So what I did was put the declarations of the
 * values for student grade in the serialize student grade method, and that
 * helped fix things. Part 3 was a little easy to figure out because part 2 was
 * just like it, but I had to deserialize the values. I had trouble trying to
 * print out all of the values because I couldn't get student grade to equal
 * anything after I deserialized it. So I set stg equal to the deserialized
 * method as it returns student grade. I then put the print scores and print
 * stats methods in a loop, and printed out the scores and stats for each
 * student. Setting up the abstract class and interface was easy while working
 * on the lab.
 */