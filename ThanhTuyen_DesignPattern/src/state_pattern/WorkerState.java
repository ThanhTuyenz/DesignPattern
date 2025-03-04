package state_pattern;

public class WorkerState implements EmployeeState {
    @Override
    public Job getJob() {
        return new WorkerJob();
    }
}
