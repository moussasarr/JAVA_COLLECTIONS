package myProject;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class AnonymousInnerClass {
	
	public static void main(String[] args) {
		@SuppressWarnings("serial")
		List<Integer> values = new ArrayList<Integer>() 
		{{
			add(6);
			add(7);
			add(9);
		}};
		
		
		for (int i : values) {
			System.out.println(i);
		}
	}

}
