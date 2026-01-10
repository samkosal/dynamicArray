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

        String result = list.get(3);

        // replaced value at the from "orange" to "watermelon", should return "watermelon"
        assertEquals("watermelon", result);
    }

    @Test
    public void testRemove() {
        DynamicStringList list = new DynamicStringList();
        list.set(0, "apple");
        list.set(1, "banana");
        list.set(2, "cherry");
        list.set(3, "orange");
        

        String removed = list.remove(1);

        String result = list.get(3);

        // I think we implemented this wrong, idk
        assertEquals(null, result);
    }

    @Test
    public void testsize() {
        DynamicStringList list = new DynamicStringList();

        int result = list.size();

        // size of the actual list should be 4
        assertEquals(4, result);
    }

    // @Test
    // public void testcapacity() {
    //     DynamicStringList list = new DynamicStringList();

    //     int result = list.capacity();

    //     // this is temporary test, we need to get remove working before we can truly test capacity function.
    //     assertEquals(3, result);
    // }

    //TODO: "keeping going using this format ^, i can only do one, cuz i got work, ill be back to do more" -sam
}
