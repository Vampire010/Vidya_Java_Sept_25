package Collections_List;

import java.util.ArrayList;

public class ArrayList_Ex3 {

	public static void main(String[] args) {

		ArrayList<Character> vowels = new ArrayList();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('0');
		vowels.add('u');
		System.out.println(vowels);
		System.out.println("arrayList_count: " + vowels.size());

		
		
		vowels.set(0, 'A');
		System.out.println("Updated: " + vowels);
		vowels.clear();
		System.out.println("Updated: " + vowels);

		
		
		ArrayList<Character> consonents = new ArrayList(vowels);
		System.out.println(consonents);
		consonents.add('l');
		consonents.removeAll(vowels);
		System.out.println("Updated list: "+ consonents);
		consonents.remove(0);
		System.out.println("Updated list: "+ consonents);


		
	}

}
