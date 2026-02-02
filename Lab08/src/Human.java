interface Workable { void work(); }
interface Eatable { void eat(); }
interface Sleepable { void sleep(); }

class Human implements Workable, Eatable {
    @Override
    public void work() { System.out.println("Human working..."); }
    @Override
    public void eat() { System.out.println("Human eating..."); }
}

class Robot implements Workable {
    @Override
    public void work() { System.out.println("Robot working continuously..."); }
}

class Android implements Workable, Eatable, Sleepable {
    @Override
    public void work() { System.out.println("Android working..."); }
    @Override
    public void eat() { System.out.println("Android charging (eating)..."); }
    @Override
    public void sleep() { System.out.println("Android standby mode (sleeping)..."); }
}
