package queue.arrayImpl;

import java.util.NoSuchElementException;

public class ArrayQueue {
	private Employee[] queue;
	private int front;
	private int back;

	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}

	public void add(Employee emp) {
		if (back == queue.length) { // queue is full, resize the queue
			Employee[] newQ = new Employee[2 * queue.length];
			System.arraycopy(newQ, 0, queue, 0, queue.length);
			queue = newQ;
		}
		queue[back] = emp;
		back++;
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
		}
		return e;
	}

	public int size() {
		return back - front;
	}

	public Employee peek() {
		if (size() == 0) // check if queue s empty, if the queue is emplty theow error
			throw new NoSuchElementException();
		
		return queue[front];
	}

	public void printQueue() {
		for (int i = front; i < back; i++) {
			System.out.println(queue[i]);
		}
	}
}
