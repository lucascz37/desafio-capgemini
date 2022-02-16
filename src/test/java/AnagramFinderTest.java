import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramFinderTest {

    @Test
    void numberOfAnagrams() {
        String[] arr = {"ovo", "ifailuhkqq", "qq", "q", "port"};
        int[] answers = {2, 3, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            assertEquals(answers[i], AnagramFinder.numberOfAnagrams(arr[i]));
        }
    }
}