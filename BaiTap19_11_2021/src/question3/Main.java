package question3;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		Queue<Employee> emQueue = new LinkedList<Employee>();
		emQueue.offer(new Employee(101, "Nguyen Van An"));
		emQueue.offer(new Employee(103, "Tran Van Giau"));
		emQueue.offer(new Employee(102, "Nguyen Thi Tinh"));
		emQueue.offer(new Employee(104, "Quach Tuan Dat"));
		System.out.println("Show all Employee");
		while (emQueue.poll() != null) {
			System.out.println(emQueue.poll().toString());
		}

	}
}
