import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    App app = new App();

    @Test
    public void testAddMe() {
        assertEquals(12, app.addMe(11, 1), 0.01);
    }

    @Test
    public void testSubMe() {
        assertEquals(10, app.subMe(11, 1), 0.01);
    }
}
