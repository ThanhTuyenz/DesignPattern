package decorator;

public class Employee {
    private String name;
    private String position;
    private Job job;

    public Employee(String name, String position, Job job) {
        this.name = name;
        this.position = position;
        this.job = job;
    }

    public void performTask() {
        System.out.println(name + " (" + position + ") cần làm công việc sau:");
        job.performTask();
    }
}