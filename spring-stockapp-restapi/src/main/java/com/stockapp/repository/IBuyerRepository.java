package com.stockapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockapp.model.Buyer;

@Repository
public interface IBuyerRepository extends JpaRepository<Buyer, Integer> {

}
