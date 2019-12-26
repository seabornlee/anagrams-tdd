import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class Anagrams {
    public static List<String> of(String input) {
        if (input.length() == 1) {
            return asList(input);
        }

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            List<String> list = of(remove(input, i));
            for (String s : list) {
                result.add(input.charAt(i) + s);
            }
        }
        return result;
    }

    private static String remove(String input, int index) {
        return new StringBuilder(input).deleteCharAt(index).toString();
    }

}
