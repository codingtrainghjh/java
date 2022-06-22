package connect;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DAO;

public class ConnectDAO extends DAO{
	private static ConnectDAO ConnectDAO = null;
	private ConnectDAO() {}
	public static ConnectDAO getInstance() {
		if(ConnectDAO == null) {
			ConnectDAO = new ConnectDAO();
		}
		return ConnectDAO;
	}
	//전체조회
	public List<Connect> selectAllBooks() {
		List<Connect> list = new ArrayList<Connect>();
		try {
			connect();
			String sql = "SELECT * FROM books ORDER BY book_name";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Connect con = new Connect();
				con.setBookName(rs.getString("book_name"));
				con.setBookWriter(rs.getString("book_writer"));
				con.setBookContent(rs.getString("book_content"));
				con.setBookRental(rs.getInt("book_rental"));
				
				list.add(con);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
	//단건조회
	public Connect selectOne(String bookName) {
		Connect con = null;
		try {
			connect();
			String sql = "SElECT * FROM books WHERE book_name = '" + bookName + "'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				con = new Connect();
				con.setBookName(rs.getString("book_name"));
				con.setBookWriter(rs.getString("book_writer"));
				con.setBookContent(rs.getString("book_content"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return con;
	}
	//내용검색
	public List<Connect> searchContent() {
		List<Connect> list = new ArrayList<Connect>();
		try {
			connect();
			String sql = "SELECT * FROM books WHERE book_content LIKE = '%'||?||'%'";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Connect con = new Connect();
				con.setBookName(rs.getString("book_name"));
				con.setBookWriter(rs.getString("book_writer"));
				con.setBookContent(rs.getString("book_content"));
				
				list.add(con);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
}
