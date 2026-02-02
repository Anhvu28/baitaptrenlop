interface Animal {
    void eat();
}

// Interface kế thừa Interface khác dùng từ khóa 'extends'
interface Mammal extends Animal {
    void run();
}

class Dog implements Mammal {
    @Override
    public void eat() {
        System.out.println("Dog is eating bones");
    }

    @Override
    public void run() {
        System.out.println("Dog is running fast");
    }
}

