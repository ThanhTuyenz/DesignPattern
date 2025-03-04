package no_design_pattern;

public class Employee {
	 private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void performTask() {
        switch (position) {
            case "Đội Trưởng":
                System.out.println(name + " (Đội Trưởng) cần làm công việc sau:");
                System.out.println("Đi Tuần, Gán việc cho nhân viên.");
                System.out.println();
                break;
            case "Giám đốc":
                System.out.println(name + " (Giám đốc) cần làm công việc sau:");
                System.out.println("Ra quyết định chiến lược công ty.");
                System.out.println();
                break;
            case "Nhân viên VP":
                System.out.println(name + " (Nhân viên VP) cần làm công việc sau:");
                System.out.println("Pha cà phê duyệt các tài liệu.");
                System.out.println();
                break;
            case "Nhân viên Xưởng":
                System.out.println(name + " (Nhân viên Xưởng) cần làm công việc sau:");
                System.out.println("Thực hiện công việc tại xưởng.");
                System.out.println();
                break;
            case "Kế Toán Trưởng":
                System.out.println(name + " (Kế Toán Trưởng) cần làm công việc sau:");
                System.out.println("Theo dõi, báo cáo tài chính.");
                System.out.println();
                break;
            default:
                System.out.println(name + " có chức vụ không xác định.");
                System.out.println();
                break;
        }
    }
}
