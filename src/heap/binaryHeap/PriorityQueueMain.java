package heap.binaryHeap;

import java.util.PriorityQueue;

public class PriorityQueueMain {

	public static void main(String args[]) {

//		min heap impl
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		pq.add(25);
		pq.add(-22);
		pq.add(1314);
		pq.add(54);
		pq.add(0);
		pq.add(-3322);
		pq.add(429);

		printHeap(pq);
		
		System.out.println("peek " + pq.peek());

		System.out.println("remove " + pq.remove());
		printHeap(pq);

		System.out.println("peek " + pq.peek());

		System.out.println("poll " + pq.poll());
		printHeap(pq);
		

		System.out.println("peek " + pq.peek());

		System.out.println("remove(25) " + pq.remove(25));

		System.out.println("add -1 " + pq.add(-1));
		System.out.println("peek" + pq.peek());

	}
	
	public static void printHeap(PriorityQueue<Integer> heap) {
		heap.parallelStream().forEach(ele -> {
			System.out.print(ele + "->");
		});
		
		System.out.println();
		
	}
}
