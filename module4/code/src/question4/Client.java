package question4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Socket s = null;
        Scanner input = new Scanner(System.in);
        System.out.println("please input your username:");
        String username = input.next();
        System.out.println("please input your password:");
        String password = input.next();
        UserMessage userMessage = new UserMessage("check", new User(username, password));
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;
        try{
            s = new Socket("127.0.0.1", 8888);
            objectOutputStream = new ObjectOutputStream(s.getOutputStream());// 用于向服务器发送消息
            objectInputStream = new ObjectInputStream(s.getInputStream());// 用于从服务器接收消息
            objectOutputStream.writeObject(userMessage);// 发送
            Object object = objectInputStream.readObject();// 接收
            if (object instanceof UserMessage){
                UserMessage returnedUserMessage = (UserMessage)object;// 从服务器获取的消息
                if(returnedUserMessage.getType().equals("success")){
                    System.out.println("登陆成功");
                }else {
                    System.out.println("登录失败");
                }
            }
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            if (null != objectInputStream){
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != objectOutputStream){
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != s){
                try{
                    s.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
