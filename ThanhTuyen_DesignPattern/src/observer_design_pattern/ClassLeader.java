package observer_design_pattern;

public class ClassLeader extends Student {
	private Classroom classroom;
	
	public ClassLeader(String name, Classroom classroom) {
		super(name);
		this.classroom = classroom;
	}
	
	public void sendAnnouncement(String message) {
		System.out.println("Lop truong thong bao: " + message);
		classroom.notifyAllStudent(message);
	}

}
