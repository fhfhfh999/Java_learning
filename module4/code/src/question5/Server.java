package question5;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class Server {
    static volatile List<Socket> clients = new ArrayList(10); // 该数组用于保存client
    static volatile Queue<String> messages = new LinkedList<>();
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;
        int number = 0;
        try {
            ss = new ServerSocket(9000);
            while(true) {
                s = ss.accept();
                System.out.println("客户端" + s.getPort() + "连接成功");
                clients.add(s);
//                System.out.println(clients);
                new Thread(new AcceptMessage(s)).start();
                new Thread(new SendMessage()).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
