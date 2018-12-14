package info;

class PolyStudentException extends Exception {

}

public class StudentList {
	private Student[] students;
	private int count;

	public StudentList() {
		students= new Student[5];
		count=-1;
	}

	public void add(Student student) {
		students[++count] = student;
	}

	public Student get(int i) {
		return students[i];
	}

	public int size() {
		return count + 1;
	}

	public void print() {
		for (int i = 0; i < size(); i++) {
			System.out.println(students[i]);
		}
	}

	public void printStudentsByFaculty(String faculty) {
		for (int i = 0; i < size(); i++) {
			if (students[i].getFaculty().equals(faculty)) {
				System.out.println(students[i]);
			}
		}
	}

	public StudentList getStudentsByFaculty(String faculty) {
		StudentList studentsByFaculty = new StudentList();
		for (int i = 0; i < size(); i++) {
			if (students[i].getFaculty().equals(faculty)) {
				studentsByFaculty.add(students[i]);
			}
		}
		return studentsByFaculty;
	}
	public StudentList getStudentsByCourse(int course) {
		StudentList studentsByCourse = new StudentList();
		for (int i = 0; i < size(); i++) {
			if (students[i].getCourse()==course) {
				studentsByCourse.add(students[i]);
			}
		}
		return studentsByCourse;
	}
	public StudentList getStudentsByYear(int year) {
		StudentList studentsByYear = new StudentList();
		for (int i = 0; i < size(); i++) {
			if (students[i].getBurthYear() == year) {
				studentsByYear.add(students[i]);
			}
		}
	
	return studentsByYear;
}
	public StudentList getStudentsByGroup(int group) {
		StudentList studentsByGroup = new StudentList();
		for (int i = 0; i < size(); i++) {
			if (students[i].getGroup()==group) {
				studentsByGroup.add(students[i]);
			}
		}
	
	return studentsByGroup;
}
	
}
