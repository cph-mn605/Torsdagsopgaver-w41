package task3;

public class Rhino extends Animal{
    public Rhino(int nOLegs) {
        super(nOLegs);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Rhino goes muuuuuh");
    }
}
