package question5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class SendMessage implements Runnable{

    @Override
    public void run() {
        PrintStream ps = null;
        String message;

        while (true) {
            if (!Server.messages.isEmpty()){
                message = Server.messages.poll();
                if (!Server.clients.isEmpty()){
                    for (Socket s :
                            Server.clients) {
                        try {
                            ps = new PrintStream(s.getOutputStream());
                            ps.println(message);
                            System.out.println(message);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }


        }


    }
}
