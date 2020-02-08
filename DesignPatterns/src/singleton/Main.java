package singleton;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> capitals = new HashMap<>();

        capitals.put("Sofia", 120000);
        capitals.put("Plovdiv", 80000);

        SingletonDataContainer instance = SingletonDataContainer.getInstance();
        System.out.println(instance.getPopulation(capitals, "Sofia"));
        SingletonDataContainer instance2 = SingletonDataContainer.getInstance();
        System.out.println(instance2.getPopulation(capitals, "Plovdiv"));
    }
}
