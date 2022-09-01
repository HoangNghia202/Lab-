package Path;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Handle_file {
  
    public void checkPath(){
        System.out.print("Enter path: ");
        String path = Validation.checkInputString();
        File file = new File(path);
        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println("path to directory");
            }
            if (file.isFile()) {
                System.out.println(" path to File");
            }
        } else {
            System.out.println("not exit");
        }
    }
    
    public void findJavaFile() {
        System.out.print("Enter path: ");
        String path= Validation.checkInputString();
        File file= new File(path);
        if (file.isDirectory()) {
            File[] list = file.listFiles();
            int count = 0;

            for (File file2 : list) {
                if (file2.isFile()) {
                    String getPath = file2.getAbsolutePath();
                    String getEx = getPath.substring(getPath.lastIndexOf("."));
                    if (getEx.equalsIgnoreCase(".java")) {
                       
                        String getFileName = getPath.substring(getPath.lastIndexOf("\\") + 1);
                        System.out.println(getFileName);
                        count++;
                    }

                }
            }

            if (count > 0) {
                System.out.println("Have " + count + " file have extension '.java'");
            } else {
                System.out.println("Result 0 file");
            }

        } else {
            System.out.println("Path is not a directory");
        }
    }

    public void addContent() throws IOException {
        System.out.print("Enter path: ");
        String path= Validation.checkInputString();
        File file= new File(path);
        if (file.exists()) {
            if (file.isFile()) {
                String content =Validation.checkInputString();
                FileWriter fw = new FileWriter(file, true);
                fw.write(content);
                fw.close();
            } else {
                System.out.println("path is not a file");
                return;
            }
        } else {
            System.out.println("path does not exist");
        }
    }

    public void fileLager() {
        System.out.print("Enter path: ");
        String path= Validation.checkInputString();
        File file= new File(path);
        if (file.exists()) {
            System.out.println("Enter size(KB): ");
            int size = Validation.checkInputSize(); // size la byte
            if (file.isDirectory()) {
                File[] list = file.listFiles();
                int count = 0;

                for (File file2 : list) {
                    if (file2.isFile() && file2.length() / 1024 > size) { // doi sang KB(byte/1024)
                        String getPath = file2.getAbsolutePath();
                        String getFileName = getPath.substring(getPath.lastIndexOf("\\") + 1);
                        System.out.println(getFileName);
                        count++;
                    }
                }
                System.out.println(count+" file greater than "+size);

            }
        }else{
            System.out.println("Path doesn’t exist");
        }

    }

    public void readAndCount() throws IOException {
        System.out.print("Enter path: ");
        String path= Validation.checkInputString();
        File file= new File(path);
        if (file.exists()) {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String readLine;
            String result = "";
            while ((readLine = br.readLine()) != null) {
                System.out.println(readLine + "sign");
                result = result.concat(" " + readLine);
            }
            br.close();
            fr.close();
            String words[] = result.split("\\s");
            int count = 0;
            for (String w : words) {
                System.out.println(w);
                count = count + 1;
            }
            // do co gia tri null nen count se lon hon 1 don vi
            System.out.println(count - 1);
        } else {
            System.out.println("Path does not exist");
        }

    }

    
}
