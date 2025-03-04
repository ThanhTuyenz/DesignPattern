package no_design_pattern;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Phát", "Đội Trưởng");
        Employee employee2 = new Employee("Phú", "Giám đốc");
        Employee employee3 = new Employee("Khang", "Nhân viên VP");
        Employee employee4 = new Employee("Khánh", "Nhân viên Xưởng");
        Employee employee5 = new Employee("Huy", "Kế Toán Trưởng");

        employee1.performTask(); 
        employee2.performTask();  
        employee3.performTask();  
        employee4.performTask();  
        employee5.performTask();  
    }
}