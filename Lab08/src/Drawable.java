// 1. Tạo Interface
interface Drawable {
    void draw(); // Mặc định là public abstract
}

// 2. Class Circle implement Drawable
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}