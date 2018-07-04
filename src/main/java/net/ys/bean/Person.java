package net.ys.bean;

import java.io.Serializable;

/**
 * Date: 18-4-27
 *
 * @author NMY
 */
public class Person implements Serializable {

    private int id;

    private String userName;

    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
