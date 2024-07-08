package animal;

public class Cat extends Animal {
    @Override
    public String makeSound() {
        return "Meow";
    }

    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = new Animal();

        Animal myAnimal1 = new Cat(); // up casting

        Cat myCat1 = (Cat)myAnimal1; // down casting

        myCat.testInstanceMethod(); // cat
        myCat.testClassMethod(); //cat

        myCat1.testInstanceMethod(); // cat
        myCat1.testClassMethod(); // cat

        myAnimal.testInstanceMethod(); // Animal
        myAnimal.testClassMethod(); // Animal

        myAnimal1.testInstanceMethod(); // override -> Cat
        myAnimal1.testClassMethod(); // still call static method
    }
}
