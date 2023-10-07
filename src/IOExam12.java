import java.io.*;

public class IOExam12 {
    public static void main(String[] args) throws Exception{
        // 문제 : 경로 tmp/score.dat 파일을 읽어들이시오.
        DataInputStream in = new DataInputStream(new FileInputStream("tmp/score.txt"));

        printStudent(in);
        printStudent(in);

        in.close();
    }

    private static void printStudent(DataInputStream in) throws IOException {
        String name = in.readUTF();
        int kor = in.readInt();
        int eng = in.readInt();
        int math = in.readInt();
        double total = in.readDouble();
        double avg = in.readDouble();

        System.out.println(name);
        System.out.println(kor);
        System.out.println(eng);
        System.out.println(math);
        System.out.println(total);
        System.out.println(avg);

    }
}
