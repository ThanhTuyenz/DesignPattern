package state_pattern;

public class TeamLeaderState implements EmployeeState {
    @Override
    public Job getJob() {
        return new TeamLeaderJob();
    }
}
