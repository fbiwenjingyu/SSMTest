package com.shiyanlou.model;

public class User {
    private Integer id;       // �û� id
    private String username;  // �û���
    private String password;  // ����
    private String sex;       // �Ա�
    private Integer age;      // ����

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // ��д�� toString �������������Ĳ���
    public String toString() {
        return "id:" + id + ",username:" + username + ",password:" + password
                + ",sex:" + sex + ",age:" + age;

    }
}