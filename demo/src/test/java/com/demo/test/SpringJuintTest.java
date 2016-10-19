package com.demo.test;

import java.io.FileNotFoundException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

import com.demo.dao.AddressDao;
import com.demo.model.Address;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/spring-mvc.xml"})
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
	AddressDao addressDao;
	
	@Test
	public void test(){
		Address address=new Address();
		//address.setId("2");
		//address.setId(0);
		address.setName("");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(addressDao.insertAddress(address));
		System.out.println("========================");
		System.out.println(address.getId());
		System.out.println("========================");
		//System.out.println(testController.test("2").toString());
	}
}
