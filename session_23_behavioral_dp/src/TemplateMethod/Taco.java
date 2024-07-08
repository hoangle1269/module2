package TemplateMethod;

public class Taco extends Meal {
    @Override
    public void prepareIngredients() {
        System.out.println("Getting ground beef and shells");
    }

    @Override
    public void cook() {
        System.out.println("Fry beef in pan");
    }

    @Override
    public void eat() {
        System.out.println("Tak a bite");
    }

    @Override
    public void cleanUp() {
        System.out.println("Eat 'em all");
    }
}
