import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnagramsTest {
    @Test
    public void test_blank() {
        assertTrue(Anagrams.of("").isEmpty());
    }

    @Test
    public void test_one_char() {
        String input = "a";
        List<String> result = Anagrams.of(input);
        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }

    @Test
    public void test_two_char() {
        String input = "ab";
        List<String> result = Anagrams.of(input);
        assertEquals(2, result.size());
        assertEquals("ab", result.get(0));
        assertEquals("ba", result.get(1));
    }

    @Test
    public void test_three_char() {
        String input = "abc";
        List<String> result = Anagrams.of(input);
        assertEquals(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba"), result);
    }
}
