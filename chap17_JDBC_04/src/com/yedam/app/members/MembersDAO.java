package com.yedam.app.members;

import java.sql.SQLException;

import com.yedam.app.common.DAO;

public class MembersDAO extends DAO {
	//싱글톤
	private static MembersDAO dao = null;
	private MembersDAO() {}
	public static MembersDAO getInstance() {
		if(dao == null) {
			dao = new MembersDAO();
		}
		return dao;
	}
	//CRUD
	public Member selectOne(Member member) {
		Member loginInfo = null;
		try {
			connect();
			String sql = "SELECT * FROM members WHERE member_id = '" + member.getMemberId() + "'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				//아이디 존재
				if(rs.getString("member_password").equals(member.getMemberPassword())) {
					//비밀번호 일치
					// -> 로그인 성공
					loginInfo = new Member();
					loginInfo.setMemberId(rs.getString("member_id"));
					loginInfo.setMemberPassword(rs.getString("member_password"));
					loginInfo.setMemberRole(rs.getInt("member_role"));
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			
		}else {
			System.out.println("아이디가 존재하지 않습니다.");
		}
			
		}catch(SQLException e) {
			e.printStackTrace();	
		}finally {
			disconnect();
		}
		return loginInfo;
	}
	//시퀀스 BOARD_NO_SEQ, MEMBER_USER_ID_SEQ
}
