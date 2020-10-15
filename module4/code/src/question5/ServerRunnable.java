package question5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerRunnable implements Runnable{
    private Socket s;

    public ServerRunnable(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        BufferedReader br = null;
//        PrintStream ps = null;
        String message = null;
        try {
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//            ps = new PrintStream(s.getOutputStream());

            while (true){
                String s1 = br.readLine();
                message = s.getPort() + ":\n" + s1;
//                System.out.println(message);

                if ("bye".equalsIgnoreCase(s1)){
                    System.out.println(s.getPort() + "已下线");
                    break;
                }
            }
//            ps.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            if (null != ps){
//                ps.close();
//            }
            if (null != br){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
