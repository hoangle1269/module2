package TemplateMethod;

public class Hamburger extends Meal {
    @Override
    public void prepareIngredients() {
        System.out.println("Get burgers, buns and french fries");
    }

    @Override
    public void cook() {
        System.out.println("Fry buns on grills");
    }

    @Override
    public void cleanUp() {
        System.out.println("Clean the fuck up");
    }
}
