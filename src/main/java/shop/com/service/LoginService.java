package shop.com.service;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import shop.com.dao.MemberDao;
import shop.com.vo.MemberVo;

@WebServlet("/login.do")
public class LoginService extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		StringBuffer jb=new StringBuffer();
		String line=null;
		BufferedReader reader = req.getReader();
		while((line=reader.readLine())!=null) {
			jb.append(line);
		}
		
		JSONObject json = new JSONObject(jb.toString());
		
		MemberVo mem = new MemberVo();
		mem.setId(json.getString("id"));
		mem.setPw(json.getString("pw"));
		mem.setGrade(Byte.parseByte(json.getString("grade")));
		
		boolean login=false;
		
		MemberDao memDao = new MemberDao();
		
	}
}
