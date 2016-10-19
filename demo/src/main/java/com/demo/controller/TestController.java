package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {

	@RequestMapping(value="/test",method=RequestMethod.GET)
	@ResponseBody
	public Object test(String id){
		Map<String,Object> result=new HashMap<String,Object>();
		result.put("id", id);
		return result;
	}
}
