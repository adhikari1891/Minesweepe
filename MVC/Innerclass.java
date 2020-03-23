
public class Innerclass {
 
	private int id;
	
	private class Brain{
		public void think() {
			System.out.println("Robot" + id + "is thinking.");
		}
	}

	public static class Battery{
		public void charge() {
			System.out.println("Battery charging"+ id);
		}

	public Innerclass(int id) {
		this.id = id;
	}
	public void start() {
		System.out.println("Starting robot" + id);
		
		Brain brain = new Brain();
		brain.think();
		
		final String name = "Raj";
		
		class Temp{
			public void doSomething() {
				System.out.println("ID is:" + id);
				System.out.println("Name is " + name);
			}
		}
		Temp temp = new Temp();
		temp.doSomething();
		
		
	}
	
	}
	
}
