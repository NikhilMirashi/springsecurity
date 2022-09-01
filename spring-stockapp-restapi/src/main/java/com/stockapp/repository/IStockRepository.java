package com.stockapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockapp.model.Stock;

@Repository
public interface IStockRepository extends JpaRepository<Stock, Integer> {

	
}
