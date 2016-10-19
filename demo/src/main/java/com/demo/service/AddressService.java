package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.model.Address;

public interface AddressService {

	public  List<Address> getAddressList(Address address);
	
	public Integer insertAddress(Address address);
}
