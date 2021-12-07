package question3;

import java.util.Scanner;

public class Magazines extends Document {
	private int issueNumber;
	private int issueMonth;

	public Magazines() {
		this.documentType = "Magazines";
	}

	public Magazines(int documentID, String publisherName, int number, int issueNumber, int issueMonth) {
		super(documentID, publisherName, number, "Magazines");
		this.issueNumber = issueNumber;
		this.issueMonth = issueMonth;
	}

	@Override
	public void addNew(Scanner sc) {
		super.addNew(sc);
		setIssueNumber(ExceptionIssueNumber(sc));
		setIssueMonth(ExceptionIssueMonth(sc));
	}

	@Override
	public void outputInfo() {
		super.outputInfo();
		System.out.print(", Issue number: " + this.getIssueNumber() + ", Issue month: " + this.getIssueMonth());
	}

	public static int ExceptionIssueNumber(Scanner sc) {
		while (true) {
			int issNum;
			try {
				System.out.print("Input issue number: ");
				issNum = sc.nextInt();
				sc.nextLine();
				return issNum;
			} catch (Exception e) {
				System.out.println("Issue number is not valid. Input again!");
				sc.nextLine();
			}
		}
	}

	public static int ExceptionIssueMonth(Scanner sc) {
		while (true) {
			int issueMonth;
			try {
				System.out.print("Input issue month: ");
				issueMonth = sc.nextInt();
				sc.nextLine();
				return issueMonth;
			} catch (Exception e) {
				System.out.println("Issue month is not valid. Input again!");
				sc.nextLine();
			}
		}

	}

	public int getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(int issueNumber) {
		if (issueNumber > 0) {
			this.issueNumber = issueNumber;
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Issue number must a positive number! Input again.");
			setIssueNumber(ExceptionIssueNumber(sc));
		}
	}

	public int getIssueMonth() {
		return issueMonth;
	}

	public void setIssueMonth(int issueMonth) {
		if (issueMonth >= 1 && issueMonth <= 12) {
			this.issueMonth = issueMonth;
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Issue month must be between 1 - 12. Input again!");
			setIssueMonth(ExceptionIssueMonth(sc));
		}
	}

}
