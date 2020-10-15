package question4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;
        ObjectInputStream objectInputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            ss = new ServerSocket(8888);
            s = ss.accept();
            objectInputStream = new ObjectInputStream(s.getInputStream());// 用于从客户端接收消息
            objectOutputStream = new ObjectOutputStream(s.getOutputStream());// 用于向客户端发送消息
            Object object = objectInputStream.readObject();// 接收
            if (object instanceof UserMessage){
                UserMessage userMessage = (UserMessage)object;// 接收到的消息
                if (userMessage.getUser().getName().equals("admin")
                        && userMessage.getUser().getPassword().equals("123456")){
                    userMessage.setType("success");
                }else {
                    userMessage.setType("fail");
                }
                objectOutputStream.writeObject(userMessage);// 发送
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (null != objectOutputStream){
                try{
                    objectOutputStream.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != objectInputStream){
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != s){
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != ss){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
