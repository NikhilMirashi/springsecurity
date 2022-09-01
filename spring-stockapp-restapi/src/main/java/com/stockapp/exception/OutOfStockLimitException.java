package com.stockapp.exception;

public class OutOfStockLimitException extends StockNotFoundException{

	public OutOfStockLimitException() {
		super();
	}

	public OutOfStockLimitException(String message) {
		super(message);
	}
	

}
