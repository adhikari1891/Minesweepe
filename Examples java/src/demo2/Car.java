package demo2;

public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("Start");

	}

	@Override
	public void doStuff() {
		System.out.println("do dtuff");
	}

	@Override
	public void shutdown() {
		System.out.println("run");
	}

}
