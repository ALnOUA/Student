package info;

public class Main {

	public static void main(String[] args) throws PolyStudentException {
		StudentList std = new StudentList();
		std.add(new Student(1, "Ivanov", "Ivan", "Ivanovich", 21, 11,2003, "Lenina St.25", "0503458201", "w", 3, 321));
		std.add(new Student(2, "Petrov", "Peter", "Nikolaevich", 11, 12,2003, "Lenina St.25", "0673334576", "q", 3, 322));
		std.add(new Student(2, "Sidorov", "James", "Petrovich", 10, 8,2002, "Lenina St.15", "0981233221", "q", 4, 413));
		std.add(new Student(2, "Tretyak", "Robb", "Vladimirovich", 3, 4,2002, "Lenina St.15", "0503458201", "q", 4, 412));

		std.print();
		System.out.println("______________-");
		StudentList sameFaculty = std.getStudentsByFaculty("q");
		sameFaculty.print();
		System.out.println("______________-");
		StudentList afterYear = std.getStudentsByYear(2002);
		afterYear.print();
		System.out.println("______________-");
		StudentList sameGroup = std.getStudentsByGroup(412);
		sameGroup.print();
		System.out.println("______________-");
		StudentList sameCourse = std.getStudentsByCourse(3);
		sameCourse.print();
		
		
		
	}

}
