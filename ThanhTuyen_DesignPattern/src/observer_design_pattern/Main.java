package observer_design_pattern;

public class Main {
	public static void main(String[] args) {
		Classroom classroom = new Classroom();
		ClassLeader classLeader = new ClassLeader("Huy", classroom);
		Student student1 = new Student("Hoa");
		Student student2 = new Student("Lan");
		Student student3 = new Student("Mai");
		classroom.addStudent(classLeader);
		classroom.addStudent(student1);
		classroom.addStudent(student2);
		classroom.addStudent(student3);
		classLeader.sendAnnouncement("Hom nay se nghi hoc");
	}

}
