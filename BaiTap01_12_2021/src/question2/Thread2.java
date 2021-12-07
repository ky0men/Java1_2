package question2;

import java.util.ArrayList;
import java.util.Arrays;

public class Thread2 extends Thread {
	StorageData storageData;

	public Thread2(StorageData storageData) {
		this.storageData = storageData;
	}

	@Override
	public void run() {
		while (storageData.getCurrentLine() < storageData.getNumberLine()) {
			synchronized (storageData) {
				storageData.notifyAll();
				try {
					while (storageData.getIndex() != 2 && storageData.getCurrentLine() < storageData.getNumberLine()) {
						storageData.wait();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				int n = storageData.getN();
				if (n % 2 == 0) {
					ArrayList<Integer> divisorList = new ArrayList<>();
					for (int i = 1; i <= n; i++) {
						if (n % i == 0) {
							divisorList.add(i);
						}
					}
					System.out.println("\nNumber " + n + " is even");
					System.out.println("Divisor of number " + n + " is: "
							+ Arrays.toString(divisorList.toArray()).replace("[", "").replace("]", ""));
				}
				storageData.setIndex(1);

			}

		}
		synchronized (storageData) {
			storageData.notifyAll();
		}
	}
}
