package com.shiyanlou.mapper;

import java.util.List;

import com.shiyanlou.model.User;

public interface UserMapper {
	/**
     * �û���¼��ѯ
     *
     * @param user
     * @return User
     **/
	 User selectLogin(User user);
	 
	 /**
	  * ����id��ѯ�����û�
	  * 
	  * @return  List<User>
	  */
	 User selectUserById(Integer id);
	 
	 /**
	  * ��ѯȫ���û�
	  * 
	  * @return  List<User>
	  */
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
	  */
	 void updateUser(User user);
	 
	 /**
	  * ɾ���û�
	  * 
	  * @param id
	  */
	 void deleteUser(Integer id);
	
	

}
