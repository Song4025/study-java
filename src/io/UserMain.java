package io;

import java.util.List;

public class UserMain {
    public static void main(String[] args) {
        UserUI userUI = new UserUI();
        UserDAO userDAO = new UserDAO("tmp/users.dat");
        List<User> users =  userDAO.getUsers();
        while(true){
            int menuId = userUI.menu();
            if(menuId == 5){
                System.out.println("종료합니다.");
                userDAO.saveUser(users);
                break;
            } else if (menuId == 1) {
                User user = userUI.regUser();
                users.add(user);
                System.out.println("등록되었습니다.");
            } else if (menuId == 2) {
                userUI.printUserList(users);
            } else if (menuId == 3) {
                String email = userUI.inputEmail();
                int findIndex = -1;
                for(int i = 0; i < users.size(); i++){
                    User u = users.get(i);
                    if(u.getEmail().equals(email)){
                        findIndex = i;
                        break;
                    }
                }
                // findIndex가 존재한다면?
                if(findIndex != -1){
                    User updateUser = userUI.inputUser(email);
                    // 기존에 있던 정보를 지운다.
                    users.remove(findIndex);
                    users.add(updateUser);
                    System.out.println("수정되었습니다.");
                }else { // 수정할 정보를 찾지 못했다면
                    System.out.println("수정할 정보가 없습니다.");
                }
            }
        }
    }
}
