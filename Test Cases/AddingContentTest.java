package edu.wright.airviewer2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AddingContentTest {
	
	AddingContent AddingContentObj = null;

	@Before
	public void setUp() throws Exception {
		
		AddingContentObj = new AddingContent("C:\\Users\\SNEHA RAO\\Downloads\\sample.pdf");
	}

	@After
	public void tearDown() throws Exception {
		AddingContentObj = null;
	}

	@Test
	public void test() {
		
	}

}
