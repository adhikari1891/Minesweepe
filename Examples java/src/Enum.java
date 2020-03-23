
public class Enum {

	public static final int MOUSE = 2;

	public static void main(String[] args) {

		Animal animal = Animal.DOG;

		switch (animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			break;

		}
      System.out.println(Animal.DOG);
      System.out.println("eNUM NAME AS A STRING" +Animal.DOG.name());
      System.out.println(Animal.DOG.getClass());
     
      System.out.println(Animal.MOUSE.getName());
	}
}
