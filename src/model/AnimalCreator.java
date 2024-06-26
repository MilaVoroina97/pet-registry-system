package src.model;

import java.time.LocalDate;

import src.model.PackAnimals.Camel;
import src.model.PackAnimals.Donkey;
import src.model.PackAnimals.Horse;
import src.model.Pets.Cat;
import src.model.Pets.Dog;
import src.model.Pets.Hamster;

/**
 *  This class is responsible for creating new animal objects based on the provided animal type, name, and date of birth.
 *  It extends the Creator class.
 */
public class AnimalCreator extends Creator{

    /**
     * Creates a new animal object based on the provided animal type, name, and date of birth.
     *
     * @param type the type of animal to create
     * @param name the name of the animal
     * @param date the date of birth of the animal
     * @return the newly created animal object
     */
    @Override
    public Animal createNewAnimal(AnimalType type, String name, LocalDate date) {

          switch (type) {
            case Cat:
                return new Cat(name,date);
            case Dog:
                return new Dog(name,date);
            case Hamster:
                return new Hamster(name,date);
            case Horse:
                return new Horse(name, date);
            case Camel:
                return new Camel(name, date);
            case Donkey:
                return new Donkey(name, date);
            default:
                System.out.println("Такого животного здесь нет.");
                break;
        }
        return null;
    }
}
    

