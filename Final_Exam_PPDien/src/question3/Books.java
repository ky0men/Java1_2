package question3;

import java.util.Scanner;

public class Books extends Document {
	private String authorName;
	private int pageNumber;

	public Books() {
		this.documentType = "Book";
	}

	public Books(int documentID, String publisherName, int issueNumber, String authorName, int pageNumber) {
		super(documentID, publisherName, issueNumber, "Book");
		this.authorName = authorName;
		this.pageNumber = pageNumber;
	}

	@Override
	public void addNew(Scanner sc) {
		super.addNew(sc);
		System.out.print("Input author name: ");
		this.authorName = sc.nextLine();
		setPageNumber(ExceptionPageNumber(sc));
	}

	@Override
	public void outputInfo() {
		super.outputInfo();
		System.out.print(", Author name: " + this.getAuthorName() + ", Page number: " + this.getPageNumber());
	}

	public static int ExceptionPageNumber(Scanner sc) {
		while (true) {
			int pageNum;
			try {
				System.out.print("Input the page number: ");
				pageNum = sc.nextInt();
				sc.nextLine();
				return pageNum;
			} catch (Exception e) {
				System.out.println("The page number is not valid. Input again!");
				sc.nextLine();
			}
		}
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		if (pageNumber > 0) {
			this.pageNumber = pageNumber;
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Page number must positive number! Input again.");
			setPageNumber(ExceptionPageNumber(sc));
		}
	}

}
