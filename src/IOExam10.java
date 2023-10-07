import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IOExam10 {
    public static void main(String[] args) throws Exception{
        // 키보드로부터 한줄씩 입력받는다.
        // BufferedReader의 readLine()을 사용해야한다.
        // BufferedReader는 장식역활을 수행한다.

        // 키보드를 나타내는 것은 System.in - 주인공(어디서입력받을것이냐 어디서 쓸것이냐.) - InputStream

        // 이러한 코드들을 잘 사용하기 위해선 API를 한번쯤 다 읽어봐야함.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(line);
        br.close();
    }
}
