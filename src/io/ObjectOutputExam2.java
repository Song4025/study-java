package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputExam2 {
    public static void main(String[] args) throws Exception {
        User user1 = new User("thdgus@gmail.com", "유유", 1525);
        User user2 = new User("thdgus@gmail.com", "미친", 1944);
        User user3 = new User("thdgus@gmail.com", "홍길동", 1990);
        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("tmp/userlist.dat"));
        out.writeObject(list);
        out.close();
    }
}