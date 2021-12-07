package question3;

import java.util.Scanner;

public class Document {
	private int documentID;
	private String publisherName;
	private int number;
	protected String documentType;

	public Document() {

	}

	public Document(int documentID, String publisherName, int number, String documentType) {
		this.documentID = documentID;
		this.publisherName = publisherName;
		this.number = number;
		this.documentType = documentType;
	}

	public void addNew(Scanner sc) {
		this.setDocumentID(ExceptionDocumentID(sc, "Input the document ID: "));
		System.out.print("Input publisher name: ");
		this.publisherName = sc.nextLine();
		setNumber(ExceptionNumber(sc));

	}

	public void outputInfo() {
		System.out.print("\nID: " + this.getDocumentID() + ", Publisher: " + this.getPublisherName()
				+ ", Issue number: " + this.getNumber() + ", Document type: " + this.getDocumentType());
	}

	public static int ExceptionDocumentID(Scanner sc, String mess) {
		while (true) {
			int id;
			try {
				System.out.print(mess);
				id = sc.nextInt();
				sc.nextLine();
				return id;
			} catch (Exception e) {
				System.out.println("Document ID in not valid. Input again!");
				sc.nextLine();
			}
		}
	}

	public static int ExceptionNumber(Scanner sc) {
		while (true) {
			int num;
			try {
				System.out.print("Input number: ");
				num = sc.nextInt();
				sc.nextLine();
				return num;
			} catch (Exception e) {
				System.out.println("Number must be integer. Input again!");
				sc.nextLine();
			}
		}
	}

	public int getDocumentID() {
		return documentID;
	}

	public void setDocumentID(int documentID) {
		if (documentID > 0) {
			this.documentID = documentID;
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Document ID must a positive number! Input again.");
			setDocumentID(ExceptionDocumentID(sc, "Input the document ID: "));
		}
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if (number > 0) {
			this.number = number;
		} else {
			System.out.println("The number must a positive! Input again.");
			Scanner sc = new Scanner(System.in);
			setNumber(ExceptionNumber(sc));
		}
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

}
