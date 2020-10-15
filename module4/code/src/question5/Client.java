package question5;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket s = null;
        try {
            s = new Socket("127.0.0.1", 8888);
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
