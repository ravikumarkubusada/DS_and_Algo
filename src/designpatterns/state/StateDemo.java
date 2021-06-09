package designpatterns.state;

public class StateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Package pkg = new Package();
		pkg.printStatus();

		pkg.nextState();
		pkg.printStatus();

		pkg.nextState();
		pkg.printStatus();

		pkg.nextState();
		pkg.printStatus();
	}

}
