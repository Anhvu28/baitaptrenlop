interface Vehicle {
    void start(); // abstract

    // Default method: Có phần thân, không bắt buộc override
    default void honk() {
        System.out.println("Beep beep!");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}
