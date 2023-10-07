package io;

import java.io.Serializable; // Serializable 메소드가 하나도없는 인터페이스 -> 마크인터페이스

public class User implements Serializable {
    // user가 가지고있는 field들은 Serializable를 상속받으므로 모두 직렬화가 가능.
    private String email;
    private String name;
    private int birthYear;

    public User(String email, String name, int birthYear) {
        this.email = email;
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
