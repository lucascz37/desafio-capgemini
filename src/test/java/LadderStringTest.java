import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LadderStringTest {

    @Test
    void createLadderN1() {
        assertEquals("*\n", LadderString.createLadder(1));
    }

    @Test
    void createLadderN4(){
        assertEquals("   *\n  **\n ***\n****\n", LadderString.createLadder(4));
    }
}