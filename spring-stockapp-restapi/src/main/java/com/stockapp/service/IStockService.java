package com.stockapp.service;

import com.stockapp.model.Stock;

public interface IStockService {
	
	//Derived Querry
	void addStock(Stock stock);
	void updateStock(Stock stock);
	void deleteStock(int stockId);
	Stock getByStockId(int stockId);
	double getByprofit();
	
	//Cutomied Querry
	Stock getByStockDetail(int stockId);
	
	
}
