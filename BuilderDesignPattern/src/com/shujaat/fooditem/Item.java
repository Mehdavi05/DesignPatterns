package com.shujaat.fooditem;

import com.shujaat.packing.Packing;

public interface Item 
{
	public String name();
	public Packing packing();
	public float price();
}
