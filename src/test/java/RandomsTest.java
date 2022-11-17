import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomsTest {

    protected Randoms randoms;

    @BeforeEach
    void setUp() {
        randoms = new Randoms(20, 20);
        System.out.println("Вызываюсь перед тестом");
    }

    @Test
    void iterator() {
        Assertions.assertEquals(20, randoms.iterator().next());
    }
}