package com.stockapp.service;

import com.stockapp.model.Stock;

public interface IDetailService {
	
	//derived querry
	Stock getByStockType(String stockType);
	Stock getByStockCurrentPrice(double price);
	
}
