package com.mobile.automation.scripts.original;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;

public class ComapreImages {
	
	public static BufferedImage getDifferenceImage(BufferedImage img1, BufferedImage img2) {
	    int width1 = img1.getWidth(); // Change - getWidth() and getHeight() for BufferedImage
	    int width2 = img2.getWidth(); // take no arguments
	    int height1 = img1.getHeight();
	    int height2 = img2.getHeight();
	    if ((width1 != width2) || (height1 != height2)) {
	        System.err.println("Error: Images dimensions mismatch");
	        System.exit(1);
	    }

	    // NEW - Create output Buffered image of type RGB
	    BufferedImage outImg = new BufferedImage(width1, height1, BufferedImage.TYPE_INT_RGB);

	    // Modified - Changed to int as pixels are ints
	    int diff;
	    int diff2 = 0;
	    int result; // Stores output pixel
	    for (int i = 0; i < height1; i++) {
	        for (int j = 0; j < width1; j++) {
	            int rgb1 = img1.getRGB(j, i);
	            int rgb2 = img2.getRGB(j, i);
	            int r1 = (rgb1 >> 16) & 0xff;
	            int g1 = (rgb1 >> 8) & 0xff;
	            int b1 = (rgb1) & 0xff;
	            int r2 = (rgb2 >> 16) & 0xff;
	            int g2 = (rgb2 >> 8) & 0xff;
	            int b2 = (rgb2) & 0xff;
	            
	            
	            
	            diff = Math.abs(r1 - r2); // Change
	            diff += Math.abs(g1 - g2);
	            diff += Math.abs(b1 - b2);
	            diff/=3;
	            
	            
	           /* diff = Math.abs(r1 - r2); // Change
	            if(diff>0){
	            	diff2=Math.abs(r2);
	            }else{
	            	diff2 = Math.abs(r1 - r2); 
	            }
	            diff += Math.abs(g1 - g2);
	            if(diff>=diff2){
	            	diff2+=Math.abs(g2);
	            }else{
	            	diff2 += Math.abs(g1 - g2);
	            }
	            diff += Math.abs(b1 - b2);
	            if(diff>diff2){
	            	diff2+=Math.abs(b2);
	            }else{
	            	 diff += Math.abs(b1 - b2);
	            }
	            diff /= 3; // Change - Ensure result is between 0 - 255
	            diff2/=3;
	            
	            // Make the difference image gray scale
	            // The RGB components are all the same
	            result = (diff2 << 16) | (diff2 << 8) | diff2;*/
	            
	            result = (diff << 16) | (diff << 8) | diff;
	            if(result!=0){
	            System.out.println(result);
	            }
	            outImg.setRGB(j, i, result); // Set result
	        }
	    }

	    // Now return
	    return outImg;
	}
	
	public static void main(String[] args) throws IOException {
		ComapreImages c=new ComapreImages();
		
		File folder = new File("C:\\photos2\\");
		File[] listOfFiles = folder.listFiles();
		
		File folder1 = new File("C:\\photos\\");
		File[] listOfFiles1 = folder.listFiles();
		
		for(int i=0; i<listOfFiles.length && i<listOfFiles1.length;i++){
			
			if(listOfFiles[i].getName().equals(listOfFiles1[i].getName())){
				File fimg1 = new File("C:\\photos2\\"+listOfFiles[i].getName()+"");
			    BufferedImage img1 = ImageIO.read(fimg1 ); 
				
			    File fimg2 = new File("C:\\photos\\"+listOfFiles[i].getName()+"");
			    BufferedImage img2 = ImageIO.read(fimg2 ); 
				
			    BufferedImage outImg=c.getDifferenceImage(img1, img2);
			    
			    File resultfile=new File("C:\\Utilities\\"+listOfFiles[i].getName()+".png");
			    ImageIO.write(outImg, "png", resultfile);
			}
		}
		
		
	}

}
