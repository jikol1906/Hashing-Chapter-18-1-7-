import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


/**
 * Created by borisgrunwald on 08/10/2016.
 */
public class test {

    HashIntSet h = new HashIntSet();
    HashIntSet h2 = new HashIntSet();
    HashIntSet h3 = new HashIntSet();

    @Before
    public void setUp() throws Exception {


        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);

        h2.add(6);
        h2.add(7);
        h2.add(8);
        h2.add(9);

        h3.add(2);
        h3.add(8);
        h3.add(4);
        h3.add(5);

    }

    @Test
    public void testRetainAll() throws Exception {

        h.retainAll(h3);

        assertEquals("[2, 4, 5]", h.toString());

    }

    @Test
    public void testEquals() throws Exception {

        HashIntSet h3 = new HashIntSet();

        h3.add(2);
        h3.add(3);
        h3.add(4);
        h3.add(5);

        assertEquals(true,h.equals(h3));

    }

    @Test
    public void testAddAll() {

        h.addAll(h2);

        assertEquals("[2, 3, 4, 5, 6, 7, 8, 9]", h.toString());



    }

}
