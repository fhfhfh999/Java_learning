package question2;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input the path of the file:");
        String file_path = input.next();
        File file = new File(file_path);
        delete(file);
    }

    private static void delete(File file){
        // delete the files
        for (File child :
                file.listFiles()) {
            if (child.isDirectory()) {
                delete(child);
            }
            child.delete();
            //if the file is not directory, delete directly
            //if is, delete file inside, then delete the directory
        }
    }
}
