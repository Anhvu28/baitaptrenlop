
class Student {
    private String id;
    private String name;
    private double score;

    // Getter và Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }

    // Phương thức kiểm tra đạt
    public boolean isPass() {
        return score >= 5;
    }

    // Hiển thị thông tin
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Score: " + score + ", Pass: " + isPass());
    }
}
public class Students {

    public static void main(String[] args) {
        Student s1 = new Student();
        // Gán dữ liệu qua setter
        s1.setId("SV001");
        s1.setName("Nguyen Van A");
        s1.setScore(7.5);

        // Gọi phương thức
        s1.display();
        System.out.println("Check Pass rieng: " + s1.isPass());
    }
    
}
