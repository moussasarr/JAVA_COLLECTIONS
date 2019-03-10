package myProject;
import java.util.Comparator;

//Implementation of the comparator Interface

class ComparInt implements Comparator<Integer> {
    
	@Override
	public int compare(Integer num1, Integer num2) {
	  if (num1 % 10 > num2%10) {
		  return 1;
	  }
	  return -1;
  }
}
