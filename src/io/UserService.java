package io;

import java.util.Iterator;

// 어디에 저장하고 실행할것이냐는 없음.
public interface UserService {

    // 회원정보를 등록하다.
    public void addUser(User user);

    // 회원정보를 수정하다. user.getEmail()에 해당하는 회원정보를 수정한다.
    public boolean updateUser(User user);

    // 회원정보를 삭제하다.
    public boolean deleteUser(String email);

    // 모든 회원정보를 반환하다.
    public Iterator<User> getUsers();

    // email에 해당하는 회원정보가 있을 경우 0이상의 값을 반환.
    public boolean exists(String email);



}
