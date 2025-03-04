package state_pattern;

public class Employee {
    private String name;
    private String position;
    private EmployeeState state;

    public Employee(String name, String position, EmployeeState state) {
        this.name = name;
        this.position = position;
        this.state = state;
    }

    public void setState(EmployeeState state) {
        this.state = state;
    }

    public void performTask() {
        Job job = state.getJob();
        System.out.println(name + " (" + position + ") cần làm công việc sau:");
        job.performTask();
    }
}
