import java.io.*;

public class StreamFile {
    public boolean splitFile(String source, String dest, int numberFile) throws IOException{

        File sourceFile = new File(source);

         if (sourceFile.exists() && sourceFile.isFile()) {
            long sizeFile = sourceFile.length();
            long sizeSplitFile = (sizeFile / numberFile);

            InputStream is = new FileInputStream(sourceFile);

            byte[] arr = new byte[1000];
            for (int i = 1; i <= numberFile; i++) {
                int j = 0;
                long a = 0;
                OutputStream os = new FileOutputStream(dest + sourceFile.getName() + "." + i);
                while ((j = is.read(arr)) != -1) {
                    os.write(arr, 0, j);
                    a += j;
                    if (a >= sizeSplitFile) {
                        break;
                    }
                }
                os.flush();
                os.close();
            }
            is.close();
            return true;
        }else {
            System.out.println("file khong ton tai");
            return false;
        }
    }
}
