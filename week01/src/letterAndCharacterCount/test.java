package letterAndCharacterCount;

import java.util.StringTokenizer;

public class test {

    public void disPlay( String s){
        StringTokenizer stk= new StringTokenizer(s, "");
        while (stk.hasMoreTokens()) {
            System.out.println(stk.nextToken());
        }
    }
    public static void main(String[] args) {
        String a="Hoang nghia nguyen daxc";
        test t= new test();
        t.disPlay(a);
    }
}
