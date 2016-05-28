package com.shujaat.main;

import com.shujaat.order.BuyStock;
import com.shujaat.order.SellStock;

public class CommandPatternDemo {

	public static void main(String[] args) 
	{
		  Stock abcStock = new Stock();
		  
	      BuyStock buyStockOrder   = new BuyStock(abcStock);
	      SellStock sellStockOrder = new SellStock(abcStock);
	      
	      Broker broker = new Broker();
	      
	      broker.takeOrder(buyStockOrder);
	      broker.takeOrder(sellStockOrder);
	      
	      broker.placeOrders();
	}

}
