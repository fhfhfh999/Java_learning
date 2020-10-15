package question5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class AcceptMessage implements Runnable{
    private Socket s;

    public AcceptMessage(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        BufferedReader br = null;
        String message;
        try {
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            while (true){
                String s1 = br.readLine();
                message = s.getPort() + ":" + s1;
                Server.messages.add(message);

                if ("bye".equalsIgnoreCase(s1)){
                    System.out.println(s.getPort() + "已下线");
                    Server.clients.remove(s);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
