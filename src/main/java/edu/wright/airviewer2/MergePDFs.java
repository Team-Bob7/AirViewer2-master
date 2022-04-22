package edu.wright.airviewer2;

import org.apache.pdfbox.multipdf.PDFMergerUtility; 
import java.io.File;
import java.io.IOException;
import com.google.java.contract.Invariant;

import com.google.java.contract.Requires;

import com.google.java.contract.Ensures;

/**
 * This class takes file1Path and file2Path through constructor to merge the PDFs.
 * Two PDFs can be merged in to one new PDF.
 * @invariant ("file2Path.length() > 0 && file2Path != null")
 * @author SNEHA RAO
 *
 */

@Invariant("file2Path.length() > 0 && file2Path != null")
public class MergePDFs {
  
	String file1Path;
	String file2Path;

	/**
	 * @pre ("file2Path.length() > 0 && file2Path != null")
	 * @param file1Path
	 * @param file2Path
	 */
	
@Requires("file2Path.length() > 0 && file2Path != null")
public MergePDFs(String file1Path, String file2Path) {
		super();
		this.file1Path = file1Path;
		this.file2Path = file2Path;
	}

/**
 * This method is merging two PDFs into one PDF.
 * selecting two different PDFs through destination path and creating a new PDF. 
 * @pre ("file2Path.length() > 0 && file2Path != null")
 * @post ("result == true")
 * @return
 * @throws IOException
 */
@Requires("file2Path.length() > 0 && file2Path != null")
@Ensures("result == true")
public boolean merge() throws IOException {
	
	  boolean result = false;
	  {
      File file1 = new File(file1Path);       
      File file2 = new File(file2Path);    
		
      //Instantiating PDFMergerUtility class
      PDFMergerUtility PDFmerger = new PDFMergerUtility();
		
      //Setting the destination file
      PDFmerger.setDestinationFileName(file1Path);
		
      //adding the source files
      PDFmerger.addSource(file1);
      PDFmerger.addSource(file2);
		
      //Merging the two documents
      PDFmerger.mergeDocuments();
      
      result = true;
      
	  }
      
      return result;
   }

}
