package Path;

import java.io.IOException;

public class Main {
  

    public static void main(String[] args) throws IOException {
        Handle_file hfile = new Handle_file();
        while (true) {
            int choie = Menu.menu();
            switch (choie) {
                case 1:
                    System.out.println("------------Check path------------");
                    hfile.checkPath();
                    break;
                case 2:
                    System.out.println("---------Get the name with the type java---------");
                    hfile.findJavaFile();;
                    break;
                case 3: 
                    System.out.println("---------------Get the file greater than size input---------------");
                   hfile.fileLager();
                    break;
                case 4:
                    System.out.println("---------------Write more content to file---------------");
                    hfile.addContent();
                    break;
                case 5:
                    System.out.println("---------- Read file and count character-------------");
                    hfile.readAndCount();
                    break;
                case 6:

                    break;

            }
        }

    }

    // static void findJavaFile(File file) {
    // if (file.isDirectory()) {
    // File[] list = file.listFiles();
    // int count = 0;

    // for (File file2 : list) {
    // if (file2.isFile()) {
    // String getPath = file2.getAbsolutePath();
    // String getEx = getPath.substring(getPath.lastIndexOf("."));
    // if (getEx.equalsIgnoreCase(".java")) {
    // System.out.println(file2);
    // count++;
    // }

    // }
    // }

    // if (count > 0) {
    // System.out.println("Have " + count + " file have extension '.java'");
    // } else {
    // System.out.println("Result 0 file");
    // }

    // } else {
    // System.out.println("Path is not a directory");
    // }
    // }

    // static void addContent(File path) throws IOException {
    // if (path.exists()) {
    // if (path.isFile()) {
    // String content = sc.nextLine();
    // FileWriter fw = new FileWriter(path, true);
    // fw.write(content);
    // fw.close();
    // } else {
    // System.out.println("path is not a file");
    // return;
    // }
    // } else {
    // System.out.println("path does not exist");
    // }
    // }

    // static void readAndCount(File file) throws IOException {
    // if (file.exists()) {
    // FileReader fr = new FileReader(file);
    // BufferedReader br = new BufferedReader(fr);
    // String readLine;
    // String result = "";
    // while ((readLine = br.readLine()) != null) {
    // System.out.println(readLine + "sign");
    // result = result.concat(" " + readLine);
    // }
    // br.close();
    // fr.close();
    // String words[] = result.split("\\s");
    // int count = 0;
    // for (String w : words) {
    // System.out.println(w);
    // count = count + 1;
    // }
    // // do co gia tri null nen count se lon hon 1 don vi
    // System.out.println(count - 1);
    // } else {
    // System.out.println("Path does not exist");
    // }

    // }

    // static void fileLager(File file) {
    // if (file.exists()) {
    // System.out.println("Enter size(KB): ");
    // int size = sc.nextInt(); // size la byte
    // if (file.isDirectory()) {
    // File[] list = file.listFiles();
    // int count = 0;

    // for (File file2 : list) {
    // if (file2.isFile() && file2.length() / 1024 > size) { // doi sang
    // KB(byte/1024)
    // String getPath = file2.getAbsolutePath();
    // String getFileName = getPath.substring(getPath.lastIndexOf("\\") + 1);
    // System.out.println(getFileName);
    // count++;
    // }
    // }
    // System.out.println(count+" file greater than "+size);

    // }
    // }else{
    // System.out.println("Path doesn’t exist");
    // }

    // }

}
