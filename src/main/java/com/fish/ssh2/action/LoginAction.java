package com.fish.ssh2.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;

import com.fish.ssh2.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private static final Log logger = LogFactory.getLog(LoginAction.class);
	
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public String execute() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();

		System.out.println(request.getCharacterEncoding());

		if ("root".equals(user.getName())
				&& "root123".equals(user.getPassword())) {
			Map session = ActionContext.getContext().getSession();
			session.put("user.name", user.getName());

			logger.info("登录成功,用户名=" + user.getName());
			return "success";
		}

		System.out.println("登录失败，用户名=" + user.getName());
		return "fail";
	}

}
