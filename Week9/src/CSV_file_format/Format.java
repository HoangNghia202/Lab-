package CSV_file_format;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Format {
    static Scanner sc = new Scanner(System.in);
    List <CSV> list= new ArrayList<>();
    File file= null;

    public void importFile(){
        System.out.println("--------- Import CSV -------");
        System.out.print("Enter path: ");
        String path = sc.nextLine().trim();
         file = new File(path);
        if (!file.exists()) {
            System.out.println("Path not exist");
            return;
        }

        FileReader fr = null;
        try {
            fr= new FileReader(file);
            BufferedReader br= new BufferedReader(fr);
            String detail;
            while ((detail= br.readLine())!=null) {
                StringTokenizer stk= new StringTokenizer(detail, ",");
                String ID= stk.nextToken().trim();
                String Name= stk.nextToken().trim();
                String email= stk.nextToken().trim();
                String phone= stk.nextToken().trim();
                String address= stk.nextToken().trim();
                list.add(new CSV(ID, Name, email, phone, address));
            }
            fr.close();
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage())     ;   }
        System.out.println("import successful");
    }

    private static String convertToUpperCase(String message) {
        // chuyen String thanh mang ki tu
        char[] charArray = message.toCharArray();
        boolean foundSpace = true;
        for (int i = 0; i < charArray.length; i++) {
            // neu phan tu trong mang la 1 chu cai
            if (Character.isLetter(charArray[i])) {
                if (foundSpace) {
                    // doi chu in hoa thanh chu thuong
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }
        // chuyen mang ki thu thanh string.
        message = String.valueOf(charArray);
        return message;
    }

    public void formatName(){
        System.out.println("--------- Format Name -------");
        for (CSV csv : list) {
           String name= csv.getName();
           name= name.replaceAll("\\ +", " "); 
           name= convertToUpperCase(name);
           csv.setName(name);
        }
        System.out.println("Format: done");
    }

    public void formatAddress(){
        System.out.println("-------- Format Address ------");
        for (CSV csv : list) {
            String address= csv.getAddress();
            address=address.replaceAll("\\ +", " ");
            address=convertToUpperCase(address);
            char[] c= address.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (c[i]=='-') {
                    c[i+1]=Character.toUpperCase(c[i+1]);
                }
            }
            String mess= String.valueOf(c);
            csv.setAddress(mess);
        }
        System.out.println("Format: Done");
    }

    public void exportCSV(){
        System.out.println("-------- Export CSV ------");
        FileWriter fw= null;
        try {
            fw= new FileWriter(file);
            PrintWriter pw= new PrintWriter(fw);
            for (CSV csv : list) {
                pw.println(csv.getID()+", "+ csv.getName()+", "+csv.getEmail()+", "+csv.getPhone()+", "+csv.getAddress());
            }

            fw.close();
            pw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Export: Done");
    }
    
}
