package question3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;

public class copyFile implements Runnable{

    private BufferedInputStream bin;

    public copyFile(BufferedInputStream bin){
        this.bin = bin;
    }

    @Override
    public void run() {
        byte[] bArr = new byte[1024];
        int res = 0;
        while(Main.finish != -1){
            try {
                Main.finish = bin.read(bArr, 0, res);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
