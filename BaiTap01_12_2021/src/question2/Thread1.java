package question2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Thread1 extends Thread {
	StorageData storageData;

	public Thread1(StorageData storageData) {
		this.storageData = storageData;
	}

	@Override
	public void run() {
		synchronized (storageData) {
			FileReader fread = null;
			BufferedReader bread = null;
			try {
				fread = new FileReader("number.txt");
				bread = new BufferedReader(fread);
				String line = null;
				bread.readLine();
				while ((line = bread.readLine()) != null) {
//					System.out.println(storageData.getCurrentLine());
					storageData.setCurrentLine(storageData.getCurrentLine() + 1);
					int n = Integer.parseInt(line);
					storageData.setN(n);
					if (n % 2 == 0) {
						storageData.setIndex(2);
					} else {
						storageData.setIndex(3);
					}
					storageData.notifyAll();
					storageData.wait();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				if (bread != null) {
					try {
						bread.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}
}
