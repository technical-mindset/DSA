import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String string = "Asad Zaidi";
        Map <Character, Integer> map = new Main().getRepeatValues(string);

        for (Map.Entry<Character, Integer> m: map.entrySet()) {
            System.out.print("Value: " + m.getKey().toString().toUpperCase() + ", Count: " + m.getValue() + "\n");
        }

    }

    public Map<Character, Integer> getRepeatValues(String string){
        Map<Character, Integer> map = new HashMap();

        for (int i = 0; i < string.length(); i++) {

                if (string.charAt(i) != ' ' && map.containsKey(string.toLowerCase().charAt(i))) {
                    map.put(string.toLowerCase().charAt(i), map.get(string.toLowerCase().charAt(i)) + 1);
                }
                else if(string.charAt(i) != ' ') {
                    map.put(string.toLowerCase().charAt(i), 1);
                }
            }


        return map;
    }
}
