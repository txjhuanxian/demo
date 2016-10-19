package com.demo.test;

import java.io.FileNotFoundException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

import com.demo.controller.TestController;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath*:/spring-mvc.xml"})
public class SpringJuintTest {
	
	static{
		try {
			
			//System.out.println(SpringJuintTest.class.getResource("/").getPath());
			Log4jConfigurer.initLogging("classpath:conf/log4j.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

	@Autowired
	TestController testController;
	
	//@Test
	public void test(){
		System.out.println(testController.test("2").toString());
	}
}
