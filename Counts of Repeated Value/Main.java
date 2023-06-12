import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Integer[] in = {1,2,4,1,5,7,1,6,2,7,3,4,8,0,9};
        Map <Integer, Integer> map = new Main().getRepeatValues(in);

        for (Map.Entry<Integer, Integer> m: map.entrySet()) {
            System.out.print("Value: " + m.getKey() + ", Count: " + m.getValue() + "\n");
        }

    }

    public Map<Integer, Integer> getRepeatValues(Integer [] arr){
        Map<Integer, Integer> map = new HashMap();

        for (Integer integer: arr) {
            if (map.containsKey(integer)) {
                map.put(integer, map.get(integer) + 1);
            }
            else {
                map.put(integer, 1);
            }
        }

        return map;
    }
}
