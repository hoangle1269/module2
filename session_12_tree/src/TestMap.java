import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Sonia", 29);
        hashMap.put("Steve", 28);
        hashMap.put("SSS", 15);
        hashMap.put("SS", 45);
        hashMap.put("S", 39);

        System.out.println("Display entries in Hashmap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Smith", 30);
        treeMap.put("Sonia", 29);
        treeMap.put("Steve", 28);
        treeMap.put("SSS", 15);
        treeMap.put("SS", 45);
        treeMap.put("S", 39);
        System.out.println("Display in ascending order");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("King", 30);
        linkedHashMap.put("Lee", 34);
        linkedHashMap.put("Kingston", 50);
        linkedHashMap.put("Aus", 4);
        linkedHashMap.put("Asus", 33);
        System.out.println("King's age: " + linkedHashMap.get("Lee"));


    }
}
