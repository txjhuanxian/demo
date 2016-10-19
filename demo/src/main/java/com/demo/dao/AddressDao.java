package com.demo.dao;

import java.util.List;
import java.util.Map;

import com.demo.model.Address;

public  interface AddressDao {
	
	
	public Integer insertAddress(Address address);

	public List<Address> getAddressList(Address address);
}
