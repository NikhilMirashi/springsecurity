package com.stockapp.model;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Stock {

	@Id
	@GeneratedValue(generator = "stock_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "stock_gen", initialValue = 1, allocationSize = 1)
	private Integer stockId;
	
	private String userName;
	private String password;
	private String stockName;
	
	private double profit;
	private int stockQuantity; // no of quantity
	private int buyerAge;// minimum age requried 18

	// one stock is having one details
	@OneToOne(cascade = CascadeType.ALL)
	private Detail detail;

	// many stock can buy many buyers
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "stock_buyer", joinColumns = @JoinColumn(name = "stock_id"), inverseJoinColumns = @JoinColumn(name = "buyer_id"))
	private Set<Buyer> buyers;
	
	//one stock can have many options
	//like shortterm,longterm
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	Set<Term> term; 
}
