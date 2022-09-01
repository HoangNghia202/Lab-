package asd;

import java.io.File;

public class AnalyzedFilePath {
    static void checkInputPath() {
        System.out.println("================Analysis path program==============");
        System.out.print("Enter path: ");
        String path = Validation.checkInputString();
        File file = new File(path);
        if (file.exists() && file.isFile()) {
            System.out.println("------------- Result Analysis-----------");
            System.out.println("Disk: " + getDisk(path));
            System.out.println("Extension: " + getExtension(path));
            System.out.println("File Name: " + getFileName(path));
            System.out.println("Path: " + getPath(path));
            System.out.println("Folder: " + getFolder(path));
        } else {
            System.out.println("------------- Result Analysis-----------");
            System.out.println("Disk: " + getDisk(path));
            System.out.println("Extension: " + getExtension(path));
            System.out.println("File Name: " + getFileName(path));
            System.out.println("Path: " + getPath(path));
            System.out.println("Folder: " + getFolder(path));
            System.out.println("---> Path isn't a file");
        }
    }

    static String getPath(String path) {
        int nameFile = path.lastIndexOf("\\");
        return path.substring(0, nameFile-1);
    }

    static String getFileName(String path) {
        int from = path.lastIndexOf("\\") + 1;
        int to = path.lastIndexOf(".");
        return path.substring(from, to);
    }

    static String getExtension(String path) {
        int begin = path.lastIndexOf(".") + 1;
        return path.substring(begin);
    }

    static String getDisk(String path) {
        int end = path.indexOf("\\");
        return path.substring(0, end);
    }

    static String getFolder(String path) {
       
         String subPath = getPath(path);
         int begin= subPath.lastIndexOf("\\");
        return subPath.substring(begin+1);
    }

    public static void main(String[] args) {
        checkInputPath();
    }

    // C:\\Users\\Hoang Nghia\\Downloads\\hiragana.pdf

}
