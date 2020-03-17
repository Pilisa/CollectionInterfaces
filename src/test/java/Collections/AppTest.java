package Collections;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private double expected;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    private void assertTrue(boolean b) {
    }


    @Test
    public void Collection() {
        LinkedHashSet<Object> collectionColor = new LinkedHashSet<Object>();
        collectionColor.add("Set red");
        collectionColor.add("Map Green");
        collectionColor.add("List Pink");
        assertTrue(collectionColor.contains("Map Green"));
      //  assertEquals("Number of Collections ",expected 4, actual 4);

    }

   // private void assertTrue(void map_green) {
   // }

    // private void assertTrue(void map_green) {
   // }

    @Test
    public  void List() {
        List<String> students = new ArrayList<>();
        students.add("Pilisa Gqokoma");
        students.add("Anathi Jack");
        students.add("Lindisipho Koyo");
       // assertTrue(students.contains("Modi Mabilietse"));
    }
    @Test
    public  void Set() {
        Set<String> plates = new HashSet<>();
        plates.add("Side plate");
        plates.add("Bowl");
        plates.add("Mugs");

       // assertTrue(plates.contains("Mugs"));
    }
    @Test
    public void Map() {
        Map<String, String> mapA = new HashMap<>();
        mapA.put("key1", " Element1");
        mapA.put("key2", " Element2");
        mapA.put("key3 ", "Element3");
        assertTrue(mapA.containsValue("Key2"));
        assertEquals(("Key2"), true, mapA);
    }
}

