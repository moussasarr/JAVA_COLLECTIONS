package myProject;
import java.util.List;
import java.util.ArrayList;

//ArrayLists, Lists and Comparator with Generic

class Container<T extends Number>{
	T value;
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void showValue() {
		System.out.println(value.getClass().getName());
	}
	
	public void demo(ArrayList<? super T> obj) {
		System.out.println(obj);
	}
}

public class Hello {
	
	public static void main(String args[]) {
		List<Integer> myList = new ArrayList<>();
		myList.add(5);
		myList.add(7);
		myList.add(0);
		
		Container<Number> myContainer = new Container<>();
		myContainer.value = 5.2;
		myContainer.showValue();
		System.out.println(myList.get(1).getClass().getName());
		myContainer.demo( new ArrayList<Number>());
		
		for(Object o: myList) {
			System.out.println(o);
		}
	}
}
