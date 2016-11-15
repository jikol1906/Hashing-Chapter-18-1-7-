import java.util.Arrays;

/**
 * Created by borisgrunwald on 08/10/2016.
 */
public class Main {

    public static void main(String[] args) {

        HashIntSet h = new HashIntSet();
        HashIntSet h2 = new HashIntSet();

        h.add(2);
        h.add(3);
        h.add(4);


        h2.add(9);
        h2.add(3);
        h2.add(6);


        int[] i = h.toArray();

        System.out.println(Arrays.toString(i));





    }

}
