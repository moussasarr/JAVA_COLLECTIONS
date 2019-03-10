package myProject;
//import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
//Collections are dynamic arrays
//Collection is an interface in Java


public class GenericsAndCollections {
 
	public static void main(String[] args) throws Exception{

		List<Integer> c = new ArrayList<>();
		c.add(3);
		c.add(7);
		c.add(88);
		c.add(99);
		c.add(87);
		c.add(1,5);

		c.remove(3);
		
		
		
		for(int o : c) {
			System.out.println(o);
		}
		
		Collections.sort(c);
		
		
		c.forEach(System.out::println);
	
	}

}
