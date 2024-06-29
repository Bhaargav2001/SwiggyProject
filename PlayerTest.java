import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
    private Player playerA;
    private Player playerB;

    @Before
    public void setUp() {
        playerA = new Player("Player A", 50, 5, 10);
        playerB = new Player("Player B", 100, 10, 5);
    }

    @Test
    public void testPlayerCreation() {
        assertEquals("Player A", playerA.getName());
        assertEquals(50, playerA.getHealth());
        assertEquals(5, playerA.getStrength());
        assertEquals(10, playerA.getAttack());
    }

    @Test
    public void testPlayerAlive() {
        assertTrue(playerA.isAlive());
        playerA.defend(100);
        assertFalse(playerA.isAlive());
    }

    @Test
    public void testAttackAndDefend() {
        // Mocking random dice rolls
        playerA.attack(playerB);
        assertTrue(playerB.getHealth() <= 100);
        
        playerB.attack(playerA);
        assertTrue(playerA.getHealth() <= 50);
    }
}

