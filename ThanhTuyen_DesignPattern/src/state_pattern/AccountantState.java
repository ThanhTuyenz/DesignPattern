package state_pattern;

public class AccountantState implements EmployeeState {
    @Override
    public Job getJob() {
        return new AccountantJob();
    }
}
