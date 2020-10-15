package question5;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Server {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;
        List<Socket> clients = new ArrayList(10); // 该数组用于保存client
        Queue Conversation = new ArrayDeque();// 该队列用于保存聊天内容
        PrintStream ps = null;
        try {
            while(true) {
                ss = new ServerSocket(8888);
                s = ss.accept();
                System.out.println("客户端" + s.getPort() + "连接成功");
                clients.add(s);
                new Thread(new ServerRunnable(s)).start();
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
