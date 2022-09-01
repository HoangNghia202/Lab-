package letterAndCharacterCount;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class List_letter {
    List <Count_letter> lsLetter= new ArrayList<>();

    public List_letter() {
    }

    private int  findSameLetter(String letter){

        if (lsLetter.isEmpty()) {
            return -1;

        }
        for (int i = 0; i < lsLetter.size(); i++) {
            if (letter.equalsIgnoreCase(lsLetter.get(i).getS())) {
                return i;
            } 
        }
        return-1;
    }
    
    public void add (String s){
        StringTokenizer stk = new StringTokenizer(s," ");
        while (stk.hasMoreTokens()) {
           
            String letter= stk.nextToken().trim().toLowerCase();

            for ( char i = 33; i <=46; i++) {
               String str= new String(i+" ");
               str= str.trim();
              if(letter.contains(str)){
                  letter=letter.replace(str, "");
              }
            }

            for ( char i = 33; i <=46; i++) {
                String str= new String(i+" ");
                str= str.trim();
               if(letter.contains(str)){
                   letter=letter.replace(str, "");
               }
            }

            for ( char i = 58; i <=64; i++) {
                String str= new String(i+" ");
                str= str.trim();
               if(letter.contains(str)){
                   letter=letter.replace(str, "");
               }
            }

            for ( char i = 90; i <=96; i++) {
                String str= new String(i+" ");
                str= str.trim();
               if(letter.contains(str)){
                   letter=letter.replace(str, "");
               }
            }


            for ( char i = 123; i <=126; i++) {
                String str= new String(i+" ");
                str= str.trim();
               if(letter.contains(str)){
                   letter=letter.replace(str, "");
               }
            }

          
           
            int index= findSameLetter(letter);
            if ( index==-1) {
                int qlt= 1;
                lsLetter.add(new Count_letter(letter, qlt));
            } else{
                lsLetter.set(index, new Count_letter(letter, lsLetter.get(index).getQuality()+1 ));
            }
        }

    }

    public void displayLetter(){
        if (lsLetter.isEmpty()) {
            System.out.println("Empty!");
        }
        System.out.print("{");
        for (Count_letter o : lsLetter) {
            System.out.print(o+", ");
        }
        System.out.println("}");
    }

    

    
    
    
}
