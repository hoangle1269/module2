package StrategyPattern;

import java.io.FileWriter;
import java.io.IOException;

public class XMLStorage implements UserStorage {
    @Override
    public void store(User user) {
        try (FileWriter writer = new FileWriter("user.xml")) {
            writer.write("<user>\n");
            writer.write("  <name>" + user.getName() + "</name>\n");
            writer.write("  <age>" + user.getAge() + "</age>\n");
            writer.write("</user>\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

