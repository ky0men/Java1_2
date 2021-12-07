package SyncWaitAndNotify;

public class Main {
	public static void main(String[] args) {
		CustomerAccount cus = new CustomerAccount();
		Thread withDrawThread = new Thread() {
			public void run() {
				cus.withDraw(2000);
			}
		};
		withDrawThread.start();

		Thread desThread = new Thread() {
			public void run() {
				cus.deposit(500);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				cus.deposit(2000);
			}
		};
		desThread.start();
	}
}
