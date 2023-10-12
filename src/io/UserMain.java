package io;

import java.util.List;

public class UserMain {
    public static void main(String[] args) {
        UserUI userUI = new UserUI();
        UserDAO userDAO = new UserDAO("tmp/users.dat");
        UserService userService = new UserServiceInMemory(userDAO.getUsers());
        while(true){
            int menuId = userUI.menu();
            if(menuId == 5){
                System.out.println("종료합니다.");
                userDAO.saveUser(userService.getUsers());
                break;
            } else if (menuId == 1) {
                User user = userUI.regUser();
                userService.addUser(user);
                System.out.println("등록되었습니다.");
            } else if (menuId == 2) {
                userUI.printUserList(userService.getUsers());
            } else if (menuId == 3) {
                String email = userUI.inputEmail();
                boolean siFindEmail = userService.exists(email);

                // findIndex가 존재한다면?
                if(siFindEmail){
                    User updateUser = userUI.inputUser(email);
                    userService.updateUser(updateUser);
                    System.out.println("수정되었습니다.");
                }else { // 수정할 정보를 찾지 못했다면
                    System.out.println("수정할 정보가 없습니다.");
                }
            } else if (menuId == 4) {
                String email = userUI.inputEmail();
                boolean siFindEmail = userService.exists(email);
                if(siFindEmail){
                    userService.deleteUser(email);
                    System.out.println("삭제하였습니다.");
                }
                else{
                    System.out.println("삭제할 회원 정보가 없습니다.");
                }
            }
        }
    }
}
