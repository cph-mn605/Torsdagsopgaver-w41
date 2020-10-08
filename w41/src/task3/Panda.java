package task3;

public class Panda extends Animal{
    public Panda(int nOLegs) {
        super(nOLegs);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println ("Panda goes grrrrr");
    }
}
