package Path;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Menu {
    public static int menu(){
        System.out.println("==============File processing=============");
        System.out.println("1.Check path");
        System.out.println("2. Get file name with type java");
        System.out.println("3. Get the file greater than size input");
        System.out.println("4. Write more content to file");
        System.out.println("5. Read file and count character ");
        System.out.println("6. Exit");
        System.out.println("\nEnter your choice:");
        int choice= Validation.checkInputIntLimit(1, 6);
        return choice;
    }
}
