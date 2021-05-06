package uebungen.uebung5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Uebung5 {
	
	public static List<String> createArrayList(String[] words) {
		List<String> list = new ArrayList<>();
	/*	for (int i = 0; i < words.length; i++) {
			list.add(words[i]);
		} */
		for(String s : words) {
			list.add(s);
		}
		return list;
	}
	
	public static void printList(List<String> list) {
	//	Iterator<String> it = list.iterator();
		System.out.println("Liste mit " + list.size() + " Elementen : ");
		System.out.println("-----------------------------------");
		for(String s : list) {
			System.out.println(s);
		}
	/*	while(it.hasNext()) {
			System.out.println(it.next());
		} */
		}
	
	public static Set<String> createHashSet(String[] words) {
		Set<String> set = new HashSet<>();
		for (int i = 0; i < words.length; i++) {
			set.add(words[i]);
		}
		return set;	
	}
	
	public static void printSet(Set<String> set) {
		Iterator<String> it = set.iterator();
		System.out.println("Menge mit " + set.size() + " Elementen : ");
		System.out.println("-------------------------------");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	
	public static Set<String> createTreeSet(String[] words) {
		Set<String> set = new TreeSet<>();
		for (int i = 0; i < words.length; i++) {
			set.add(words[i]);
		}
		return set;
	}
	
	public static List<String> findDoubletes(List<String> list) {
		List<String> doubletes = new ArrayList<>();
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			if(list.indexOf(s)!=list.lastIndexOf(s)) {
				doubletes.add(s);
			}
		}
		return doubletes;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = {"Linux", "Apple", "Facebook", "Amazon", "IBM", "Lenovo", "Google", "IBM", "Microsoft", "Apple", "Google", "Twitter", "Skype", "Chrome", "Linux", "Firefox"};
		
		System.out.println("A, Listen (List)");
		System.out.println();
		List<String> list = createArrayList(words);
		printList(list);
		System.out.println();
		System.out.println("Index des ersten Auftretens von Apple : " + list.indexOf("Apple"));
		System.out.println("Index des letzten Auftretens von Apple : " + list.lastIndexOf("Apple"));
		System.out.println("erstes Element der Liste : " + list.get(0));
		System.out.println("letztes Element der Liste : " + list.get(list.size()-1));
		System.out.println();
		System.out.println();
		list.remove("Apple");
		list.remove("Google");
		list.remove("Facebook");
		printList(list);
		
		System.out.println();
		System.out.println("B Mengen (Set)");
		System.out.println();
		
		Set<String> hashSet = createHashSet(words);
		printSet(hashSet);
		System.out.println();
		
		Set<String> treeSet = createTreeSet(words);
		printSet(treeSet);
		
		System.out.println();
		
		list = createArrayList(words);
		List<String>list1 = findDoubletes(list);
		printList(list1);
		
		
	}

}
