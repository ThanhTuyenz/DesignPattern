package observer_design_pattern;

public interface Subject {
	void addStudent(Observer observer);

	void removeStudent(Observer observer);

	void notifyAllStudent(String message);

}
