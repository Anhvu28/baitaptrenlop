interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

// Một class có thể implement nhiều interface
class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}

