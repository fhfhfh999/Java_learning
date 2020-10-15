package question5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Socket s = null;
        Scanner input = null;
        PrintStream ps = null;
        BufferedReader br = null;
        try {
            s = new Socket("127.0.0.1", 9000);
            input = new Scanner(System.in);
            ps = new PrintStream(s.getOutputStream());
            br = new BufferedReader((new InputStreamReader(s.getInputStream())));
            while (true) {
                System.out.println("请输入对话内容");
                String str1 = input.next();
                ps.println(str1);
                String str2 = br.readLine();
                System.out.println(str2);
                if ("bye".equalsIgnoreCase(str1)){
                    System.out.println("已下线");
                    Server.clients.remove(s);
                    break;
                }
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
        }
    }
}
