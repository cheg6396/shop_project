package shop.com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import shop.com.dao.MemberDao;
import shop.com.vo.MemberVo;

@WebServlet("/login.do")
public class MemberLogin extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		boolean login=false;
		String id=req.getParameter("id");
		String pw=req.getParameter("pw");
		
		MemberVo mem = null;
		MemberDao memDao = new MemberDao();
		
		try {
			mem=memDao.login(id,pw);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		HttpSession session=req.getSession();
		
		if(mem!=null) {
			session.setAttribute("id", mem.getId());
			session.setAttribute("name", mem.getName());
			session.setAttribute("grade", mem.getGrade());
			login=true;
		}else {
			session.setAttribute("id", id);
		}
		
		session.setAttribute("login", login);
		
		String redirect_page=req.getContextPath()+((login)?"/":"/login.do");
		resp.sendRedirect(redirect_page);
	}
	
}
