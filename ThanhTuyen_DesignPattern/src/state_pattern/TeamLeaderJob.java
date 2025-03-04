package state_pattern;

public class TeamLeaderJob implements Job {
    @Override
    public void performTask() {
        System.out.println("Đi Tuần, Gán việc cho nhân viên.");
    }
}
