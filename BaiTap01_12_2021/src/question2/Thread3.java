package question2;

public class Thread3 extends Thread {
	StorageData storageData;

	public Thread3(StorageData storageData) {
		this.storageData = storageData;
	}

	@Override
	public void run() {
		while (storageData.getCurrentLine() < storageData.getNumberLine()) {
			synchronized (storageData) {
				storageData.notifyAll();
				try {
					while (storageData.getIndex() != 3 && storageData.getCurrentLine() < storageData.getNumberLine()) {
						storageData.wait();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				int n = storageData.getN();
				if (n % 2 != 0) {
					int squareN = n * n;
					System.out.println("\nNumber " + n + " is odd");
					System.out.println("Square of number " + n + " is: " + squareN);
				}
				storageData.setIndex(1);
			}

		}
		synchronized (storageData) {
			storageData.notifyAll();
		}
	}
}
