package com.stockapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockapp.model.Term;

@Repository
public interface ITermRepository extends JpaRepository<Term, Integer> {

}
