package decorator;

public class AccountantJob implements Job {
    @Override
    public void performTask() {
        System.out.println("Theo dõi, báo cáo tài chính.");
    }
}
