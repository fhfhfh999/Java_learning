import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Question3 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap();
        String s = "123,456,789,123,456";

        String[] s1 = s.split(",");
        for (String word : s1) {
            if (!map.containsKey(word)){
                map.put(word, 1);
            }else {
                int temp = map.get(word) + 1;
                map.put(word, temp);
            }
        }

//        System.out.println(map);
        Set<String> strings = map.keySet();
        for (String key :
                strings) {
            int value = map.get(key);
            System.out.println(key + "出现了" + value + "次");
        }
    }
}
