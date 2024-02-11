package dev.mark;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class IteratorTest {

    @Test
    void testName() {
        Iterator iterator = new Iterator(3);

        assertThat(iterator.printMultTable(iterator.getSelectedNumber()), is("3 x 1 = 3" + "\n" + "3 x 2 = 6" + "\n" + "3 x 3 = 9" + "\n" + "3 x 4 = 12" + "\n" + "3 x 5 = 15" + "\n" + "3 x 6 = 18" + "\n" + "3 x 7 = 21" + "\n" + "3 x 8 = 24" + "\n" + "3 x 9 = 27" + "\n" + "3 x 10 = 30"));
    }
}
