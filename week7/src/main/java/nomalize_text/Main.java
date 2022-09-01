/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomalize_text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hoang Nghia
 */
public class Main {

    public static void main(String[] args) {
        List<String> total = new ArrayList<>();
        String path = "E:\\code\\Java\\Java_Lab\\week7\\document.txt";
        File file = new File(path);
        total = loadFromFile(file, total);
        for (String o : total) {
            o = nomalizeSting(o);
            System.out.println(o);
        }

    }

    static List<String> loadFromFile(File file, List<String> total) {
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String content;
            while ((content = br.readLine()) != null) {
                if (!content.trim().isBlank()) {
                    total.add(content.trim());
                }
            }
            br.close();
            fr.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return total;
    }

    static String nomalizeSting(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("\\ +", " ");
        str = str.replaceAll("\\ ,|,", ", ");
        str = str.replaceAll("\\ [.]|[.]", ". ");
        str = str.trim();
        str = str.replaceAll("\\ +", " ");
        char[] x = str.toCharArray();
        int count = 1;
        
        for (int i = 0; i < x.length - 2; i++) {
            if (x[i] == '.') {
                x[i + 2] = Character.toUpperCase(x[i + 2]);
            }

            if (x[i] == ':') {
                x[i + 2] = Character.toUpperCase(x[i + 2]);
            }

            x[0] = Character.toUpperCase(x[0]);

            if (x[i] == '"') {
               
                if (count%2!=0 && Character.isWhitespace(x[i+1])) {
                    x[i+1]='=';
                    count++;
                   
                } else{
                    if (count%2==0 && Character.isWhitespace(x[i-1])) {
                        x[i-1]='=';
                        count++;
                        
                    }
                }

              
            }

        }
        str = String.valueOf(x);
      
        str = str.replaceAll("\"[=]", "\"");
        str = str.replaceAll("=\"", "\"");
        str = str.concat(".");
        str = str.replaceAll("\\..", ".");
        str = str.replaceAll("\\( ", " (");
        str = str.replaceAll(" \\)", ")");

        return str;

    }

}
