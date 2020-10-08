package task3;

public class Animal implements AnimalSound {
    private int numberOfLegs;

    public Animal(int nOLegs) {
        this.numberOfLegs = nOLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }


    @Override
    public void makeSound() {

    }
}
