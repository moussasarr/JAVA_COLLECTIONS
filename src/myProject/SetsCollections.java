package myProject;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

//Sets have unique elements

public class SetsCollections {

	public static void main(String[] args) {
	
		
		Set<Integer> mySet = new HashSet<>();
		mySet.add(89);
		mySet.add(4);
		mySet.add(57);
		mySet.add(63);
		mySet.add(4);
		mySet.add(63);
		
		for(int i: mySet) {
			System.out.println(i);
		}
		
		
		Set<Integer> myTreeSet = new TreeSet<>();
		myTreeSet.add(89);
		myTreeSet.add(4);
		myTreeSet.add(57);
		myTreeSet.add(63);
		myTreeSet.add(4);
		myTreeSet.add(63);
		
		for(int j: myTreeSet) {
			System.out.println(j);
		}
		

	}

}
