package task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList();
        Zoo zoo = new Zoo();
        Panda panda = new Panda(4);
        Rhino rhino = new Rhino(4);
        Monkey monkey = new Monkey(2);

        zoo.addAnimal(panda);
        zoo.addAnimal(rhino);
        zoo.addAnimal(monkey);

        zoo.makeAllSounds();

        zoo.printNumberOfLegs();
    }
}
