package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Address;
import com.demo.service.AddressService;


@Controller
public class TestController {

	@Autowired
	private AddressService addressService;
	
	@RequestMapping(value="/addresses",method=RequestMethod.GET)
	@ResponseBody
	public Object test(Address address){
		return addressService.getAddressList(address);
	}
}
