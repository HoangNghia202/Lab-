
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * countString
 */
public class countString {

    public static void count(String s){
        StringTokenizer st = new StringTokenizer(s);
        HashMap<String, Integer> hm = new HashMap<>();
        while (st.hasMoreTokens()){
            String t = st.nextToken();
            if (!hm.containsKey(t)) hm.put(t, 1);
                else hm.put(t, hm.get(t)+1);
        }
        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            System.out.println(key + " - " + hm.get(key));
        }
    }
    public static void main(String[] args) {
        count("A b c d d d d");
    }
}