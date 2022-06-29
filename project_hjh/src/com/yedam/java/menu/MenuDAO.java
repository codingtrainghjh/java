package com.yedam.java.menu;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.java.common.DAO;
import com.yedam.java.member.Member;

public class MenuDAO extends DAO {
	private static MenuDAO dao = null;

	private MenuDAO() {}

	public static MenuDAO getInstance() {
		if (dao == null) {
			dao = new MenuDAO();
		}
		return dao;
	}
		// 점심추천
		public List<Menu> recommend(String cateGorize, String cateGorize2) {
			Menu result = null;
			List<Menu> list = new ArrayList<Menu>();
			try {
				connect();
				String sql = "SELECT * FROM launch WHERE categorize = (SELECT categorize FROM menu WHERE categorizeNo = ?)"
						+"AND categorize2 = (SELECT categorize2 FROM menu2 WHERE categorize2NO = ?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, cateGorize);
				pstmt.setString(2, cateGorize2);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					result = new Menu();
					result.setFoodName(rs.getString("food_name"));
					result.setTaste(rs.getString("taste"));
					result.setPrice(rs.getString("price"));
					result.setRName(rs.getString("restaurant_name"));
					result.setRHP(rs.getString("restaurant_hp"));
					
					list.add(result);
				}
				
				
			
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				disconnect();
			}
			return list ;
		}
		// 메뉴추가
		public void addmenu(Menu menu) {
			try {
				connect();
				String sql = "INSERT INTO launch VALUES (?, ?, ?, ?, ?, ?, ?)";
				pstmt = conn.prepareStatement(sql);		
				pstmt.setString(1, menu.getFoodName());
				pstmt.setString(2, menu.getTaste());
				pstmt.setString(3, menu.getPrice());
				pstmt.setString(4, menu.getRName());
				pstmt.setString(5, menu.getRHP());
				pstmt.setString(6, menu.getCategorize());
				pstmt.setString(7, menu.getCategorize2());
				
				int result = pstmt.executeUpdate();
				if(result > 0) {
					System.out.println("정상적으로 등록되었습니다.");
				}else {
					System.out.println("정상적으로 등록되지 않았습니다.");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				disconnect();
			}
		}
		// 메뉴찾기
		public Menu search(String foodname, String rname) {
			Menu menu = null;
			try {
				connect();
				String sql = "SELECT * FROM launch WHERE food_name = ? AND restaurant_name = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, foodname);
				pstmt.setString(2, rname);
				
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					menu = new Menu();
					menu.setFoodName(rs.getString("food_name"));
					menu.setTaste(rs.getString("taste"));
					menu.setPrice(rs.getString("price"));
					menu.setRName(rs.getString("restaurant_name"));
					menu.setRHP(rs.getString("restaurant_HP"));
					menu.setCategorize(rs.getString("categorize"));
					menu.setCategorize2(rs.getString("categorize2"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				disconnect();
			}
			return menu;
		}
		
		// 메뉴삭제
		public void deletemenu(Menu menu) {
			try {
				connect();
				String sql = "DELETE FROM launch WHERE food_name = ? AND restaurant_name = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(2, menu.getRName());
				pstmt.setString(1, menu.getFoodName());
				
				int result = pstmt.executeUpdate();
				if(result > 0) {
					System.out.println("정상적으로 삭제되었습니다.");
				}else {
					System.out.println("정상적으로 삭제되지 않았습니다.");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				disconnect();
			}
		}
	}

