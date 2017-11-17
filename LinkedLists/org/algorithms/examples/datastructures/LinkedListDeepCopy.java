package org.algorithms.examples.datastructures;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDeepCopy {

	public static void main(String[] args) {

		LinkedList<Person> list = new LinkedList<Person>();

		list.add(new Person("Kamlesh", new Address("chicago", "2180 hassell Rd", "60169")));
		list.add(new Person("Suhani", new Address("Hoffman Estates", "2180 hassell Rd", "60169")));
		list.add(new Person("Dipti", new Address("Phoenix", "2180 hassell Rd", "60169")));

		Iterator<Person> iterator = list.iterator();

		LinkedList<Person> deepcopiedlist = new LinkedList<Person>();
		LinkedList<Person> shallowcopiedlist = new LinkedList<Person>();
		while (iterator.hasNext()) {
			Person p = iterator.next();
			System.out.println(p.getAddress());
			deepcopiedlist.add(p.clone());
			shallowcopiedlist.add(new Person(p.getName(), p.getAddress()));
		}

		iterator = deepcopiedlist.iterator();

		while (iterator.hasNext()) {
			Person p = iterator.next();
			System.out.println(p.getAddress());
		}

		iterator = shallowcopiedlist.iterator();

		while (iterator.hasNext()) {
			Person p = iterator.next();
			System.out.println(p.getAddress());
		}
		System.out.println(Arrays.toString(list.toArray()));
		System.out.println(Arrays.toString(deepcopiedlist.toArray()));
	}

}
