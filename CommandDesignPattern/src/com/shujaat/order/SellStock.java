package com.shujaat.order;

import com.shujaat.main.Stock;

public class SellStock implements Order 
{
	   private Stock abcStock;
	   
	   public SellStock(Stock abcStock)
	   {
	      this.abcStock = abcStock;
	}
	   
	   public void execute() 
	   {
	      abcStock.sell();
	}
}
