package com.yedam.java.member;

import java.sql.Date;
import java.sql.SQLException;

import com.yedam.java.common.DAO;

public class MemberDAO extends DAO{
	private static MemberDAO dao = null;
	private MemberDAO() {}
	public static MemberDAO getInstance() {
		if(dao == null) {
			dao = new MemberDAO();
		}
		return dao;
	}
	public Member selectOne(Member member) {
		Member loginInfo = null;
		try {
			connect();
			String sql = "SELECT * FROM member WHERE user_name = '" + member.getUserName() + "'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				//아이디 존재
				if(rs.getString("passwd").equals(member.getPassWd())) {
					//비밀번호 일치
					// -> 로그인 성공
					loginInfo = new Member();
					loginInfo.setUserId(rs.getInt("user_id"));
					loginInfo.setUserName(rs.getString("user_name"));
					loginInfo.setPassWd(rs.getString("passwd"));
					loginInfo.setRegDate(rs.getDate("reg_date"));
					loginInfo.setInterest(rs.getString("interest"));
					loginInfo.setEMail(rs.getString("email"));
					
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
	
	//회원가입
	public void signUp(Member member) {
		try {
			connect();
			String sql = "INSERT INTO member VALUES (MEMBER_USER_ID_SEQ.nextval, ?, ?, SYSDATE, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getUserName());
			pstmt.setString(2, member.getPassWd());
			pstmt.setString(3, member.getInterest());
			pstmt.setString(4, member.getEMail());
			
			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("가입을 축하드립니다!");
			} else {
				System.out.println("오류가 발생했습니다. 죄송합니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	public Member search(String username) {
		Member member = null;
		try {
			connect();
			String sql = "SELECT * FROM member WHERE user_name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				member = new Member();
				member.setUserName(rs.getString("user_name"));
				member.setPassWd(rs.getString("passwd"));
				member.setInterest(rs.getString("interest"));
				member.setEMail(rs.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return member;
	}
	public void delete(String username) {
		try {
			connect();
			String sql = "DELETE FROM member WHERE user_name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			rs = pstmt.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
}
