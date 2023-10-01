package designpatterns.state;

public class ReceivedState implements PackageState {

	@Override
	public void next(Package pkg) {
		// TODO Auto-generated method stub
		System.out.println("This package is already received by a client.");
	}

	@Override
	public void prev(Package pkg) {
		pkg.setState(new DeliveredState());

	}

	@Override
	public void printState() {
		System.out.println("Package was received by client.");

	}

}