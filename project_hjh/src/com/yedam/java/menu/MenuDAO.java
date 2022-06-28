package com.yedam.java.menu;

import java.sql.SQLException;

import com.yedam.java.common.DAO;

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
		public Menu recommend(String cateGorize, String cateGorize2) {
			Menu result = null;
			try {
				connect();
				String sql = "SELECT * FROM launch WHERE categorize = (SELECT categorize FROM menu WHERE categorizeNo = ?)"
						+"AND categorize2 = (SELECT categorize2 FROM menu2 WHERE categorize2NO = ?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, cateGorize);
				pstmt.setString(2, cateGorize2);
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					result = new Menu();
					result.setFoodName(rs.getString("food_name"));
					result.setTaste(rs.getString("taste"));
					result.setPrice(rs.getString("price"));
					result.setRName(rs.getString("restaurant_name"));
					result.setRHP(rs.getString("restaurant_hp"));
				}
				
			
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				disconnect();
			}
			return result ;
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
		// 메뉴삭제
		public void deletemenu(Menu menu) {
			try {
				connect();
				String sql = "DELETE FROM launch WHERE rName = ? AND food_name = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, menu.getRName());
				pstmt.setString(2, menu.getFoodName());
				
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

