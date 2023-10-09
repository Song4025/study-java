package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
* 파일에서 List<User>정보를 저장하거나 읽어오는 기능.
*
* */
public class UserDAO {
    private String filename;

    public UserDAO(String filename) {
        this.filename = filename;
    }

    public void saveUser(List<User> list){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))){
            out.writeObject(list);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public List<User> getUsers(){
        File file = new File(filename);
        // 파일이 존재하지 않으면 비어있는 배열을 반환한다.
        if(!file.exists()){
            return new ArrayList<>();
        }

        List<User> list = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))){
            list = (List<User>)in.readObject();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return list;
    }

}
