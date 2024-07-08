package TemplateMethod;

public abstract class Meal {

    public final void doMeal() {
        prepareIngredients();
        cook();
        eat();
        cleanUp();
    }

    public abstract void prepareIngredients();

    public abstract void cook();

    public void eat() {
        System.out.println("Devour this");
    }

    public abstract void cleanUp();

}
