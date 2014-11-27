package com.wineaccess.ApplicationUtil;

import java.io.IOException;

import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class PdfGeneratorUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PDDocument document = new PDDocument();
		PDPage page = new PDPage();
		document.addPage(page);
		try {
			PDFont font = PDType1Font.HELVETICA_BOLD;

			// Start a new content stream which will "hold" the to be created content
			PDPageContentStream contentStream = new PDPageContentStream(document, page);

			// Define a text content stream using the selected font, moving the cursor and drawing the text "Hello World"
			contentStream.beginText();
			contentStream.setFont( font, 12 );
			contentStream.moveTextPositionByAmount( 100, 700 );
			contentStream.drawString( "Hello World" );
			contentStream.endText();

			// Make sure that the content stream is closed:
			contentStream.close();

			// Save the results and ensure that the document is properly closed:
			document.save( "D:\\Hello World.pdf");
			document.close();
		} catch (COSVisitorException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		

	}

}
