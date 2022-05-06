import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		WeightComparator wc = new WeightComparator();
		
		int height = 80;
		int weight = 40;
		for(int i = 0; i < 20; i++) {
			people.add(new Person(0, weight--));
		}
		System.out.println(people.toString());
		Collections.sort(people, wc);
		System.out.println(people.toString());
		
	}
}
