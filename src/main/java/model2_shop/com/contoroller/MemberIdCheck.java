package model2_shop.com.contoroller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model2_shop.com.dao.MemberDao;
import model2_shop.com.vo.MemberVo;
@WebServlet("/mem/id_check.do")
public class MemberIdCheck extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException {
		System.out.println("테스트");
		String id=req.getParameter("id");
		MemberDao memDao=new MemberDao();
		
		resp.setContentType("json/application; charset=UTF-8");
		//java�뿉 JSON �씪�씠釉뚮윭由ш� �뾾�뼱�꽌 異붽��빐�꽌 �궗�슜�빐�빞�븳�떎. 
		
		MemberVo mem=null;
		try {
			mem=memDao.detail(id);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		if(mem.getId()==null) {
			resp.getWriter().append("{ \"id_check\" : true}");
		}else {
			resp.getWriter().append("{ \"id_check\" : false}");
		}
	}
}
