import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class IOExam11 {
    public static void main(String[] args) throws Exception{
        // 문제 : 사람이름, 국어, 영어, 수학점수를 파일에 저장하시오. 경로 tmp/score.dat
        String name = "Kim";
        int kor = 90;
        int eng = 50;
        int math = 70;
        double total = kor + eng + math;
        double avg = total / 3.0;

        DataOutputStream out = new DataOutputStream(new FileOutputStream("tmp/score.txt"));
        out.writeUTF(name);
        out.writeInt(kor);
        out.writeInt(eng);
        out.writeInt(math);
        out.writeDouble(total);
        out.writeDouble(avg);

        out.close();
    }
}
