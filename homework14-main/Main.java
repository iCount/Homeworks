import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("not Predator");
        Animal animal1 = new Animal("predator");
        Animal animal2 = new Animal("not Predator");
        Animal animal3 = new Animal("predator");
        Map<String, Animal> map = new HashMap();
        map.put("Animal",animal);
        map.put("Animal3",animal3);
        Animal animal5;
        map.put("Animal5",animal5);
        Animal animal8;
        map.put("Animal8",animal8);

        Map<String,Animal> map1 = new TreeMap<>();
        Map<String,Animal> map2 = new LinkedHashMap<>();

        map.forEach((k,v) -> {
            if (v.type == "Predator") {
                map1.put(k,v);
            }
            if (v.type == "NotPredator") {
                map2.put(k,v);
            }
        });
        map1.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " = " + entry.getValue());
        });
        System.out.println("-----");
        map2.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " = " + entry.getValue());
        });
    }
}