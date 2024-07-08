package animal;

public  class Animal {
    public  String makeSound() {
        return "growl";
    }

    public Animal() {
    }

    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}
