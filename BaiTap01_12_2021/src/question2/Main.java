package question2;

public class Main {
	public static void main(String[] args) {
		StorageData storageData = new StorageData();
		Thread1 t1 = new Thread1(storageData);
		Thread2 t2 = new Thread2(storageData);
		Thread3 t3 = new Thread3(storageData);
		t1.start();
		t2.start();
		t3.start();
	}
}
