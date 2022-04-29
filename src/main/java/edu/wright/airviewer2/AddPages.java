package edu.wright.airviewer2;

import com.google.java.contract.Ensures;
import com.google.java.contract.Invariant;
import com.google.java.contract.Requires;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;


/**
 * In this method the object, numberofpages must be integer and not equal to zero.
*The object number will show how many pages is going to add in a PDF.
*Through the filepath the method can retrieve the PDF and add the blank pages to it.
*@invariant ("numberOfPages != null && numberOfPages.length() > 0")
*@author kartheek kodati
*/


@Invariant("numberOfPages != null && numberOfPages.length() > 0")
public class AddPages {
	
	int numberOfPages;
	String filePath;
	
	
/**
 * This constructor initialize the object filepath and numberofpages in the AddPages class(). 
 * @pre ("numberOfPages != null && numberOfPages.length() > 0")
 * @param path
 * @param number
 */
	
@Requires("numberOfPages != null && numberOfPages.length() > 0")
	public AddPages(String filePath, int numberOfPages) {
		this.filePath = filePath;
		this.numberOfPages = numberOfPages;
		
	}

public AddPages(String pdfPath, String text) {
	// TODO Auto-generated constructor stub
}

public AddPages(String string) {
	// TODO Auto-generated constructor stub
}

/**
 * This method addPages() create the blank page and then adds number of blank pages
   at the end of the PDF
 * Finally, this method will save and close the PDF.

 
 * 
 * @pre ("NumberOfPages >= 1.0")
 * @post ("result == true")
 * @return
 * @throws IOException
 */
    
@Requires("NumberOfPages >= 1.0")
@Ensures("result == true")
	
public boolean AddPages() throws IOException { 	
	
	boolean result = false;
	     
	//Creating PDF document object 
    PDDocument document = new PDDocument();

    for (int i=0; i<10; i++) {
       //Creating a blank page 
       PDPage blankPage = new PDPage();

       //Adding the blank page to the document
       document.addPage( blankPage );
    } 
   
    //Saving the document
    document.save(filePath+"-1addPage.pdf");
    System.out.println("Blank pages added");
    
  //Closing the document
    document.close();
    
    result = true;
   
return  true;
 }  
} 