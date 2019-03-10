package myProject;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableAPI {
	
	public static void main(String[] args) {
		List<Professor> professors = new ArrayList<>();
		professors.add(new Professor(1, 90));
		professors.add(new Professor(2, 54));
		professors.add(new Professor(3, 78));
		professors.add(new Professor(4, 85));
		professors.add(new Professor(5, 98));
		professors.add(new Professor(6, 65));
		professors.add(new Professor(7, 30));
		
		
		Collections.sort(professors);

		for(Professor p: professors) {
			System.out.println(p);
		}
	}

}

class Professor implements Comparable<Professor> {
	int id, rating;
	
	public Professor(int id, int rating) {
		this.id = id;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", rating=" + rating + "]";
	}

	@Override
	public int compareTo(Professor o) {
		// TODO Auto-generated method stub
		return o.rating > this.rating? 1: o.rating < this.rating? -1: 0;
	}


}