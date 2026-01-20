// File: Bai10.java
class Teacher {
    private String name;
    private String specialization;

    public Teacher(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() { return name; }
    public String getSpecialization() { return specialization; }
}

class ClassRoom {
    private String className;
    private Teacher teacher; // Kết tập

    // Nạp chồng constructor
    public ClassRoom(String className) {
        this.className = className;
    }

    public ClassRoom(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
    }

    public void display() {
        System.out.print("Lớp: " + className);
        if (teacher != null) {
            System.out.println(" - GVCN: " + teacher.getName() + " (" + teacher.getSpecialization() + ")");
        } else {
            System.out.println(" - Chưa có GVCN");
        }
    }
}

public class Bai10 {
    public static void main(String[] args) {
        Teacher t = new Teacher("Co Hoa", "Toan Cao Cap");
        
        ClassRoom c1 = new ClassRoom("CNTT 1");
        ClassRoom c2 = new ClassRoom("CNTT 2", t);
        
        c1.display();
        c2.display();
    }
}