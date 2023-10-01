package string;

import java.util.HashMap;
import java.util.List;

public class WordQuestion {
    public static void main(String[] args) {
        String str = "update what will be committed";
        HashMap<Character, List<String>> map = new HashMap<>();
        String[] strArr = str.split(" "); // split with space
        for (String eachStr : strArr) {
            Character firstChar = eachStr.charAt(0);
            if (!map.containsKey(firstChar))
                map.put(firstChar, List.of(eachStr));
            else {
                List<String> values = map.get(firstChar);
                values.add(eachStr);
                map.put(firstChar, values);
            }
        }
    }
}
