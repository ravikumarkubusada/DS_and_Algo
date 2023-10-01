package singleton;

public class mainDemo {

	public static void main(String[] args) {

		SingletonDemo s1 = new SingletonDemo();
		SingletonDemo s2 = new SingletonDemo();

		System.out.println(s1.getIntance().hashCode());
		System.out.println(s2.getIntance().hashCode());

	}

}
