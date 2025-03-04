package state_pattern;

public class OfficeEmployeeState implements EmployeeState {
    @Override
    public Job getJob() {
        return new OfficeEmployeeJob();
    }
}
