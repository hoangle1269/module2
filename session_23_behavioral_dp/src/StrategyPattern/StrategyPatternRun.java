package StrategyPattern;

public class StrategyPatternRun {
    public static void main(String[] args) {
        UserStorage xmlStorage = new XMLStorage();
        UserController userController1 = new UserController(xmlStorage);

        User user1 = new User("Alice", 30);
        userController1.store(user1);

        UserStorage mySQLStorage = new MySQLStorage();
        UserController userController2 = new UserController(mySQLStorage);

        User user2 = new User("Bob", 25);
        userController2.store(user2);

    }
}
