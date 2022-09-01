package Analyze_input_stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Analyze {
    
     static HashMap <String, List<Integer>> numberAnalyze(String code){
        List<Integer> number= new ArrayList<>();
        List <Integer> oddNumList= new ArrayList<>();
        List <Integer> EvenNumList= new ArrayList<>();
        List<Integer> squList= new ArrayList<>();

        code=code.replaceAll("\\s", "");
        code=code.replaceAll("\\D", ".");
        String [] digit=code.split(".");
        for (String string : digit) {
            int num= Integer.parseInt(string);
            if (Math.sqrt(num)==(int)Math.sqrt(num)) {
                squList.add(num);
            }
            if (num%2==0) {
                EvenNumList.add(num);
            }else{
                oddNumList.add(num);
            }
            number.add(num);
        }

        HashMap <String, List<Integer>> numHash= new HashMap<>();
        numHash.put("Number", number);
        numHash.put("Odd number", oddNumList);
        numHash.put("Even number", EvenNumList);
        numHash.put("Square", squList);

        for (String o : numHash.keySet()) {
            System.out.println(o+" "+numHash.get(o));
        }
        return numHash;
    }
    public static void main(String[] args) {
        numberAnalyze("asddddddwasH123%%");
        
    }

    



}
