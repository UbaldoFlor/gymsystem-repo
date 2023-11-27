package com.gymsystem.dao;

import java.util.List;

public interface Storage {
	public List<Object> getData();
	
	public void storeData(List<Object> data);
}
