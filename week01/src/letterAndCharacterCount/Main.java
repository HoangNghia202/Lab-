package letterAndCharacterCount;
import manageGeography.Validation;

public class Main {
    public static void main(String[] args) {
        List_letter lsLt= new List_letter();
        Count_character lschar= new Count_character();
        String s;
        System.out.print("Enter String:");
        s=Validation.checkInputString().toLowerCase();

        System.out.println("================================================================");
        lschar.characterCount(s);
        lsLt.add(s);
        lsLt.displayLetter();

    }
}
