package com.stockapp.service;

import java.util.List;

import com.stockapp.model.Buyer;

public interface IBuyerService {

	//("slect * from Buyer where stockname=?")
	List<Buyer> getByStockName(String stockName);
}
