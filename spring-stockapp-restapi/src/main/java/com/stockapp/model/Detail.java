package com.stockapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Detail {

	@Id
	@GeneratedValue(generator = "detail_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "detail_gen", initialValue = 1, allocationSize = 1)
	private Integer stockdetailId;
	
	private String stockType; // NSE BSE
	private double stockCurrentPrice; // price
	

}
