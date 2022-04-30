package edu.wright.airviewer2;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMergePDFs {
	
	MergePDFs mergeObj = null;

	@Before
	public void setUp() throws Exception {
		
		mergeObj = new MergePDFs("C:\\Users\\SNEHA RAO\\Downloads\\TestPDF.pdf","C:\\Users\\SNEHA RAO\\Downloads\\sample.pdf");
	}

	@After
	public void tearDown() throws Exception {
		
		mergeObj = null;
	}

	@Test
	public void test() throws IOException {
		mergeObj.merge();
	}

}
