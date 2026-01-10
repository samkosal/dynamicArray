import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicStringListTest {

    //testing get function
    @Test
    public void testGetReturnsCorrectValue() {
        DynamicStringList list = new DynamicStringList();
        list.set(0, "apple");
        list.set(1, "banana");
        list.set(2, "cherry");
        list.set(3, "date");
        

        assertEquals("banana", list.get(1));
    }

    //TODO: "keeping going using this format ^, i can only do one, cuz i got work, ill be back to do more" -sam
}
