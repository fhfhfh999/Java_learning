package question1;


import java.io.*;
import java.util.List;

public class Save {

    public static void save(){
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("save.txt", false));
            objectOutputStream.writeObject(Function.Students);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null != objectOutputStream){
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void load(){
        ObjectInputStream objectInputStream = null;
        try{
            objectInputStream = new ObjectInputStream(new FileInputStream("save.txt"));
            Object obj = objectInputStream.readObject();
            if (obj instanceof List) Function.Students = (List<Student>) obj;
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            if (null != objectInputStream){
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
