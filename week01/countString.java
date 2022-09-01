import java.util.StringTokenizer;

/**
 * countString
 */
public class countString {

    public static int count(String s, String t){
        StringTokenizer st = new StringTokenizer(s);
        int d=0;
        while (st.hasMoreTokens()){
            if (st.nextToken().equalsIgnoreCase(t)) d++;
        }
        return d;
    }
    public static void main(String[] args) {
        System.out.println(count("A b c d d d d ","d"));
    }
}