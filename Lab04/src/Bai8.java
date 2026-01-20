class EmployeeInfo {
    String name;

    public EmployeeInfo(String id, String name) {
        this.name = name;
    }
}

class Department {
    String deptName;
    EmployeeInfo employee; // Kết tập (Trưởng phòng chẳng hạn)

    public Department(String deptName, EmployeeInfo employee) {
        this.deptName = deptName;
        this.employee = employee;
    }

    public void display() {
        System.out.println("Phòng: " + deptName + " - Nhân viên: " + employee.name);
    }
}

public class Bai8 {
    public static void main(String[] args) {
        EmployeeInfo emp = new EmployeeInfo("E01", "Alice");
        Department dept = new Department("IT", emp);
        
        dept.display();
    }
}