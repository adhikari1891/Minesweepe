
public enum Animal {
	CAT("Fergusan"),DOG("Fido"),MOUSE("Cherry");
	private String name;
	
	Animal(String name) {
		this.name=name;
		
	}

	public String getName() {
		return name;
	}
public String toString() {
	return "The animal is called" + name;
	
}
	
	}


