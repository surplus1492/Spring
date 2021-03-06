package kr.co.Sboard.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.Sboard.vo.MemberVo;

@Repository
public interface UserDao {

	public void insertUser(MemberVo vo);
	public List<MemberVo> selectUsers();
	public MemberVo selectUser(MemberVo vo);
	public void updateUser(String uid);
	public void deleteUser(String uid);
	
}
