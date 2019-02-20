package patterns.singleton;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private volatile static ChocolateBoiler uniqueInstance;

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			synchronized (ChocolateBoiler.class) {
				if(uniqueInstance == null) {
					System.out.println("Create unique instance of Chocolate Boiler");
					uniqueInstance = new ChocolateBoiler();
				}
			}
		}
		System.out.println("Return instance of Chocolate Boiler");
		return uniqueInstance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
		}
	}

	public void drain() {
		if(!isEmpty() && isBoiled()) {
			empty = true;
		}
	}

	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}


	public boolean isEmpty() {
		return empty;
	}

	public boolean  isBoiled() {
		return boiled;
	}

}
