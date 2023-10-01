package stack.arrayImpl;

import java.util.EmptyStackException;

public class ArrayStack {
	private Employee[] stack;
	private int top;

	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}

	public void push(Employee emp) {
		if (stack.length == top) { // stack is full
//			need to resize the array
			Employee[] newStack = new Employee[2 * stack.length];
			System.arraycopy(stack, 0, newStack, 0, stack.length); // O(n)
			stack = newStack;
		}
		System.out.println("now top is at: "+top);
		stack[top++] = emp; // O(1)
	}

	public Employee pop() {
		if (isEmpty())
			throw new EmptyStackException();

		Employee e = stack[--top];
		stack[top] = null;

		return e;

	}

	public boolean isEmpty() {
		return top == 0;
	}

	public Employee peek() {

		if (isEmpty())
			throw new EmptyStackException();

		return stack[top - 1];
	}

	public int size() {
		return top;
	}

	public void printStack() {
		for (int i = top - 1; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
}
