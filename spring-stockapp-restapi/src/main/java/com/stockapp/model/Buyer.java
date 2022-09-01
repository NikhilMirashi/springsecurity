package com.stockapp.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Buyer {

	private String buyerName; //buyername
	
	@Id
	@GeneratedValue(generator = "buyer_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "buyer_gen", initialValue = 1, allocationSize = 1)
	private Integer buyerId; //buyerid
	private long accountNumber;//buyer account no
	private String emailId; //buyer mailid
	
	private int stockQuantity; //amount of stock brought
	
	@ManyToMany(fetch = FetchType.EAGER, mappedBy = "buyer")
	private Set<Stock> stock;
	
}
