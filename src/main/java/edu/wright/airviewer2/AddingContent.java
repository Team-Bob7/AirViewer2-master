package edu.wright.airviewer2;

import java.io.File; 

import java.io.IOException;
  
import org.apache.pdfbox.pdmodel.PDDocument; 
import org.apache.pdfbox.pdmodel.PDPage; 
import org.apache.pdfbox.pdmodel.PDPageContentStream; 
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import com.google.java.contract.Ensures;
import com.google.java.contract.Invariant;
import com.google.java.contract.Requires;

/**
 * In this method, content is the object and it should not be empty.
*Not only numbers but also words can be added in the content.
*Through the filepath the method can insert the content at any place in the PDF.
*@invariant ("filepath.content() > 0 && filepath != null")
*@author kartheek kodati
*/  
@Invariant("filepath.content() > 0 && filepath != null")  

public class AddingContent {
	
	String content;
	String filepath;
	
/**
 * This constructor initialize the objects of filepath and content in the AddinContent class(). 
 * @pre ("filepath.content() > 0 && filepath != null")
 * @param path
 * @param number
 */

@Requires("filepath.content() > 0 && filepath != null") 
public AddingContent(String path, String content) {
	this.filepath = filepath;
	this.content = content;
}
public AddingContent(String string) {
	// TODO Auto-generated constructor stub
}
/**
 * This method split() Load the document and retrieve the pages then set the position of the 
  line in which content is added.
 * Finally, this method will close the stream and save the PDF.

 
 * 
 * @pre ("content >= 1.0")
 * @post ("result == true")
 * @return
 * @throws IOException
 */

@Ensures("result == true")

   public static void main (String args[]) throws IOException {

      //Loading an existing document
      File file = new File("filepath");
      PDDocument document = PDDocument.load(file);
       
      //Retrieving the pages of the document 
      PDPage page = document.getPage(1);
      PDPageContentStream contentStream = new PDPageContentStream(document, page);
      
      //Begin the Content stream 
      contentStream.beginText(); 
       
      //Setting the font to the Content stream  
      contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);

      //Setting the position for the line 
      contentStream.newLineAtOffset(25, 500);

      String text = "This is the software engineering Agile project.";

      //Adding text in the form of string 
      contentStream.showText(text);      

      //Ending the content stream
      contentStream.endText();

      System.out.println("Content added");

      //Closing the content stream
      contentStream.close();

      //Saving the document
      document.save(new File("filepath"));

      //Closing the document
      document.close();
   }
public void AddingContent() {
	// TODO Auto-generated method stub
	


	
}
}

