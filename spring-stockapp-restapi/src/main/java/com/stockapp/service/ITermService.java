package com.stockapp.service;

import java.util.List;

import com.stockapp.model.Stock;

public interface ITermService {

	List<Stock> getBytermName(String termName);
}
