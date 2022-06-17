package text_6_17;

import java.io.*;

public class zijieliu {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream("G:\\我的Java2.0\\bos.txt"));
        bos.write("hollw\n\r".getBytes());
        bos.write("word".getBytes());
        bos.close();
        BufferedInputStream fos=new BufferedInputStream(new FileInputStream("G:\\我的Java2.0\\bos.txt"));
        int s=0;
        while((s=fos.read())!=-1){
            System.out.print((char)s);
        }
    }
}
