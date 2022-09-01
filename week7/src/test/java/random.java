import java.util.Random;

public class random {
   public static void main(String[] args) {
       int n;
       Random ran= new Random();
       n=ran.nextInt(2);
       if (n==0) {
           System.out.println("0: chieu nay nghi hoc");
       } else{
           System.out.println("1: chieu nay di hoc");
       }
       
   } 
}
