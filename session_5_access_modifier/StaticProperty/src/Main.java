public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car car1 = new Car("Mazda6", "Skyactiv");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Subaru Forester", "Boxer");
        System.out.println(Car.numberOfCars);

    }
}