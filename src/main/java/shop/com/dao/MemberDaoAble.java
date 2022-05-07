package shop.com.dao;

import java.sql.SQLException;
import java.util.List;

import shop.com.vo.MemberVo;

public interface MemberDaoAble {
	public MemberVo login(String id, String pw) throws ClassNotFoundException, SQLException;
	public MemberVo detail(String id) throws ClassNotFoundException, SQLException; //관리자 수정, 개인 정보 수정 페이지, 개인 정보 상세 페이지
	public boolean insert(MemberVo mem) throws ClassNotFoundException, SQLException; //회원 등록, 회원가입
	public boolean update(MemberVo mem) throws ClassNotFoundException, SQLException; //회원 수정, 개인 정보 수정
	public boolean delete(String id) throws ClassNotFoundException, SQLException; //회원 삭제=>위험(참조하고 있는 정보가 많아서 위험함) 삭제보다는 정보 업데이트로.
}
