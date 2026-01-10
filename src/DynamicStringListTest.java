import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicStringListTest {

    //testing get function
    @Test
    public void testGet() {
        DynamicStringList list = new DynamicStringList();

        String result = list.get(1);

        //created an empty list with nothing in it, result should be empty
        assertEquals(null, result);
    }

    @Test
    public void testSet() {
        DynamicStringList list = new DynamicStringList();
        list.set(0, "apple");
        list.set(1, "banana");
        list.set(2, "cherry");
        list.set(3, "orange");

        String result = list.get(1);

        // a list with values in it, should return "banana"
        assertEquals("banana", result);
    }

    @Test
    public void testAdd() {
        DynamicStringList list = new DynamicStringList();
        list.set(0, "apple");
        list.set(1, "banana");
        list.set(2, "cherry");
        list.set(3, "orange");

        list.add("watermelon");

        String result = list.get(4);

        // replaced value at the from "orange" to "watermelon", should return "watermelon"
        assertEquals("watermelon", result);
    }

    @Test
    public void testRemove() {
        DynamicStringList list = new DynamicStringList();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("orange");
        

        String removed = list.remove(1);

        String result = list.get(3);

        // I think we implemented this wrong, idk
        assertEquals(null, result);
    }

    @Test
    public void testsize() {
        DynamicStringList list = new DynamicStringList();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("orange");
        int result = list.size();

        // size of the actual list should be 4
        assertEquals(4, result);
    }

    @Test
    public void testCapacity(){
        //this test should return a capacity of 8
        StringList list = new DynamicStringList();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("orange");
        list.add("watermelon");

        int result = list.capacity();

        //after adding the 5th item, the list should have increased in size by 4 items
        assertEquals(8, result);
    }
}
