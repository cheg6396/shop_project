package shop.com.dao;

import java.sql.SQLException;
import java.util.List;

import shop.com.vo.MemberVo;

public interface MemberDaoAble {
	public MemberVo login(String id, String pw) throws ClassNotFoundException, SQLException;
	public MemberVo detail(String id) throws ClassNotFoundException, SQLException; //������ ����, ���� ���� ���� ������, ���� ���� �� ������
	public boolean insert(MemberVo mem) throws ClassNotFoundException, SQLException; //ȸ�� ���, ȸ������
	public boolean update(MemberVo mem) throws ClassNotFoundException, SQLException; //ȸ�� ����, ���� ���� ����
	public boolean delete(String id) throws ClassNotFoundException, SQLException; //ȸ�� ����=>����(�����ϰ� �ִ� ������ ���Ƽ� ������) �������ٴ� ���� ������Ʈ��.
}
