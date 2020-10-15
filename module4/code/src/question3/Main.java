package question3;


import java.io.*;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static volatile int finish = 0;
    private static BufferedOutputStream bout = null;
    private static BufferedInputStream bin = null;
    private static ExecutorService executorService = Executors.newFixedThreadPool(2);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input the directory:");
        String file_path = input.next(); // the file waiting to be copied
        System.out.println("input the copy path:");
        String copy_path = input.next(); // the file where send
        copy(file_path, copy_path);


    }

    public static void copy(String file_path, String copy_path){
        try {
            File file = new File(file_path);
            for (File child : file.listFiles()) {
                if (child.isDirectory()) {
                    File copyed = new File(copy_path + "/" + child.getName());
                    copyed.mkdir();
                    copy(child.getAbsolutePath(), copy_path + "/" + child.getName());
                }else {
                    bin = new BufferedInputStream(new FileInputStream(child.getAbsolutePath()));
                    bout = new BufferedOutputStream(new FileOutputStream(copy_path + "/" + child.getName()));
                }
                executorService.execute(new copyFile(bin));
                executorService.execute(new saveFile(bout));
                finish = 0;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (null != bout){
                try {
                    bout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != bin){
                try {
                    bin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
