package com.library.pdf;

import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;


public class OpenFile {

    /**
     * @param file
     */

    public void fromFile(File file) throws IOException {


        System.out.println("from file");
        PDDocument pd = PDDocument.load(file);


    }

    /**
     *
     * @param stream
     */
    public void fromStream(InputStream stream) throws IOException {

        System.out.println("from stream");
        PDDocument pd = PDDocument.load(stream);


    }


    public void fromBytes(Byte[] bytes) {

        System.out.println("from bytes");
     //   PDDocument pd = PDDocument.load(bytes);


    }


    private void pdfLoad() {


         //PDDocument pd = PDDocument.load(g);
        //PDFRenderer pr = new PDFRenderer (pd);
        //BufferedImage bi = pr.renderImageWithDPI (0, 300);
        // ImageIO.write (bi, "JPEG", new File (out));

    }

}
