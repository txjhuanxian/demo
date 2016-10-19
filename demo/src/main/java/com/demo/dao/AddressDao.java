package com.demo.dao;

import java.util.List;
import java.util.Map;

import com.demo.model.Address;

public  interface AddressDao {
	
	public  List<Address> getList(Map<String,Object> params);
	
	public Integer insertAddress(Address address);
}
