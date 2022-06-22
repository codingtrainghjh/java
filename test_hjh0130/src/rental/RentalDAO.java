package rental;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import connect.Connect;
import dao.DAO;

public class RentalDAO extends DAO{
	private static RentalDAO RentalDAO = null;
	private RentalDAO() {}
	public static RentalDAO getInstance() {
		if(RentalDAO == null) {
			RentalDAO = new RentalDAO();
		}
		return RentalDAO;
	}
	//대여가능
	public List<Rental> selectAllBooks() {
		List<Rental> list = new ArrayList<Rental>();
		try {
			connect();
			String sql = "SELECT * FROM books WHERE book_rental = 0";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
			
				Rental ren = new Rental();
				ren.setBookName(rs.getString("book_name"));
				ren.setBookWriter(rs.getString("book_writer"));
				ren.setBookContent(rs.getString("book_content"));
				ren.setBookRental(rs.getInt("book_rental"));
				
				list.add(ren);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
	//책 대여
	public void rental(Rental rental) {
		try {
			connect();
			String sql = "UPDATE books SET";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, rental.getBookName());
			pstmt.setInt(2, rental.getBookRental());
			
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
	//책 반납
	//책 등록
}
