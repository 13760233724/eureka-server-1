package com.htxk.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaServerApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("***************************************************");
		List<String> list = new ArrayList<String>();
		Collections.unmodifiableList(list);
	}

}