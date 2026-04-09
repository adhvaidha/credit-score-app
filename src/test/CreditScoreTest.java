import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CreditScoreTest {

    @Test
    void testNormalCase() {
        assertEquals(702, CreditScore.calculateScore(2000, 0));
    }

    @Test
    void testHighScoreLimit() {
        assertEquals(850, CreditScore.calculateScore(2000000, 0));
    }

    @Test
    void testLowScoreLimit() {
        assertEquals(300, CreditScore.calculateScore(0, 50000));
    }

    @Test
    void testNegativeIncome() {
        assertEquals(0, CreditScore.calculateScore(-1000, 100));
    }
}