import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FunctionalTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void noX() {
    }

    @org.junit.jupiter.api.Test
    void square() {
        List<Integer> test = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Functional func = new Functional();
        test.add(1);
        test.add(2);
        test.add(3);

        result.add(1);
        result.add(4);
        result.add(9);
        assertEquals(result, func.square(test));
    }
}