import java.util.HashMap;
import java.util.Map;

public class TSum {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
//        put(data add)
        map.put("Nargis", 21);
        map.put("Ankit",23);
        map.put("Suraj",22);

//        get(retrieve data)
        System.out.println(map.get("Nargis"));//value
        System.out.println(map.containsKey("Ankit")); //true
        System.out.println(map.containsValue(21));//true
        System.out.println(map.containsKey("Arpita"));//false
        System.out.println(map.size());//2

//        iteration

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}
