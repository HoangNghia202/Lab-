package Login_account;

import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;

import javax.xml.validation.Validator;

/**
 * LoginProgram
 */
public class LoginProgram {
    ResourceBundle resourceBundle;
    Locale local;

     void setLocal(String localCode){
        this.local=new Locale(localCode);
    }
     void setStringBundle(){
        this.resourceBundle= resourceBundle.getBundle("Login_account.message", this.local);
    }

     String getMessage(String key){
        return resourceBundle.getString(key);
    }

    private String checkAcc(){
        String acc;
        while (true) {
           System.out.println( getMessage("accInput"));
            acc=Validation.checkInputString();
            if(acc.matches("^\\d{10}$")){
                return acc;
            } else{
                System.out.println(getMessage("accError"));
            }
        }
         
    }


    private String checkPassWork(){
        String passWork;
        String validPass="(([a-zA-z]+)[0-9]+|[0-9]+([a-zA-z])+)";
        while (true) {
            System.out.println(getMessage("passWorkInput"));
            passWork=Validation.checkInputString();
            if (passWork.matches(validPass)) {
                return passWork;
            }else{
                System.out.println(getMessage("passWorkErr"));
            }
        }
    }




 
    

    private String createCapcha(){
        String capChaCreated;
        char[] arr={'Q','W','E','R','T','Y','U','I','O','P','1','2','3','4','5','6','7','8','9','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
        char[]cap= new char[6];
        Random generator= new Random();
        for (int i = 0; i < cap.length-1; i++) {
    
            cap[i]=arr[generator.nextInt(arr.length-1)];
        }
          capChaCreated=String.valueOf(cap);
          return capChaCreated;
        
    }

    private String checkCapcha(){
        String capchaInput;
        while (true) {
            String capcha= createCapcha();
            System.out.print(getMessage("capcharInput"));
            System.out.println(capcha);
            System.out.println("Enter capcha: ");
            capchaInput= Validation.checkInputString();
            if (capchaInput.equalsIgnoreCase(capcha)) {
                return capchaInput;
            }else{
                System.out.println(getMessage("Captcha incorrect"));
                System.out.println( "Enter capcha again.");
            }

        }
    }

    public void login(String localCode){
        setLocal(localCode);
        setStringBundle();
        checkAcc();
        checkPassWork();
        checkCapcha();
        System.out.println("Check successful");
    }



    
    
}