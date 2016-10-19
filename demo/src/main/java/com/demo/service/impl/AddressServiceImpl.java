package com.demo.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.AddressDao;
import com.demo.model.Address;
import com.demo.service.AddressService;


@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	private AddressDao addressDao;
	

	@Override
	public Integer insertAddress(Address address) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Address> getAddressList(Address address) {
		// TODO Auto-generated method stub
		return addressDao.getAddressList(address);
	}

}
