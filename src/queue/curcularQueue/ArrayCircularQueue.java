package queue.curcularQueue;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayCircularQueue {
	private Employee[] queue;
	private int front;
	private int back;

	public ArrayCircularQueue(int capacity) {
		queue = new Employee[capacity];
	}

	public void add(Employee emp) {

		if (size() == queue.length - 1) {
			int numItems = size();
			Employee[] newQ = new Employee[2 * queue.length];

			System.arraycopy(queue, front, newQ, 0, queue.length - front);

			System.arraycopy(queue, 0, newQ, queue.length - front, back);

			System.arraycopy(newQ, 0, queue, 0, queue.length);

			queue = newQ;

			front = 0;
			back = numItems;
		}
		queue[back] = emp;
		if (back < queue.length - 1)
			back++;
		else
			back = 0;
	}

	public Employee remove() {

		if (size() == 0) // check if queue s empty, if the queue is emplty theow error
			throw new NoSuchElementException();

		Employee e = queue[front];
		queue[front] = null;
		front++;
		if (size() == 0) { // if we empty the queue, reset front and back
			front = 0;
			back = 0;
		} else if (front == queue.length) {
			front = 0;
		}
		return e;
	}

	public int size() {
		return (front <= back) ? back - front : back - front + queue.length;
	}

	public Employee peek() {
		if (size() == 0) // check if queue s empty, if the queue is emplty theow error
			throw new NoSuchElementException();

		return queue[front];
	}

	public void printQueue() {
		if (front <= back) {
			for (int i = front; i < back; i++) {
				System.out.println(queue[i]);
			}
		} else {
			for (int i = front; i < queue.length; i++) {
				System.out.println(queue[i]);
			}
			for (int i = 0; i < back; i++) {
				System.out.println(queue[i]);
			}
		}
	}
}
