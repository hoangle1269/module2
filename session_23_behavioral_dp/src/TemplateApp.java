import TemplateMethod.Hamburger;
import TemplateMethod.Meal;
import TemplateMethod.Taco;

public class TemplateApp {
    public static void main(String[] args) {
        Meal meal1 = new Hamburger();
        meal1.doMeal();

        System.out.println();

        Meal meal2 = new Taco();
        meal2.doMeal();
    }
}
