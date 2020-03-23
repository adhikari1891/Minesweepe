import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class AlphabeticalComparator implements Comparator<String> {

	public int compare(String s1, String s2) {

		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;

		}
		return 0;
	}

}

class ReverseALphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}

}

public class App {
	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		animals.add("Lado");
		animals.add("kha");
		animals.add("how");
		animals.add("you");
		animals.add("mnajhha");
		animals.add("jasgddjs");

		Collections.sort(animals, new AlphabeticalComparator());
		for (String animal : animals) {
			System.out.println(animal);
		}
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(4);
		numbers.add(45);
		numbers.add(54);
		numbers.add(34);
		numbers.add(10);
		numbers.add(541);

		Collections.sort(numbers);

		for (Integer number : numbers) {
			System.out.println(number);
		}
	}

}
