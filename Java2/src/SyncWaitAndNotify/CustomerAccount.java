package SyncWaitAndNotify;

public class CustomerAccount {
	int balance = 1000;

	public CustomerAccount() {
		System.out.println("Tai khoan cua ban co: " + balance);
	}

	public synchronized void withDraw(int withDrawNumber) {
		System.out.println("Dang thuc hien giao dich rut tien....");
		while (balance < withDrawNumber) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= withDrawNumber;
		System.out.println("Rut tien thanh cong! So tien cua ban: " + balance);
	}

	public synchronized void deposit(int desNumber) {
		System.out.println("Dang thuc hien giao dich nap tien");
		balance += desNumber;
		System.out.println("Nap tien thanh cong. So tien trong tai khoan: " + balance);
		notifyAll();
	}
}
