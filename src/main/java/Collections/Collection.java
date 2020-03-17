package Collections;

import java.util.*;

public class Collection {

    public static void main(String[] args) {
        Collection c = new Collection();
        c.Collection();
        c.arrayList();
        c.hashSet();
        c.hashMap();


    }

    public void Collection() {
        Collection collectionColor = new Collection();
        collectionColor.add("Set red ");
        collectionColor.add("Map orange ");
        collectionColor.add("List green ");
        System.out.println("Collection sets: " + collectionColor);

    }

    void add(String set_red) {
    }

    public static void arrayList() {
        List<String> students = new ArrayList<>();
        students.add("Pilisa Gqokoma");
        students.add("Anathi Jack");
        students.add("Modi Mabilietse");
        System.out.println("3rd year students 2020 " + students + "\n");

        students.remove("Anathi Jack");
        System.out.println("2020 3rd years" + students + "\n");
    }

    //set interface
    public void hashSet() {
        Set<String> plates = new HashSet<>();
        plates.add("Side plate");
        plates.add("Bowl");
        plates.add("Mugs");
        System.out.println("Initial List of Plate set" + plates);
        plates.remove("Mugs");
        System.out.println("Updated List of Plate set " + plates);
    }

    //Map Interface
    public void hashMap() {
        Map<String, String> mapA = new HashMap<>();
        mapA.put("key1", " Element1");
        mapA.put("key2", " Element2");
        mapA.put("key3 ", "Element3");
        System.out.println("Initial list of elements:");
        for (Map.Entry m : mapA.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements:");
        mapA.remove("key2", " Element2");
        for (Map.Entry m : mapA.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    public void contains(String map_green) {

    }
}