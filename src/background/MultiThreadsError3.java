package background;

import java.util.HashMap;
import java.util.Map;

/**
 * @author CoderZk
 */
public class MultiThreadsError3 {

    private Map<String, String> states;

    public MultiThreadsError3() {
        states = new HashMap<>();
        states.put("1", "11");
        states.put("2", "22");
        states.put("3", "33");
        states.put("4", "44");
    }

    public Map<String, String> getStates() {
        return states;
    }

    public static void main(String[] args) {
        MultiThreadsError3 multiThreadsError3 = new MultiThreadsError3();
        Map<String, String> states = multiThreadsError3.getStates();
        String s = states.get("1");
        System.out.println(s);
        states.remove("1");
        String s2 = states.get("1");
        System.out.println(s2);
    }
}
