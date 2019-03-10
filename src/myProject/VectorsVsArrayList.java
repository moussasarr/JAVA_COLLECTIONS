package myProject;
import java.util.Collections;
import java.util.Vector;
import java.util.Comparator;



public class VectorsVsArrayList {
    //Vector is like an array List 
	//but that keeps track of the capacity
	//Capacity automatically doubles when exceeded
	
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		for(int i =0; i< 10; i++) {
			v.add(i*143+2);
		}
		
		for(int integ: v) {
			System.out.println(integ);
		}
		
		System.out.println(v.capacity());
		
		for(int i =0; i< 10; i++) {
			v.add(i*301);
		}
		
		Collections.sort(v);
		for(int integ: v) {
			System.out.println(integ);
		}
		
		Collections.reverse(v);
		for(int integ: v) {
			System.out.println(integ);
		}
		
		
		//Let's compare by last integer
	    Comparator<Integer> comp = (e1, e2)-> {
			   return e1%10 > e2%10 ? 1: -1;
			};
		
		Collections.sort(v, comp);
		
		for(int integ: v) {
			System.out.println(integ);
		}
		

	}

}
