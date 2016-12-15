package esempio_iterator;

import java.util.*;

public class prova {
	public static void main (String[] args){
		Set<Integer> insieme = new TreeSet<Integer>();
		for (int i=50; i>29; i--)
			insieme.add(i);
		Iterator<Integer> iter = insieme.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());
	}
}
