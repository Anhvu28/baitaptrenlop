package  lab3.pkg11;

public class Car {
    private String mauXe; // dùng làm model
    private int tocDo;

    public void tangToc(int v) {
        if (v > 0) tocDo += v;
    }

    public void giamToc(int v) {
        tocDo = Math.max(0, tocDo - v);
    }

    public boolean vuotTocDo() {
        return tocDo > 100;
    }

    public void hienThi() {
        System.out.println("Model: " + mauXe + " – Speed: " + tocDo);
    }
}
