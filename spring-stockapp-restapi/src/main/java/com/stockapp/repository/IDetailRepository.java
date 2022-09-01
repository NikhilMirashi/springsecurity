package com.stockapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockapp.model.Detail;

@Repository
public interface IDetailRepository extends JpaRepository<Detail, Integer> {

}
