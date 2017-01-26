
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ShoppingListTest.
 *
 * @author  Barne Kleinen
 */
public class ShoppingListTest
{
    ShoppingList list;
    /**
     * Default constructor for test class ShoppingListTest
     */
    public ShoppingListTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        list = new ShoppingList();
    }

    @Test
    public void testList(){
        list.add(new Item("Garlic"));
        list.add(new Item("Onions"));
        list.add(new Item("Eggs"));
        list.add(new Item("Nuts"));
        list.add(new Item("Hummus"));
        String expected = "Garlic\nOnions\nEggs\nNuts\nHummus\n";
        assertEquals(expected,list.getList());
    }
}
