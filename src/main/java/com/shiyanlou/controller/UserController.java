package com.shiyanlou.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.ibatis.annotations.Param;
import com.shiyanlou.model.User;
import com.shiyanlou.service.UserService;

/**
 * �����û����� Controller
 **/
@Controller
public class UserController {
	/**
     * �Զ�ע�� UserService
     **/
	@Autowired
	private UserService userService;
	
	// ��¼
	@RequestMapping("/login")
	public String login(User user,Model model,HttpSession session) {
		User loginUser = userService.login(user);
		if(loginUser != null) {
			session.setAttribute("user", loginUser);
			return "redirect:alluser";
		}else {
			session.setAttribute("message", "username or password is wrong");
			return "redirect:loginform.jsp";
		}
	}
	
	//�˳�
	@RequestMapping("/loginout")
	public String loginout(HttpSession session) {
		session.invalidate();
		return "redirect:loginform.jsp";
	}
	
	// ��ѯ�����û�
	@RequestMapping("alluser")
	public String selectAllUser(HttpServletRequest request) {
		List<User> listUser = userService.selectAllUser();
		request.setAttribute("listUser", listUser);
		return "userlist";
	}
	
	// ��ת�������û�ҳ��
    @RequestMapping("/toadduser")
    public String toAddUserPage() {
        return "adduser";
    }
    
    // �����û�    
    @RequestMapping("/adduser")
    public String addUser(User user,HttpServletRequest request) {
    	userService.addUser(user);
    	List<User> listUser = userService.selectAllUser();
		request.setAttribute("listUser", listUser);
		return "userlist";
    }
    
    // ��ת�������û�ҳ��
    @RequestMapping("/toupdateuser")
    public String toUpdateUser(@Param("id") Integer id,
                               HttpServletRequest request, Model model) {
        model.addAttribute("user_id", id);
        return "updateuser";
    }
    
    // �����û�
    @RequestMapping("/updateuser")
    public String updateUser(User user, HttpServletRequest request) {
        userService.updateUser(user);
        List<User> listUser = userService.selectAllUser();
        request.setAttribute("listUser", listUser);
        return "userlist";
    }

    // ɾ���û�
    @RequestMapping("/deleteuser")
    public String deleteUser(@Param("id") Integer id, HttpServletRequest request) {
        userService.deleteUser(id);
        List<User> listUser = userService.selectAllUser();
        request.setAttribute("listUser", listUser);
        return "userlist";
    }
    
}
