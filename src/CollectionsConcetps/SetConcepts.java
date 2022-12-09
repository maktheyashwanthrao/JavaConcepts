package CollectionsConcetps;

import java.util.HashSet;

public class SetConcepts {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("10");
		hs.add("Java");
		hs.add(null);
		hs.add('c');
		System.out.println(hs);
		hs.remove(1);
		System.out.println(hs);
		

	}

}
