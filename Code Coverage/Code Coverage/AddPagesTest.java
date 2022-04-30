package edu.wright.airviewer2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AddPagesTest {
	
	AddPages AddPagesObj = null;

	@Before
	public void setUp() throws Exception {
		
		AddPagesObj = new AddPages("C:\\Users\\SNEHA RAO\\Downloads\\sample.pdf");
	}

	@After
	public void tearDown() throws Exception {
		
		 AddPagesObj = null;
	}

	@Test
	public void test() {
		
	}

}

