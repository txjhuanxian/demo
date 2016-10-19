package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.dao.AddressDao;


@Controller
public class TestController {

	@Autowired
	private AddressDao addressDao;
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	@ResponseBody
	public Object test(Map<String,Object> params){
		return addressDao.getList(params);
	}
}
