package com.yedam.app.history;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.yedam.app.common.DAO;
import com.yedam.app.product.Product;

public class HistoryDAO extends DAO {
	//싱글톤
	private static HistoryDAO historyDAO = null;
	private HistoryDAO() {}
	public static HistoryDAO getInstance() {
		if(historyDAO == null) {
			historyDAO = new HistoryDAO();
		}
		return historyDAO;
	}
	
	//CRUD
	//등록
	public void insert(History history) {
		try {
			connect();
			String sql = "INSERT INTO product_history VALUES (?, ?, ?)"; // 시퀀스를 가져와야 함
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, history.getProductId());
			pstmt.setInt(2, history.getProductCategory());
			pstmt.setInt(3, history.getProductAmount());
			
			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("정상적으로 삽입되었습니다.");
			} else {
				System.out.println("정상적으로 삽입되지 않았습니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	//수정 - 수량
	public void update(History history) {
		try {
			connect();
			String sql = "UPDATE product_history SET product_amount = ? WHERE product_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, history.getProductAmount());
			pstmt.setInt(2, history.getProductId());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println(result + "정상적으로 수정되었습니다.");
			} else {
				System.out.println("정상적으로 수정되지 않았습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	//삭제
	public void delete(History history) {
		try {
			connect();
			String sql = "DELETE FROM product_history WHERE product_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, history.getProductId());
			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println(result + "정상적으로 삭제되었습니다.");
			} else {
				System.out.println("정상적으로 삭제되지 않았습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	//단건조회 - 각 상품에 대한 입고량 //조회만 할것이므로 정수값만 진행
	public int selectInAmount(int productId) {
		int result = 0;
		try {
			connect();
			String sql = "SELECT SUM(product_amount) as sum FROM product_history "
					+ "WHERE product_id = ? AND product_category = 1";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, productId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = rs.getInt("sum");//("SUM(product_amount)"); 정석
				//result = rs.getInt(1); 번호
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}
	//단건조회 - 각 상품에 대한 출고량
	public int selectOutAmount(int productId) {
		int result = 0;
		try {
			connect();
			String sql = "SELECT SUM(product_amount) FROM product_history "
					+ "WHERE product_id = ? AND product_category = 2";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, productId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = rs.getInt("SUM(product_amount)");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}
	//전체조회 - 전체 상품의 각 재고
	public Map selectAllamount() {
		Map<Integer, Integer> list = new HashMap<>();
		try {
			connect();
			// 각 제품에 따른 입고량과 출고량
			String sql = "SELECT product_id, product_category, SUM(product_amount) AS amount FROM product_history GROUP BY product_id, product_category";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			//입고량과 출고량을 분리시키는 작업
			Map<Integer, Integer> inList = new HashMap<>();
			Map<Integer, Integer> outList = new HashMap<>();
			while(rs.next()) {
				
				int category = rs.getInt("product_category");
				if(category == 1) {
					inList.put(rs.getInt("product_id"), rs.getInt("amount"));
				}else {
					outList.put(rs.getInt("product_id"), rs.getInt("amount"));
				}
			}
			
			Set<Integer> keySet = inList.keySet();
			for(int key : keySet) {
				int inAmount = inList.get(key);
				Integer outAmount = outList.get(key);
				if(outAmount != null) {
					list.put(key, (inAmount - outAmount));
				}else {
					list.put(key, inAmount);
				}
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
		return list;
	}
}

