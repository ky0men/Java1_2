package bt24_11;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
	int id;
	String name;
	double avgScore;

	Student(int id, String name, double avgScore) {
		this.id = id;
		this.name = name;
		this.avgScore = avgScore;
	}

	@Override
	public String toString() {
		return "Student ID:" + id + ", Student name: " + name + ", Average Score: " + avgScore + "\n";
	}
}

public class Question6 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> stdList = new ArrayList<>();
		File studentsFile = new File("Students.txt");
		File scoreFile = new File("MediumScore.txt");
		FileOutputStream fileOps = null;
		BufferedOutputStream outputStream = null;
		inputStudents(stdList, sc);
		try {
			fileOps = new FileOutputStream(studentsFile);
			outputStream = new BufferedOutputStream(fileOps);
			for (Student student : stdList) {
				outputStream.write(student.toString().getBytes());
			}
			System.out.println("\nWrite successfully! Please check file Students.txt and MediumScore.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fileOps != null) {
				outputStream.close();
			}
		}
		FileReader fileReader = null;
		BufferedReader buffRead = null;
		try {
			fileReader = new FileReader(studentsFile);
			buffRead = new BufferedReader(fileReader);
			String line = null;
			Double avgScore = (double) 0;
			ArrayList<Double> listScore = new ArrayList<>();
			while ((line = buffRead.readLine()) != null) {
//				System.out.println(line);
//				System.out.println(line.indexOf("Average Score: "));
				avgScore = Double.parseDouble(line.substring(line.indexOf("Average Score: ") + 15));
//				System.out.println(avgScore);
				listScore.add(avgScore);
			}
			fileReader = new FileReader(studentsFile);
			buffRead = new BufferedReader(fileReader);
//			System.out.println(listScore.toString());
			fileOps = new FileOutputStream(scoreFile);
			outputStream = new BufferedOutputStream(fileOps);
			while ((line = buffRead.readLine()) != null) {
				avgScore = Double.parseDouble(line.substring(line.indexOf("Average Score: ") + 15));
				if (avgScore == highestScore(listScore)) {
					outputStream.write(line.getBytes());
					outputStream.write(("\n").getBytes());
//					System.out.println("--------------");
//					System.out.println(line);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fileReader != null) {
				buffRead.close();
			}
			if (fileReader != null) {
				outputStream.close();
			}
		}
	}

	public static void inputStudents(ArrayList<Student> stdList, Scanner sc) {
		int n;
		System.out.print("Input number of students you want to save. ");
		n = ExceptionInteger(sc, "Number of students: ");
		Student std = null;
		for (int i = 0; i < n; i++) {
			System.out.println("Input information of student " + (i + 1));
			int id = ExceptionInteger(sc, "ID: ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			double score = ExceptionScore(sc);
			std = new Student(id, name, score);
			stdList.add(std);
		}
	}

	public static double highestScore(ArrayList<Double> avg) {
		double max = avg.get(0);
		for (int i = 0; i < avg.size(); i++) {
			if (max < avg.get(i)) {
				max = avg.get(i);
			}
		}
		return max;
	}

	public static int ExceptionInteger(Scanner sc, String mess) {
		int id;
		while (true) {
			try {
				System.out.print(mess);
				id = sc.nextInt();
				sc.nextLine();
				return id;
			} catch (InputMismatchException e) {
				System.out.println(mess + " must a integer number! Input again.");
				sc.nextLine();
			}
		}
	}

	public static double ExceptionScore(Scanner sc) {
		double avg;
		while (true) {
			try {
				System.out.print("Average Score: ");
				avg = sc.nextDouble();
				sc.nextLine();
				return avg;
			} catch (InputMismatchException e) {
				System.out.println("Average score must a number! Input again.");
				sc.nextLine();
			}
		}
	}
}