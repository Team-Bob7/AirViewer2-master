package edu.wright.airviewer2;

    import org.apache.pdfbox.multipdf.Splitter; 


	import org.apache.pdfbox.pdmodel.PDDocument;

import com.google.java.contract.Ensures;
import com.google.java.contract.Invariant;
import com.google.java.contract.Requires;

import java.io.File; 
	import java.io.IOException; 
	import java.util.List; 
	import java.util.Iterator;
	
	
	/**
	 * In this method the object, numberofpages must be greater than 1 and integer.
	*The object filepath will show the path of the file to split the PDF into new PDFs.
	*@invariant ("numberOfPages != null && numberOfPages.length() > 1")
	*@author sneha rao
	*/
	
	@Invariant("numberOfPages != null && numberOfPages.length() > 1")  
	
	public class split {
		
		String filepath;
		String numberOfPages;

		/**
		 * This constructor initialize the objects like filepath and numberofpages in the split class(). 
		 * @param numberOfPages 
		 * @pre ("numberOfPages != null && numberOfPages.length() > 1")
		 * @param filepath
		 * @param number
		 */
    @Requires("numberOfPages != null && numberOfPages.length() > 1") 
	public split(String filepath, String numberOfPages) {
		this.filepath = filepath;
		this.numberOfPages = numberOfPages;
    }
    public split(String string) {
			// TODO Auto-generated constructor stub
		}
	/**
     * This method split() will create the new PDFs according to the number 
     of pages are in the give  filepath of the PDF.
     * Finally, this method save each page as an individual PDF.
     * @pre ("NumberOfPages >= 2.0")
     * @post ("result == true")
     * @return
     * @throws IOException
     */        
    @Requires("file.pages() > 0 && file != null") 
	@Ensures("result == true")

    public boolean split() throws IOException { 	
    	
    	boolean result = false;
     

		   
		   
		   
	      //Loading an existing PDF document
	      File file1 = new File("filepath");
	      PDDocument document = PDDocument.load(file1); 
	      
	      //Instantiating Splitter class
	      Splitter splitter = new Splitter();

	      //splitting the pages of a PDF document
	      List<PDDocument> Pages = splitter.split(document);
 
	      //Creating an iterator 
	      Iterator<PDDocument> iterator = Pages.listIterator();
	      

	      //Saving each page as an individual document
	      int i = 1;
	      while(iterator.hasNext()){ 
	         PDDocument pd = iterator.next();
	         pd.save("filepath"+ i++ +".pdf");
	      }
	      System.out.println("Multiple PDF’s created");
	      document.close();
	      

	      result = true;
	     
	  return  true;
	     

    }
	}
	      
	
