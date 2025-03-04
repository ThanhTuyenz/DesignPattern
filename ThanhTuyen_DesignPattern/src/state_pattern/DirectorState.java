package state_pattern;

public class DirectorState implements EmployeeState {
    @Override
    public Job getJob() {
        return new DirectorJob();
    }
}
