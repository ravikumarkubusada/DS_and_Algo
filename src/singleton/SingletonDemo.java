package singleton;

public class SingletonDemo implements Cloneable {
	private static SingletonDemo obj = null;

	public static SingletonDemo getIntance() {

		if (obj == null) {
			synchronized (SingletonDemo.class) {
				if (obj == null)
					obj = new SingletonDemo();
			}
		}
		return obj;
	}

	protected Object readResolve() {
		return obj;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
