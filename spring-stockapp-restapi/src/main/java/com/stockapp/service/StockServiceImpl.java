package com.stockapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockapp.repository.IStockRepository;

@Service
public class StockServiceImpl implements IStockService {

	IStockRepository stockRepository;
	@Autowired
	public void setStockRepository(IStockRepository stockRepository) {
		this.stockRepository = stockRepository;
	}
	
}
