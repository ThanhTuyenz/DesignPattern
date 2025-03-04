package state_pattern;

public class OfficeEmployeeJob implements Job {
    @Override
    public void performTask() {
        System.out.println("Pha và phê duyệt các tài liệu.");
    }
}
