package Animal;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalFactory animalInstance = new AnimalFactory();

        Animal cat = animalInstance.getAnimal("feline");
        System.out.println(cat.makeSound());

        Animal dog = animalInstance.getAnimal("canine");
        System.out.println(dog.makeSound());
    }


}
