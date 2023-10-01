/**
 * 
 */
package interview.coding.problems.gc;

/**
 * @author Ravikumar Kubusada
 *
 */
public class GarbageCollector {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {

//		Creating of objects --  it will be stored in heap
		GarbageCollector g1 = new GarbageCollector();
		GarbageCollector g2 = new GarbageCollector();

		// Nullifying the reference variable
		g1 = null;

		// requesting JVM for running Garbage Collector
		System.gc();

		// Nullifying the reference variable
		g2 = null;

		// requesting JVM for running Garbage Collector
		Runtime.getRuntime().gc();
	}

	@Override
	// finalize method is called on object once
	// before garbage collecting it
	protected void finalize() throws Throwable {
		System.out.println("Garbage collector called");
		System.out.println("Object garbage collected : " + this);
	}

}
