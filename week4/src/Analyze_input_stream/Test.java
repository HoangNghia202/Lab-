package Analyze_input_stream;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static HashMap<String, List<Integer>> numberAnalyze(String code) {
        List<Integer> number = new ArrayList<>();
        List<Integer> oddNumList = new ArrayList<>();
        List<Integer> EvenNumList = new ArrayList<>();
        List<Integer> squList = new ArrayList<>();

        code = code.replaceAll("\\s", "");
        code = code.replaceAll("\\D+", "-");
        String[] digits = code.split("-");
        for (String o : digits) {
            int num = Integer.parseInt(o);
            if (Math.sqrt(num) == (int) Math.sqrt(num)) {
                squList.add(num);
            }
            if (num % 2 == 0) {
                EvenNumList.add(num);
            } else {
                oddNumList.add(num);
            }
            number.add(num);
        }

        HashMap<String, List<Integer>> numHash = new HashMap<>();
        numHash.put("All Numbers", number);
        numHash.put("Odd numbers", oddNumList);
        numHash.put("Even numbers", EvenNumList);
        numHash.put("Perfect square", squList);

        for (String o : numHash.keySet()) {
            System.out.println(o + " " + numHash.get(o));
        }
        return numHash;
    }

    static HashMap<String, String> letterAnalyze(String code) {
        System.out.println("");
        String allCharacter;
        String upperCharacter;
        String lowerCharacter;
        String specialCharacter;

        code = code.replaceAll("\\s", "");
        allCharacter = code.replaceAll("\\d", "");
        specialCharacter = allCharacter.replaceAll("\\w", "");
        String words = allCharacter.replaceAll("\\W", "");
        upperCharacter = words.replaceAll("[a-z]", "");
        lowerCharacter = words.replaceAll("[A-Z]", "");

        HashMap<String, String> charHash = new HashMap<>();
        charHash.put("Upper characters", upperCharacter);
        charHash.put("Lower characters", lowerCharacter);
        charHash.put("Special charactesr", specialCharacter);
        charHash.put("All characters", allCharacter);

        for (String o : charHash.keySet()) {
            System.out.println(o + ": " + charHash.get(o));
        }
        return charHash;
    }

    public static void main(String[] args) {
        System.out.println("===== Analysis String program ====");
        
        System.out.println("-----Result Analysis------");
        String str = "321sdhkjDFGH!@#$%^22fd   sf3asd,4";
        numberAnalyze(str);
        letterAnalyze(str);
        

    }

}
