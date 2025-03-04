package state_pattern;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Phát", "Đội Trưởng", new TeamLeaderState());
        Employee employee2 = new Employee("Phú", "Giám đốc", new DirectorState());
        Employee employee3 = new Employee("Khang", "Nhân viên VP", new OfficeEmployeeState());
        Employee employee4 = new Employee("Khánh", "Nhân viên Xưởng", new WorkerState());
        Employee employee5 = new Employee("Huy", "Kế Toán Trưởng", new AccountantState());

        employee1.performTask();
        employee2.performTask(); 
        employee3.performTask();
        employee4.performTask();  
        employee5.performTask();  

        System.out.println("\nSau khi thay đổi trạng thái:");
        employee1.setState(new WorkerState());
        employee1.performTask();
    }
}

