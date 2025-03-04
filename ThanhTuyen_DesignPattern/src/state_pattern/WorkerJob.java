package state_pattern;

public class WorkerJob implements Job {
    @Override
    public void performTask() {
        System.out.println("Thực hiện công việc tại xưởng.");
    }
}
