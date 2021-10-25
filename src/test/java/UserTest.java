import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class UserTest {

    private User user;
    private User user2;

    @Before
    public void beforeTest() {
        user = new User(
                "jllys@gmail.com",
                "Jean-Luc",
                "LYS",
                LocalDate.of(1997, 11, 30)
        );

        user2 = new User(
                "test",
                "Test",
                "TEST",
                LocalDate.of(2012, 11, 30)
        );
    }

    @Test
    public void testAge() {
        assertTrue(this.user.ageMoreThan13());
    }

    @Test
    public void testEmail() {
        assertTrue(this.user.checkEmail());
    }

    @Test
    public void testName() {
        assertTrue(this.user.nameNotEmpty());
    }

    @Test
    public void testUserIsValid() {
        assertTrue(this.user.isValid());
    }



}
