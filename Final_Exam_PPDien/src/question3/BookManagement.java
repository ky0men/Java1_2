package question3;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {
	private ArrayList<Document> doc = new ArrayList<>();

	public void addNew() {
		Scanner sc = new Scanner(System.in);
		byte choice;
		do {
			System.out.println("============ Add new Document ===============");
			System.out.println("Choose document type you need to add");
			System.out.println("1. Book");
			System.out.println("2. Magazine");
			System.out.println("3. Newspaper");
			System.out.println("4. Exit");
			choice = ExceptionChoice(sc);
			switch (choice) {
			case 1:
				Books book = new Books();
				book.addNew(sc);
				doc.add(book);
				break;
			case 2:
				Magazines magazine = new Magazines();
				magazine.addNew(sc);
				doc.add(magazine);
				break;
			case 3:
				Newspapers news = new Newspapers();
				news.addNew(sc);
				doc.add(news);
				break;
			case 4:
				break;
			default:
				System.out.println("Choice is not valid. Choice again!");
				break;
			}
		} while (choice != 4);
	}

	public void outputInfo() {
		if (doc.size() != 0) {
			System.out.println("------------- Document Information ----------------");
			for (Document document : doc) {
				if (document instanceof Books) {
					((Books) document).outputInfo();
				} else if (document instanceof Magazines) {
					((Magazines) document).outputInfo();
				} else if (document instanceof Newspapers) {
					((Newspapers) document).outputInfo();
				}
			}
		} else {
			System.out.println("Document is empty. Please input data and view later.");
		}
	}

	public void deleteDocByCode(Scanner sc) {
		System.out.println("------- Delete Document ----------");
		int code = Document.ExceptionDocumentID(sc, "Input document ID you need to delete: ");
		Document DeleteDoc = null;
		for (Document document : doc) {
			if (document.getDocumentID() == code) {
				DeleteDoc = document;
				break;
			}
		}
		if (DeleteDoc != null) {
			doc.remove(DeleteDoc);
			System.out.println("Document was deleted!");
		} else {
			System.out.println("Can not found the document have ID " + code);
		}
	}

	public void searchDocByType(Scanner sc) {
		byte choice;
		do {
			ArrayList<Document> searchedDoc = new ArrayList<>();
			System.out.println("\n------------ Seach document by type --------------");
			System.out.println("Choose the type of document you need to find");
			System.out.println("1. Search books");
			System.out.println("2. Search magazines");
			System.out.println("3. Search newspapers");
			System.out.println("4. Exit");
			choice = ExceptionChoice(sc);
			switch (choice) {
			case 1:
				for (Document document : doc) {
					if (document instanceof Books) {
						searchedDoc.add(document);
					}
				}
				if (searchedDoc.size() == 0) {
					System.out.println("Can not found books");
				} else {
					System.out.println("--------- Found Books ------------");
					for (Document document : searchedDoc) {
						((Books) document).outputInfo();
					}
				}
				break;
			case 2:
				for (Document document : doc) {
					if (document instanceof Magazines) {
						searchedDoc.add(document);
					}
				}
				if (searchedDoc.size() == 0) {
					System.out.println("Can not found magazines");
				} else {
					System.out.println("--------- Found Magazines ------------");
					for (Document document : searchedDoc) {
						((Magazines) document).outputInfo();
					}
				}
				break;
			case 3:
				for (Document document : doc) {
					if (document instanceof Newspapers) {
						searchedDoc.add(document);
					}
				}
				if (searchedDoc.size() == 0) {
					System.out.println("Can not found newspaper");
				} else {
					System.out.println("--------- Found Newspapers ------------");
					for (Document document : searchedDoc) {
						((Newspapers) document).outputInfo();
					}
				}
				break;
			case 4:
				break;
			default:
				System.out.println("Choose is not valid. Choose again!");
				break;
			}

		} while (choice != 4);
	}

	public static byte ExceptionChoice(Scanner sc) {
		while (true) {
			byte choice;
			try {
				System.out.print("Choice: ");
				choice = sc.nextByte();
				sc.nextLine();
				return choice;
			} catch (Exception e) {
				System.out.println("The choice is not valid. Choice again!");
				sc.nextLine();
			}

		}
	}

}
