import java.io.IOException;

public class fileTest {
    public static void main(String[] args) throws IOException {
        StreamFile sp = new StreamFile();
        sp.splitFile("D:\\music\\Tang-Anh-Cho-Co-Ay-Huong-Giang.mp3", "D:\\music\\",6 );
//        JoinFile cs = new JoinFile();
//        JoinFile.joinFile("D:\\music\\Tang-Anh-Cho-Co-Ay-Huong-Giang.mp3.1");
    }
}
