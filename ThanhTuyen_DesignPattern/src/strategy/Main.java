package strategy;

public class Main {
    public static void main(String[] args) {
        Job teamLeaderJob = new TeamLeaderJob();
        Job directorJob = new DirectorJob();
        Job officeEmployeeJob = new OfficeEmployeeJob();
        Job workerJob = new WorkerJob();
        Job accountantJob = new AccountantJob();

        Employee employee1 = new Employee("Phát", "Đội Trưởng", teamLeaderJob);
        Employee employee2 = new Employee("Phú", "Giám đốc", directorJob);
        Employee employee3 = new Employee("Khang", "Nhân viên VP", officeEmployeeJob);
        Employee employee4 = new Employee("Khánh", "Nhân viên Xưởng", workerJob);
        Employee employee5 = new Employee("Huy", "Kế Toán Trưởng", accountantJob);

        employee1.performTask();  
        employee2.performTask();  
        employee3.performTask(); 
        employee4.performTask(); 
        employee5.performTask();  

        System.out.println("\nSau khi thay đổi công việc:");
        employee1.setJob(workerJob); 
        employee1.performTask(); 
    }
}

