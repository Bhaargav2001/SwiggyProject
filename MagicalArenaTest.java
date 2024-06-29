import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MagicalArenaTest {
    private Player playerA;
    private Player playerB;

    @Before
    public void setUp() {
        playerA = new Player("Player A", 50, 5, 10);
        playerB = new Player("Player B", 100, 10, 5);
    }

    @Test
    public void testBattle() {
        MagicalArena.battle(playerA, playerB);
        assertTrue(playerA.getHealth() <= 0 || playerB.getHealth() <= 0);
    }
}

