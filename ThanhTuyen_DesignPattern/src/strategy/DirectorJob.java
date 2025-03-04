package strategy;

public class DirectorJob implements Job {
    @Override
    public void performTask() {
        System.out.println("Ra quyết định chiến lược công ty.");
    }
}
