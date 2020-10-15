package question3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;

public class saveFile implements Runnable{

    private BufferedOutputStream bout;

    public saveFile(BufferedOutputStream bout){
        this.bout = bout;
    }

    @Override
    public void run() {
        byte[] bArr = new byte[1024];
        int res = 0;
        while(Main.finish != -1){
            try {
                bout.write(bArr);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
