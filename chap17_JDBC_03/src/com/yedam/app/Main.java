package com.yedam.app;

import java.util.List;

import com.yedam.app.history.History;
import com.yedam.app.history.HistoryDAO;
import com.yedam.app.product.Product;
import com.yedam.app.product.ProductDAO;

public class Main {

	public static void main(String[] args) {
		new StockManagement();
		}
		
		// 나도 test
//		History history = new History();
//		history.setProductId(1);
//		history.setProductCategory(1);
//		history.setProductAmount(1000);
//		
//		HistoryDAO.getInstance().insert(history);
//		HistoryDAO.getInstance().update(history);
//		HistoryDAO.getInstance().delete(history);

	}


