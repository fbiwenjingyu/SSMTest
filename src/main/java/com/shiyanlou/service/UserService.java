package com.shiyanlou.service;

import com.shiyanlou.model.User;

import java.util.List;

public interface UserService {

    /**
     * �û���¼
     *
     * @param user
     * @return ��¼�ɹ����� User ����ʧ�ܷ��� null
     **/
    User login(User user);

    /**
     * ��ѯ�����û�
     *
     * @return ��ѯ�������� User ����� list
     **/
    List<User> selectAllUser();

    /**
     * �����û�
     *
     * @param user
     **/
    void addUser(User user);

    /**
     * �����û�
     *
     * @param user
     **/
    void updateUser(User user);

    /**
     * ɾ���û�
     *
     * @param id���û� id��
     **/
    void deleteUser(Integer id);
}