package baiTap29_11;

import java.util.ArrayList;

public class Question5 {
	static class Controller {

		public Controller() {
		}

		public synchronized void showName(ArrayList<Students> stuList) {
			stuList.forEach((stu) -> {
				notifyAll();
				System.out.println("Name: " + stu.getName());
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
			notifyAll();
		}

		public synchronized void showAddress(ArrayList<Students> stuList) {
			stuList.forEach((stu) -> {
				notifyAll();
				System.out.println("Address: " + stu.getAddress());
				try {
					Thread.sleep(1000);
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		}

	}

	public static void main(String[] args) {
		Students std1 = new Students("Nguyen Ngoc Lan", "Hai Phong");
		Students std2 = new Students("Duong Tien Nam", "Ha Noi");
		Students std3 = new Students("Ngo Anh Quan", "Thai Nguyen");
		ArrayList<Students> stuList = new ArrayList<>();
		stuList.add(std1);
		stuList.add(std2);
		stuList.add(std3);
		Controller ctr = new Controller();
		Thread thread1 = new Thread() {
			public void run() {
				ctr.showName(stuList);
			}
		};
		thread1.start();

		Thread thread2 = new Thread() {
			public void run() {
				ctr.showAddress(stuList);
			}
		};
		thread2.start();

	}
}
