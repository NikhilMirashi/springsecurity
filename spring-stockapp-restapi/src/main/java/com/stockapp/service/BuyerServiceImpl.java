package com.stockapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockapp.repository.IBuyerRepository;

@Service
public class BuyerServiceImpl implements IBuyerService {

	IBuyerRepository buyerRepository;
	@Autowired
	public void setBuyerRepository(IBuyerRepository buyerRepository) {
		this.buyerRepository = buyerRepository;
	}
	
	
}
