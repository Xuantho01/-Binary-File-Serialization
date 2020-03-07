import java.io.*;
public class JoinFile {
    public static boolean joinFile(String source) throws FileNotFoundException, IOException{

        String sourceFile = source.substring(0, source.lastIndexOf('.'));
        File file = new File(sourceFile);
        InputStream is;
        int count = 1;


        OutputStream os = new FileOutputStream(file);
        while (true){
            String path = file + "." + count;
            File eachFile = new File(path);
            if (eachFile.exists()){
                is = new FileInputStream(eachFile);
                int i = 0;
                byte[] arr = new byte[1024];
                while ((i = is.read(arr)) != -1){
                    os.write(arr, 0, i);
                }
                os.flush();
                is.close();
                count++;
                break;
            }else {
                System.out.println("file ko ton tai");
                break;
            }
        }
        os.close();
        return false;
    }
}
