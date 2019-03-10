package myProject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MoreCollectionAndGenerics {

	public static void main(String[] args) {
		
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(1, 90));
		studs.add(new Student(2, 54));
		studs.add(new Student(3, 78));
		studs.add(new Student(4, 85));
		studs.add(new Student(5, 98));
		studs.add(new Student(6, 65));
		studs.add(new Student(7, 30));
		
		Collections.sort(studs,(s1,s2) -> {
			return s1.grade > s2.grade? -1: s2.grade > s1.grade? 1:0;
		});
		
		
		for(Student s : studs) {
			System.out.println(s);
		}
	}
}


class Student {
	int id, grade;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", grade=" + grade + "]";
	}


	public Student(int id, int grade) {
		this.grade = grade;
		this.id = id;
	}
}
