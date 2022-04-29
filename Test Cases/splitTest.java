package edu.wright.airviewer2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class splitTest {
	
	split splitObj = null;

	@Before
	public void setUp() throws Exception {
		
		splitObj = new split("C:\\Users\\SNEHA RAO\\Downloads\\sample.pdf");
	}

	@After
	public void tearDown() throws Exception {
		splitObj = null;
	}

	@Test
	public void test() {
		
	}

}


