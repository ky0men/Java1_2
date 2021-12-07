package question3;

import java.util.Scanner;

public class Newspapers extends Document {
	private int dateOfIssue;

	public Newspapers() {
		this.documentType = "Newspaper";
	}

	public Newspapers(int documentID, String publisherName, int issueNumber, int dateOfIssue) {
		super(documentID, publisherName, issueNumber, "Newspaper");
		this.dateOfIssue = dateOfIssue;
	}

	@Override
	public void addNew(Scanner sc) {
		super.addNew(sc);
		setDateOfIssue(ExceptionDateOfIssue(sc));
	}

	@Override
	public void outputInfo() {
		super.outputInfo();
		System.out.print(", Date of issue: " + this.getDateOfIssue());
	}

	public static int ExceptionDateOfIssue(Scanner sc) {
		while (true) {
			int dateOfIss;
			try {
				System.out.print("Input date of issue: ");
				dateOfIss = sc.nextInt();
				sc.nextLine();
				return dateOfIss;
			} catch (Exception e) {
				System.out.println("Date of issue is not valid. Input again!");
				sc.nextLine();
			}
		}
	}

	public int getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(int dateOfIssue) {
		if (dateOfIssue >= 1 && dateOfIssue <= 31) {
			this.dateOfIssue = dateOfIssue;
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Date of issue must be between 1 and 31. Input again!");
			setDateOfIssue(ExceptionDateOfIssue(sc));
		}
	}

}
