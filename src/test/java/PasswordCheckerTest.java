import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @Test
    void numberOfMissingCharacters() {
        String[] arr = {"Ya3", "Ya3@", "aaaaaa", "YaA@1a", "BcC@aa"};
        int[] answers = {3, 2, 3, 0, 1};

        for (int i = 0; i < arr.length; i++) {
            assertEquals(answers[i], PasswordChecker.numberOfMissingCharacters(arr[i]));
        }
    }
}